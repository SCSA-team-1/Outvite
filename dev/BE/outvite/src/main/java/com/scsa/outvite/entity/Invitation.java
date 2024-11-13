package com.scsa.outvite.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "guest")
public class Invitation {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "venue", nullable = false)
    private String venue;

    @Column(name = "introduction_writing", nullable = false)
    private String introductionWriting;

    @Column(name = "closing_writing", nullable = false)
    private String closingWriting;

    @Column(name = "guestbookAuthorization", nullable = false)
    private String guestbookAuthorization;

    @Column(name = "theme_number", nullable = false)
    private int themeNumber;

    @Column(name = "detailed_color")
    private String detailedColor;

    @Column(name = "detailed_font")
    private String detailedFont;

    @Column(name = "bride_name", nullable = false)
    private String brideName;

    @Column(name = "bride_phone")
    private String bridePhone;

    @Column(name = "bride_bank")
    private String brideBank;

    @Column(name = "bride_depositor")
    private String brideDepositor;

    @Column(name = "bride_account")
    private String brideAccount;

    @Column(name = "groom_name", nullable = false)
    private String groomName;

    @Column(name = "groom_phone")
    private String groomPhone;

    @Column(name = "groom_bank")
    private String groomBank;

    @Column(name = "groom_depositor")
    private String groomDepositor;

    @Column(name = "groom_account")
    private String groomAccount;

    @Column(name = "bride_father_name")
    private String brideFatherName;

    @Column(name = "bride_father_phone")
    private String brideFatherPhone;

    @Column(name = "bride_father_bank")
    private String brideFatherBank;

    @Column(name = "bride_father_depositor")
    private String brideFatherDepositor;

    @Column(name = "bride_father_account")
    private String brideFatherAccount;

    @Column(name = "bride_mother_name")
    private String brideMotherName;

    @Column(name = "bride_mother_phone")
    private String brideMotherPhone;

    @Column(name = "bride_mother_bank")
    private String brideMotherBank;

    @Column(name = "bride_mother_depositor")
    private String brideMotherDepositor;

    @Column(name = "bride_mother_account")
    private String brideMotherAccount;

    @Column(name = "groom_father_name")
    private String groomFatherName;

    @Column(name = "groom_father_phone")
    private String groomFatherPhone;

    @Column(name = "groom_father_bank")
    private String groomFatherBank;

    @Column(name = "groom_father_depositor")
    private String groomFatherDepositor;

    @Column(name = "groom_father_account")
    private String groomFatherAccount;

    @Column(name = "groom_mother_name")
    private String groomMotherName;

    @Column(name = "groom_mother_phone")
    private String groomMotherPhone;

    @Column(name = "groom_mother_bank")
    private String groomMotherBank;

    @Column(name = "groom_mother_depositor")
    private String groomMotherDepositor;

    @Column(name = "groom_mother_account")
    private String groomMotherAccount;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "invitation_id")
    private List<Guestbook> guestbooks;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "invitation_id")
    private List<InvitationImage> images;
}
