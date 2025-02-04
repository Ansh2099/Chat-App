package com.ansh.Chat.App.Config;

import com.ansh.Chat.App.Controller.MessageType;
import com.ansh.Chat.App.Model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
@Slf4j
public class WebSocketEventListener {
    
    private SimpMessageSendingOperations messagingTemplate;
    
    @EventListener
    public void sessionDisconnectEvent(SessionDisconnectEvent event) {

        String username = event.getUser().getName();
        log.info("User Disconnected : " + username);
        
        if (username != null){

            Message message = new Message();

            message.setType(MessageType.LEAVE);
            message.getContent();
            message.setSender(username);

            messagingTemplate.convertAndSend("/topic/public", message);
        }
    }
}
