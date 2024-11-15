package com.scsa.outvite.invitation.dto;

import com.scsa.outvite.entity.Invitation;
import lombok.*;

import java.time.LocalDate;

@Getter
public class GetInvitationResponse {
    private String id;
    private LocalDate date;
    private String venue;
    private String introductionWriting;
    private String closingWriting;
    private String guestbookAuthorization;
    private int themeNumber;
    private String detailedColor;
    private String detailedFont;
    private String brideName;
    private String bridePhone;
    private String brideBank;
    private String brideDepositor;
    private String brideAccount;
    private String groomName;
    private String groomPhone;
    private String groomBank;
    private String groomDepositor;
    private String groomAccount;
    private String brideFatherName;
    private String brideFatherPhone;
    private String brideFatherBank;
    private String brideFatherDepositor;
    private String brideFatherAccount;
    private String brideMotherName;
    private String brideMotherPhone;
    private String brideMotherBank;
    private String brideMotherDepositor;
    private String brideMotherAccount;
    private String groomFatherName;
    private String groomFatherPhone;
    private String groomFatherBank;
    private String groomFatherDepositor;
    private String groomFatherAccount;
    private String groomMotherName;
    private String groomMotherPhone;
    private String groomMotherBank;
    private String groomMotherDepositor;
    private String groomMotherAccount;
    // TODO: 이미지 리스트와 방명록 리스트 구현 필요
//    private List<InvitationImage> images;
//    private List<Guestbook> guestbookList;

    public GetInvitationResponse(Invitation invitation) {
        this.id = invitation.getId();
        this.date = invitation.getDate();
        this.venue = invitation.getVenue();
        this.introductionWriting = invitation.getIntroductionWriting();
        this.closingWriting = invitation.getClosingWriting();
        this.guestbookAuthorization = invitation.getGuestbookAuthorization();
        this.themeNumber = invitation.getThemeNumber();
        this.detailedColor = invitation.getDetailedColor();
        this.detailedFont = invitation.getDetailedFont();
        this.brideName = invitation.getBrideName();
        this.bridePhone = invitation.getBridePhone();
        this.brideBank = invitation.getBrideBank();
        this.brideDepositor = invitation.getBrideDepositor();
        this.brideAccount = invitation.getBrideAccount();
        this.groomName = invitation.getGroomName();
        this.groomPhone = invitation.getGroomPhone();
        this.groomBank = invitation.getGroomBank();
        this.groomDepositor = invitation.getGroomDepositor();
        this.groomAccount = invitation.getGroomAccount();
        this.brideFatherName = invitation.getBrideFatherName();
        this.brideFatherPhone = invitation.getBrideFatherPhone();
        this.brideFatherBank = invitation.getBrideFatherBank();
        this.brideFatherDepositor = invitation.getBrideFatherDepositor();
        this.brideFatherAccount = invitation.getBrideFatherAccount();
        this.brideMotherName = invitation.getBrideMotherName();
        this.brideMotherPhone = invitation.getBrideMotherPhone();
        this.brideMotherBank = invitation.getBrideMotherBank();
        this.brideMotherDepositor = invitation.getBrideMotherDepositor();
        this.brideMotherAccount = invitation.getBrideMotherAccount();
        this.groomFatherName = invitation.getGroomFatherName();
        this.groomFatherPhone = invitation.getGroomFatherPhone();
        this.groomFatherBank = invitation.getGroomFatherBank();
        this.groomFatherDepositor = invitation.getGroomFatherDepositor();
        this.groomFatherAccount = invitation.getGroomFatherAccount();
        this.groomMotherName = invitation.getGroomMotherName();
        this.groomMotherPhone = invitation.getGroomMotherPhone();
        this.groomMotherBank = invitation.getGroomMotherBank();
        this.groomMotherDepositor = invitation.getGroomMotherDepositor();
        this.groomMotherAccount = invitation.getGroomMotherAccount();
    }
}
