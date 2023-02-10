package com.example.demo;

public class Message {
    long id;
    String message;
    public Message(long id, String message) {
        this.setId(id);
        this.setMessage(message);
    }
    public long getId() {
        return id;
    }
    public String getMessage() {
        return message;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
}
