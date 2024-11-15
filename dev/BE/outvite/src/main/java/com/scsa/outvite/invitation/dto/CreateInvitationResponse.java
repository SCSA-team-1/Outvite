package com.scsa.outvite.invitation.dto;

import lombok.Getter;

@Getter
public class CreateInvitationResponse {
    private final String invitationId;

    public CreateInvitationResponse(String invitationId) {
        this.invitationId = invitationId;
    }
}
