package com.scsa.outvite.auth.error;

import com.scsa.outvite.global.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum AuthError implements ErrorCode {
    FORBIDDEN(HttpStatus.FORBIDDEN.value(), "권한이 없습니다."),
    DUPLICATED_ID(HttpStatus.CONFLICT.value(), "사용할 수 없는 ID입니다."),
    NON_EXIST_ID(HttpStatus.UNAUTHORIZED.value(),"해당 ID 유저가 없습니다."),
    WRONG_PASSWORD(HttpStatus.UNAUTHORIZED.value(),"잘못된 비밀번호 입니다.");

    private final int status;
    private final String message;
}
