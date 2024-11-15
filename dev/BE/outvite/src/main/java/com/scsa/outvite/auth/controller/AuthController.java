package com.scsa.outvite.auth.controller;

import com.scsa.outvite.auth.dto.*;
import com.scsa.outvite.global.ApiResponse;
import com.scsa.outvite.auth.service.AuthService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static com.scsa.outvite.global.ApiConstants.MEMBER_ID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
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

    @PostMapping("/signup")
    public ApiResponse signup(@RequestBody SignupRequest request) {
        SignupResponse response = authService.signup(request);

        return ApiResponse.builder()
                .message("회원가입에 성공했습니다.")
                .data(response)
                .build();
    }

    @GetMapping("/check/{id}")
    public ApiResponse checkDuplicatedId(@PathVariable String id) {
        CheckDuplicatedIdResponse response = authService.checkDuplicatedId(id);

        return ApiResponse.builder()
                .message("id 중복여부를 체크했습니다.")
                .data(response)
                .build();
    }
}
