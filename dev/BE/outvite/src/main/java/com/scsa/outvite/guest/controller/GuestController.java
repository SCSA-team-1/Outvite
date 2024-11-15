package com.scsa.outvite.guest.controller;

import com.scsa.outvite.global.ApiResponse;
import com.scsa.outvite.global.exception.AuthException;
import com.scsa.outvite.guest.dto.CreateGuestRequest;
import com.scsa.outvite.guest.dto.GetGuestResponse;
import com.scsa.outvite.guest.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static com.scsa.outvite.auth.error.AuthError.FORBIDDEN;
import static com.scsa.outvite.global.ApiConstants.MEMBER_ID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/invitation/{invitationId}/guest")
public class GuestController {
    private final GuestService guestService;

    @PostMapping
    public ApiResponse createGuest(@PathVariable("invitationId") String invitationId,
                                   @RequestBody CreateGuestRequest request
    ) {
        guestService.createGuest(invitationId, request);

        return ApiResponse.builder()
                .message("참석의사를 제출했습니다.")
                .build();
    }

    @GetMapping
    public ApiResponse readGuests(@SessionAttribute(name = MEMBER_ID, required = false) String memberId,
                                  @PathVariable("invitationId") String invitationId
    ) {
        GetGuestResponse response = guestService.readGuest(memberId, invitationId);

        return ApiResponse.builder()
                .message("참석자 명단을 조회했습니다.")
                .data(response)
                .build();
    }

    @DeleteMapping("/{phone}")
    public ApiResponse deleteGuest(@SessionAttribute(name = MEMBER_ID, required = false) String memberId,
                                   @PathVariable("invitationId") String invitationId,
                                   @PathVariable("phone") String phone
    ) {
        guestService.deleteGuest(memberId, invitationId, phone);

        return ApiResponse.builder()
                .message("참석자 명단에서 참석자를 삭제했습니다.")
                .build();
    }

}
