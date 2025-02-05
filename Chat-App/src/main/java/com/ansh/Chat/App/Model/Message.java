package com.ansh.Chat.App.Model;

import com.ansh.Chat.App.Controller.MessageType;

import io.micrometer.common.lang.Nullable;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {

    @Nullable
    private String content;
    private MessageType Type;
    private String sender;



    public MessageType getType() {
        return Type;
    }

    public void setType(MessageType type) {
        Type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

}
