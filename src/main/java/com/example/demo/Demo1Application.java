package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication
@RestController
public class Demo1Application {

    @Value("${build.confirm}")
    String key;
    @GetMapping("/test")
    String test() {
        return key;
    }



    public static void main(String[] args) {
        String[] SCOPES = { "sjeijfseojseifjeifjsieofjeisef" };
        System.out.println(Arrays.toString(SCOPES));
        SpringApplication.run(Demo1Application.class, args);
    }

}
