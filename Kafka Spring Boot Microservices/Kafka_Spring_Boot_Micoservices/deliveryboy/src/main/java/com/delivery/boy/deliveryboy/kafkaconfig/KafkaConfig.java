package com.delivery.boy.deliveryboy.kafkaconfig;

import com.delivery.boy.deliveryboy.appconstants.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class KafkaConfig {

    @Bean
    //this is used to create a topic which we can use to store the messages
    public NewTopic newTopic(){
        return new NewTopic(AppConstants.LOCATION_TOPIC_NAME,new HashMap<>());
    }
}
