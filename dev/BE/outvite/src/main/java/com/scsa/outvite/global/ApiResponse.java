package com.scsa.outvite.global;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Builder
public class ApiResponse {
    @Builder.Default
    private int status = HttpStatus.OK.value();
    private String message;
    private Object data;
}
