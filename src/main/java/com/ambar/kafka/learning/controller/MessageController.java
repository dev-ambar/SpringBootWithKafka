package com.ambar.kafka.learning.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ambar.kafka.learning.producer.MessageProducer;

@RestController
@RequestMapping("api/v1")
public class MessageController {

    private MessageProducer messageProducer;

    

    public MessageController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }


    @PostMapping("/sendMessage")
    public void  postMessageOnKafka(@RequestParam String message , @RequestParam String location){

            messageProducer.publisher(message, location);

    }

}
