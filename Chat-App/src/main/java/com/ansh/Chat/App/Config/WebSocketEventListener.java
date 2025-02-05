package com.ansh.Chat.App.Config;

import com.ansh.Chat.App.Controller.MessageType;
import com.ansh.Chat.App.Model.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
@Slf4j
@RequiredArgsConstructor
public class WebSocketEventListener {
    
    private final SimpMessageSendingOperations messagingTemplate;
    
    @EventListener
    public void sessionDisconnectEvent(SessionDisconnectEvent event) {


        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());

        String username = (String) headerAccessor.getSessionAttributes().get("username");
        log.info("User Disconnected : " + username);
        
        if (username != null){

            Message message = Message

                            .builder()
                            .Type(MessageType.LEAVE)
                            .sender(username)
                            .build();

            messagingTemplate.convertAndSend("/topic/public", message);
        }
    }
}
