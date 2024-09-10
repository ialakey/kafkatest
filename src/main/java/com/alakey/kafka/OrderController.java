package com.alakey.kafka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private final OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @GetMapping("/sendOrder")
    public String sendOrder(@RequestParam("order") String order) {
        orderProducer.sendOrder(order);
        return "Order sent: " + order;
    }
}
