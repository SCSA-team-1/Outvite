package com.scsa.outvite.guest.dto;

import com.scsa.outvite.entity.Guest;
import com.scsa.outvite.entity.GuestEmbedded;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateGuestRequest {
    private String phone;
    private String name;
    private int password;
    private String relationship;
    private String groomBrideSide;
    private boolean attending;

    public Guest toEntity(GuestEmbedded embeddedId) {
        return Guest.builder()
                .id(embeddedId)
                .name(name)
                .password(password)
                .groomBridgeSide(groomBrideSide)
                .relationship(relationship)
                .build();
    }
}
