package com.scsa.outvite.guestbook.controller;

import com.scsa.outvite.global.ApiResponse;
import com.scsa.outvite.guestbook.dto.CreateGuestbookRequest;
import com.scsa.outvite.guestbook.dto.DeleteGuestbookRequest;
import com.scsa.outvite.guestbook.service.GuestbookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/invitation/{invitationId}/guestbook")
public class GuestbookController {
    private final GuestbookService guestbookService;

    @PostMapping
    public ApiResponse createGuestbook(@PathVariable("invitationId") String invitationId,
                                       @RequestBody CreateGuestbookRequest request
    ) {
        guestbookService.createGuestbook(invitationId, request);

        return ApiResponse.builder()
                .message("방명록을 등록했습니다.")
                .build();
    }

    @DeleteMapping("/{guestbookId}")
    public ApiResponse deleteGuestbook(@PathVariable("invitationId") String invitationId,
                                       @PathVariable("guestbookId") int guestbookId,
                                       @RequestBody DeleteGuestbookRequest request
    ) {
        guestbookService.deleteGuestbook(invitationId, guestbookId, request.getPassword());

        return ApiResponse.builder()
                .message("방명록을 삭제했습니다.")
                .build();
    }
}
