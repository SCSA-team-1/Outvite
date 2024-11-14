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
@Table(name = "guest")
public class Guest {

    @EmbeddedId
    private GuestEmbedded id = new GuestEmbedded();

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "groom_bride_side")
    private String groomBridgeSide;

    @Column(name = "relationship")
    private String relationship;

    @Column(name = "attending", nullable = false)
    private boolean attending;
}
