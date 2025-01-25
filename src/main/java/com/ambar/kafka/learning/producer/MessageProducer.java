package com.ambar.kafka.learning.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    private KafkaTemplate<String,String> kafkaTemplate;
    private  final String topic =   "message-topic";
    

    public MessageProducer(KafkaTemplate<String,String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void  publisher (String meString,String location)
    
    {   
             int parttion =  location.equalsIgnoreCase("North") ? 0 :1 ;

            kafkaTemplate.send(topic,parttion,location,meString);
            System.out.println("Message has been published "); 
       
    }

}
