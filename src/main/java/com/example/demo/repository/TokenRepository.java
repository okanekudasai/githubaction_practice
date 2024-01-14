package com.example.demo.repository;

import com.example.demo.dto.TokenDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<TokenDto, Long> {
}
