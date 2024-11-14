package com.scsa.outvite.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shared_image")
public class SharedImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "invitation_id", nullable = false)
    private String invitationId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "visibility", nullable = false)
    private char visibility;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}
