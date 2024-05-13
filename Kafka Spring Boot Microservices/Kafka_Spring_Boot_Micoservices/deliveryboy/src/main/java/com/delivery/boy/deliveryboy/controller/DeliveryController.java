package com.delivery.boy.deliveryboy.controller;

import com.delivery.boy.deliveryboy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
@RequestMapping("/v1/delivery")

public class DeliveryController {

    @Autowired
    private KafkaService kafkaService;

    Logger logger =Logger.getLogger("DeliveryController");

    @PostMapping("/updateLocation")
    public ResponseEntity<?> updateLocation(){
        logger.info("Location updated");
        boolean b = this.kafkaService.updateLocation("("+ UUID.randomUUID()+")");

        return ResponseEntity.ok("location updated");

    }
}
