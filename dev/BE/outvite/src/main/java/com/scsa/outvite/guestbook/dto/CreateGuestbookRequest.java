package com.scsa.outvite.guestbook.dto;

import com.scsa.outvite.entity.Guestbook;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class CreateGuestbookRequest {
    private String name;
    private int password;
    private String content;

    public Guestbook toEntity(String invitationId) {
        return Guestbook.builder()
                .invitationId(invitationId)
                .name(name)
                .password(password)
                .content(content)
                .createdAt(LocalDateTime.now())
                .build();
    }
}
