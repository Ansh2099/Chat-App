package com.ansh.Chat.App.Model;

import com.ansh.Chat.App.Controller.MessageType;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Message {

    private String content;
    private MessageType Type;
    private String sender;
}
