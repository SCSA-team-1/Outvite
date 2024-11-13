package com.scsa.outvite.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "guestbook")
public class Guestbook {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "invitation_id")
    private String invitationId;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "content")
    private String content;

    @Column(name = "created_at")
    private Date createdAt;
}
