package com.scsa.outvite.guestbook.error;

import com.scsa.outvite.global.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum GuestBookError implements ErrorCode {
    NOT_FOUND_GUESTBOOK(HttpStatus.NOT_FOUND.value(), "존재하지 않는 방명록입니다."),
    CREATE_GUESTBOOK_FORBIDDEN(HttpStatus.FORBIDDEN.value(), "방명록 작성 권한이 없습니다. 참석 의사 제출 후 이용해 주세요."),
    WRONG_PASSWORD(HttpStatus.FORBIDDEN.value(), "틀린 비밀번호입니다.");

    private final int status;
    private final String message;
}
