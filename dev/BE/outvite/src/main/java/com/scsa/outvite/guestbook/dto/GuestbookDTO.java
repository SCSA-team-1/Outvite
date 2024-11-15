package com.scsa.outvite.guestbook.dto;

import com.scsa.outvite.entity.Guestbook;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GuestbookDTO {
    private final Integer id;
    private final String invitationId;
    private final String name;
    private final String content;
    private final LocalDateTime createdAt;

    public GuestbookDTO(Guestbook guestbook) {
        this.id = guestbook.getId();
        this.invitationId = guestbook.getInvitationId();
        this.name = guestbook.getName();
        this.content = guestbook.getContent();
        this.createdAt = guestbook.getCreatedAt();
    }
}
