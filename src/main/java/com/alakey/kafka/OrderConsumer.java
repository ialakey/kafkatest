package com.alakey.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    @KafkaListener(topics = "orders", groupId = "order-group")
    public void consumeOrder(String message) {
        System.out.println("Received order: " + message);
    }
}