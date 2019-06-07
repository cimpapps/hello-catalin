package com.example.hellocatalin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class HelloCatalinApplication {

    @Autowired
    RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(HelloCatalinApplication.class, args);
    }


    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/back")
    public String back() {
       return restTemplate.getForEntity("http://localhost:8282", String.class).getBody();
    }

    @Bean
    public  RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
