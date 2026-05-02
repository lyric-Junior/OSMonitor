package com.server.osinspector.model.dto.login;

public class TokenResponseDTO {

    private String token;
    private String type = "Bearer";
    private Long expiresIn;

    public TokenResponseDTO(String token, Long expiresIn) {
        this.token = token;
        this.expiresIn = expiresIn;
    }

    // getters
}