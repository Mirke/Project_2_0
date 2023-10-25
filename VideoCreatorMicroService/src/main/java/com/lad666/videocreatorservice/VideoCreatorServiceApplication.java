package com.lad666.videocreatorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class VideoCreatorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoCreatorServiceApplication.class, args);
    }

}
