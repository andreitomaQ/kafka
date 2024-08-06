package org.example.dockerexposedemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topic", groupId = "group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
