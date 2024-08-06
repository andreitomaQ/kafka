package org.example.dockerexposedemo.controller;

import lombok.RequiredArgsConstructor;
import org.example.dockerexposedemo.service.KafkaProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class HelloController {

    private final KafkaProducer kafkaProducer;

    @GetMapping
    public String hello() {
        return "Hello";
    }

    @PostMapping
    public String send(@RequestBody String message) {
        kafkaProducer.send(message);
        return "Done";
    }
}
