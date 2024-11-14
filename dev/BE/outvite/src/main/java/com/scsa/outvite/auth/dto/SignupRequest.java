package com.scsa.outvite.auth.dto;

import com.scsa.outvite.entity.Member;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SignupRequest {
    private String id;
    private String password;
    private String name;
    private String phone;

    public Member toEntity() {
        return new Member(id, password, name, phone);
    }
}
