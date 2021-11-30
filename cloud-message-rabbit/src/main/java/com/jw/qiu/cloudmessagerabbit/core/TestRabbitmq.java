package com.jw.qiu.cloudmessagerabbit.core;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TestRabbitmq {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void send(){
        rabbitTemplate.convertAndSend("hello","test1");
    }
}
