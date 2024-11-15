package com.scsa.outvite.invitation.error;

import com.scsa.outvite.global.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum InvitationError implements ErrorCode {
    NOT_FOUND_INVITATION(HttpStatus.NOT_FOUND.value(), "존재하지 않는 청첩장입니다.");

    private int status;
    private String message;
}
