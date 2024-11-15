package com.scsa.outvite.invitation.dto;

import com.scsa.outvite.entity.Invitation;
import com.scsa.outvite.guestbook.dto.GuestbookDTO;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class GetInvitationResponse {
    private final String id;
    private final LocalDate date;
    private final String venue;
    private final String introductionWriting;
    private final String closingWriting;
    private final String guestbookAuthorization;
    private final int themeNumber;
    private final String detailedColor;
    private final String detailedFont;
    private final String brideName;
    private final String bridePhone;
    private final String brideBank;
    private final String brideDepositor;
    private final String brideAccount;
    private final String groomName;
    private final String groomPhone;
    private final String groomBank;
    private final String groomDepositor;
    private final String groomAccount;
    private final String brideFatherName;
    private final String brideFatherPhone;
    private final String brideFatherBank;
    private final String brideFatherDepositor;
    private final String brideFatherAccount;
    private final String brideMotherName;
    private final String brideMotherPhone;
    private final String brideMotherBank;
    private final String brideMotherDepositor;
    private final String brideMotherAccount;
    private final String groomFatherName;
    private final String groomFatherPhone;
    private final String groomFatherBank;
    private final String groomFatherDepositor;
    private final String groomFatherAccount;
    private final String groomMotherName;
    private final String groomMotherPhone;
    private final String groomMotherBank;
    private final String groomMotherDepositor;
    private final String groomMotherAccount;
    // TODO: 이미지 리스트 구현 필요
//    private List<InvitationImage> images;
    private List<GuestbookDTO> guestbookList;

    public GetInvitationResponse(Invitation invitation, List<GuestbookDTO> guestbookList) {
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
        this.guestbookList = guestbookList;
    }
}
