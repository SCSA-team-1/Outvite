package com.scsa.outvite.auth.controller;

import com.scsa.outvite.auth.dto.SignupResponse;
import com.scsa.outvite.global.ApiResponse;
import com.scsa.outvite.auth.dto.SignupRequest;
import com.scsa.outvite.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth/")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    public ApiResponse signup(@RequestBody SignupRequest request) {
        SignupResponse response = authService.signup(request);

        return ApiResponse.builder()
                .message("회원가입에 성공했습니다.")
                .data(response)
                .build();
    }
}
