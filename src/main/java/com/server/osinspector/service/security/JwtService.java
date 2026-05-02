package com.server.osinspector.service.security;

import com.server.osinspector.model.dto.login.LoginRequest;
import com.server.osinspector.model.dto.login.TokenResponseDTO;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.time.Month;
import java.util.Date;
import java.util.function.Function;

@Service
public class JwtService {

    private final String SECRET = "tucano-ti";
    private final String API_KEY_VALIDA = "oryon_tech_assistencia_tecnica2344856721";

    private final long EXPIRATION = 1000 * 60 * 60 * 24; // 24h

    public TokenResponseDTO gerarToken(LoginRequest dto) {

        if (!API_KEY_VALIDA.equals(dto.getToken())) {
            throw new RuntimeException("API Key inválida");
        }

        Date agora = new Date();
        Date expiracao = new Date(agora.getTime() + EXPIRATION);

        String token = Jwts.builder()
                .setSubject("API_USER")
                .setIssuedAt(agora)
                .setExpiration(expiracao)
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();

        return new TokenResponseDTO(token, EXPIRATION);
    }
}