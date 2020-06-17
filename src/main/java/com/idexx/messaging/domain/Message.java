package com.idexx.messaging.domain;

import java.util.HashMap;
import java.util.Map;

public class Message {
    private String data;
    private String messageId;
    private Map<String, String> attributes;

    public Message() {
        this.data = "";
        this.messageId = "";
        this.attributes = new HashMap<>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Message{" +
                "data='" + data + '\'' +
                ", messageId='" + messageId + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
