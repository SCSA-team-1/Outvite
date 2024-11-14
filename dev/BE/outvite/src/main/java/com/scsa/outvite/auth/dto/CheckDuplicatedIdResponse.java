package com.scsa.outvite.auth.dto;

import lombok.Getter;

@Getter
public class CheckDuplicatedIdResponse {
    private final boolean duplicated;

    public CheckDuplicatedIdResponse(boolean duplicated) {
        this.duplicated = duplicated;
    }
}
