package com.scsa.outvite.guest.dto;

import com.scsa.outvite.entity.Guest;
import lombok.Getter;

@Getter
public class GuestDTO {
    private String phone;
    private String name;
    private String groomBridgeSide;
    private String relationship;
    private boolean attending;

    public GuestDTO(Guest guest) {
        this.phone = guest.getId().getPhone();
        this.name = guest.getName();
        this.groomBridgeSide = guest.getGroomBridgeSide();
        this.relationship = guest.getRelationship();
        this.attending = guest.isAttending();
    }

}
