package com.scsa.outvite.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
public class GuestEmbedded implements Serializable {
    @Column(name="phone")
    private String phone;

    @Column(name = "invitation_id" )
    private String invitationId;
}
