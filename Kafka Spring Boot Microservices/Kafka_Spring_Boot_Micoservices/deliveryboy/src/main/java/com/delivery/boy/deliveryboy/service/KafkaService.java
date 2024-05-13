package com.delivery.boy.deliveryboy.service;

import com.delivery.boy.deliveryboy.appconstants.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    //this is used to produce the messages and publish into the topic created
    private KafkaTemplate<String,String> kafkaTemplate;

    public boolean updateLocation(String location){
        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
        return true;
    }
}
