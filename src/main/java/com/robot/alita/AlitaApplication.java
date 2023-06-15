package com.robot.alita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AlitaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlitaApplication.class, args);
    }
    @GetMapping("/")
    public String index(){
        return "ok";
    }
}
