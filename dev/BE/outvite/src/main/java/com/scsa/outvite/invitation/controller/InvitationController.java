package com.scsa.outvite.invitation.controller;

import com.scsa.outvite.global.ApiResponse;
import com.scsa.outvite.invitation.dto.CreateInvitationRequest;
import com.scsa.outvite.invitation.dto.CreateInvitationResponse;
import com.scsa.outvite.invitation.dto.GetInvitationResponse;
import com.scsa.outvite.invitation.service.InvitationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static com.scsa.outvite.global.ApiConstants.MEMBER_ID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/invitation")
public class InvitationController {
    private final InvitationService invitationService;

    @PostMapping
    public ApiResponse createInvitation(@SessionAttribute(name = MEMBER_ID, required = false) String memberId,
                                        @RequestBody CreateInvitationRequest request
    ) {
        CreateInvitationResponse response = invitationService.createInvitation(memberId, request);

        return ApiResponse.builder()
                .message("청접장을 제작했습니다.")
                .data(response)
                .build();
    }

    @GetMapping("/{invitationId}")
    public ApiResponse getInvitation(@PathVariable String invitationId) {
        GetInvitationResponse response = invitationService.getInvitation(invitationId);

        return ApiResponse.builder()
                .message("청접장을 조회했습니다.")
                .data(response)
                .build();
    }
}
