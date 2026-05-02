package com.server.osinspector.model.dto.login;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class LoginResponse {

    @Getter @Setter
    private String token;

    @Getter @Setter
    private String response;

    @Getter @Setter
    private Date timeStamp;

}
