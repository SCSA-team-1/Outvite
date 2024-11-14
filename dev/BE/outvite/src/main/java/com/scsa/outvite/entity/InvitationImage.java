package com.scsa.outvite.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "invitation_image")
public class InvitationImage {
    @EmbeddedId
    private InvitationImageEmbedded id = new InvitationImageEmbedded();

    @Column(name = "url", nullable = false)
    private String url;
}
