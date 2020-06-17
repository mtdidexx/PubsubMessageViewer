package com.idexx.messaging.domain;

public class PubSubMessage {
    private Message message;
    private String subscription;

    public PubSubMessage() {
        this.message = new Message();
        this.subscription = "";
    }

    public PubSubMessage(Message message, String subscription) {
        this.message = message;
        this.subscription = subscription;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return "PubSubMessage{" +
                "message=" + message +
                ", subscription='" + subscription + '\'' +
                '}';
    }
}

