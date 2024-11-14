package com.scsa.outvite.auth.error;

import com.scsa.outvite.global.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum AuthError implements ErrorCode {
    DUPLICATED_ID(HttpStatus.CONFLICT.value(), "사용할 수 없는 ID입니다.");

    private final int status;
    private final String message;
}
