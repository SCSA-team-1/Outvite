package com.scsa.outvite.guest.error;

import com.scsa.outvite.global.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum GuestError implements ErrorCode {
    NOT_FOUND_GUEST(HttpStatus.NOT_FOUND.value(), "존재하지 않는 참석자입니다.");

    private int status;
    private String message;
}
