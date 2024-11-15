package com.scsa.outvite.auth.controller;

import com.scsa.outvite.auth.dto.LoginRequest;
import com.scsa.outvite.auth.dto.LoginResponse;
import com.scsa.outvite.auth.service.AuthService;
import com.scsa.outvite.global.ApiResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static com.scsa.outvite.global.ApiConstants.MEMBER_ID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth/")
public class LoginController {
    private final AuthService authService;

    @PostMapping("/login")
    public ApiResponse login(@RequestBody LoginRequest request, HttpSession session) {
        session.removeAttribute(MEMBER_ID);
        LoginResponse response = authService.login(request.getId(), request.getPassword());
        session.setAttribute(MEMBER_ID, request.getId());
        return ApiResponse.builder()
                .message("로그인 되었습니다.")
                .data(response)
                .build();
    }

    @GetMapping("/logout")
    public ApiResponse logout(HttpSession session){
        session.invalidate();
        return ApiResponse.builder()
                .message("로그아웃 되었습니다")
                .build();
    }
}
