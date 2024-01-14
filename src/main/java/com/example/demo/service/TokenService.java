package com.example.demo.service;

import com.example.demo.dto.TokenDto;
import com.example.demo.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TokenService {
    @Autowired
    private TokenRepository tokenRepository;

    public List<TokenDto> getAllToken() {
        return tokenRepository.findAll();
    }
}
