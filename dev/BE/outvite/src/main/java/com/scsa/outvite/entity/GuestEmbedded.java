package com.scsa.outvite.entity;

import jakarta.persistence.Column;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class GuestEmbedded implements Serializable {
    @Column(name="phone")
    private String phone;

    @Column(name = "invitation_id" )
    private String invitationId;
}
