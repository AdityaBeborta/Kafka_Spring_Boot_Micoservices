package com.enduser.enduser.config;

import com.enduser.enduser.utility.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {



    @KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = AppConstants.GROUP_ID_NAME)
    public String getMessages(String message){
        System.out.println(message + " from spring boot service");
            return message;
    }
}
