package com.github.osvaldsoza.brasilapifeingclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BrasilApiFeingclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrasilApiFeingclientApplication.class, args);
    }

}
