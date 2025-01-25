package com.ambar.kafka.learning.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    
    @KafkaListener(topics = "message-topic",groupId = "message-group-1")
    public void messageConsumer(ConsumerRecord<String, String> record)
    {
            System.out.println("Received Message: " + record.value() +
                    " | Partition: " + record.partition() +
                    " | Offset: " + record.offset());
        } 

}
