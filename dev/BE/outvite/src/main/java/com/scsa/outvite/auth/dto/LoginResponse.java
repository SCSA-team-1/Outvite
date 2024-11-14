package com.scsa.outvite.auth.dto;

import com.scsa.outvite.entity.Member;
import lombok.Getter;

@Getter
public class LoginResponse {
    private String id;
    private String name;
    private String phone;

    public LoginResponse(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.phone = member.getPhone();
    }
}
