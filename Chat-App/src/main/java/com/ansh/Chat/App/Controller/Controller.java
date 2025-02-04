package com.ansh.Chat.App.Controller;

import com.ansh.Chat.App.Model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;

@org.springframework.stereotype.Controller
public class Controller {

    @MessageMapping("/chat.getMessage")
            @SendTo("/topic/public")
    public ResponseEntity<Message> sendMessage(@Payload Message message){
        return new ResponseEntity(message, HttpStatus.OK);
    }

    @MessageMapping("/chat.addUser")
            @SendTo("/topic/public")
    public ResponseEntity<?> addusers(@Payload Message message,
                                      SimpMessageHeaderAccessor header ){

        header.getSessionAttributes().put("username",message.getSender());
        return new ResponseEntity(message, HttpStatus.OK);
    }
}
