package com.example.aws.sqs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageSender {

    @Autowired
    private QueueMessagingTemplate queueMessagingTemplate;


    @Value("${cloud.aws.end-point.uri}")
    private String endPoint;

    @GetMapping(value = "/send/{message}")
    public String sendMessageToQueue(@PathVariable String message){
        queueMessagingTemplate.send(endPoint, MessageBuilder.withPayload(message).build());
        return message;
    }

}
