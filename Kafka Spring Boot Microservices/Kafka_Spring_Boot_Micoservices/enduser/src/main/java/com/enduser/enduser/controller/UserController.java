package com.enduser.enduser.controller;

import com.enduser.enduser.config.KafkaConsumerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/userservice")
public class UserController {

    @Autowired
    private KafkaConsumerConfig kafkaConsumerConfig;


}
