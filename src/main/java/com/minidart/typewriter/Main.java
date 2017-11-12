package com.minidart.typewriter;

import org.springframework.boot.SpringApplication;

public class Main {
    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(com.minidart.typewriter.controllers.RestController.class, args);
    }
}
