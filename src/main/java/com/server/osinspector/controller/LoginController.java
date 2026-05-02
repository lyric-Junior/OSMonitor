package com.server.osinspector.controller;

import com.server.osinspector.model.dto.login.LoginRequest;
import com.server.osinspector.model.dto.login.LoginResponse;

import com.server.osinspector.model.dto.login.TokenResponseDTO;
import com.server.osinspector.service.security.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity<TokenResponseDTO> login(Login)
}