package com.ambar.kafka.learning;

public class Message {

     private  String id ;
     private  String topic;

    public Message(String id, String topic) {
        this.id = id;
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Message [id=" + id + ", topic=" + topic + "]";
    }

    

}
