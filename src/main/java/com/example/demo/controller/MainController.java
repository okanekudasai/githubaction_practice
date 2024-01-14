package com.example.demo.controller;

import com.example.demo.dto.TokenDto;
import com.example.demo.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class MainController {

    @Value("${build.confirm}")
    String key;
    @Autowired
    TokenService tokenService;

    @GetMapping("/test")
    String test() {
        return key;
    }

    @GetMapping("/findToken")
    String findToken() {
        List<TokenDto> tokens = tokenService.getAllToken();
        for (TokenDto token : tokens) {
            System.out.println(token.getIdx() + " " + token.getChrome() + " " + token.getToken());
        }
        return "22";
    }

}
