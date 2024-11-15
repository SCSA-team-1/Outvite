package com.scsa.outvite.invitation.dto;

import com.scsa.outvite.entity.Invitation;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class CreateInvitationRequest {
    private LocalDate date;
    private String venue;
    private String introductionWriting;  // TODO: 어떤 식으로 전달될지는 프론트와 협의 필요
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
//    private List<InvitationImage> images;  // TODO: 이미지 업로드 구현 필요

    public Invitation toEntity(String memberId) {
        return Invitation.builder()
                .id(memberId)
                .date(date)
                .venue(venue)
                .introductionWriting(introductionWriting)
                .closingWriting(closingWriting)
                .guestbookAuthorization(guestbookAuthorization)
                .themeNumber(themeNumber)
                .detailedColor(detailedColor)
                .detailedFont(detailedFont)
                .brideName(brideName)
                .bridePhone(bridePhone)
                .brideBank(brideBank)
                .brideDepositor(brideDepositor)
                .brideAccount(brideAccount)
                .groomName(groomName)
                .groomPhone(groomPhone)
                .groomBank(groomBank)
                .groomDepositor(groomDepositor)
                .groomAccount(groomAccount)
                .brideFatherName(brideFatherName)
                .brideFatherPhone(brideFatherPhone)
                .brideFatherBank(brideFatherBank)
                .brideFatherDepositor(brideFatherDepositor)
                .brideFatherAccount(brideFatherAccount)
                .brideMotherName(brideMotherName)
                .brideMotherPhone(brideMotherPhone)
                .brideMotherBank(brideMotherBank)
                .brideMotherDepositor(brideMotherDepositor)
                .brideMotherAccount(brideMotherAccount)
                .groomFatherName(groomFatherName)
                .groomFatherPhone(groomFatherPhone)
                .groomFatherBank(groomFatherBank)
                .groomFatherDepositor(groomFatherDepositor)
                .groomFatherAccount(groomFatherAccount)
                .groomMotherName(groomMotherName)
                .groomMotherPhone(groomMotherPhone)
                .groomMotherBank(groomMotherBank)
                .groomMotherDepositor(groomMotherDepositor)
                .groomMotherAccount(groomMotherAccount)
                .build();
    }
}
