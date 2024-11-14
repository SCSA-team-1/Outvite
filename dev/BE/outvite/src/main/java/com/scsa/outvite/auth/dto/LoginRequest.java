package com.scsa.outvite.auth.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class LoginRequest {
    private String id;
    private String password;
}

