package com.scsa.outvite.guest.controller;

import com.scsa.outvite.global.ApiResponse;
import com.scsa.outvite.guest.dto.CreateGuestRequest;
import com.scsa.outvite.guest.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
}
