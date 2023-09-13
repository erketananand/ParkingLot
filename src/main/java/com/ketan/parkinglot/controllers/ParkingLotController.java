package com.ketan.parkinglot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingLotController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }

}
