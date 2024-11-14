package com.scsa.outvite.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class InvitationImageEmbedded {
    @Column(name = "picture_order", nullable = false)
    private int pictureOrder;

    @Column(name = "invitation_id", nullable = false)
    private String invitationId;
}
