package com.example.demo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produce")
public class ProducerController {

    @Value(value = "${message.topic.name}")
    private String topicName;
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping
    public void sendMessage(String msg) {
        msg = "hi";
        kafkaTemplate.send(topicName, msg);
    }
}
