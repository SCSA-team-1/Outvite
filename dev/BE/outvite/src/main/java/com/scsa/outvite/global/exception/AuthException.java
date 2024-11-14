package com.scsa.outvite.global.exception;

import lombok.Getter;

@Getter
public class AuthException extends RuntimeException {
    private final int status;
    private final String message;

    public AuthException(ErrorCode errorCode) {
        this.status = errorCode.getStatus();
        this.message = errorCode.getMessage();
    }
}
