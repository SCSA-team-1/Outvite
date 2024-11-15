package com.scsa.outvite.guestbook.service;

import com.scsa.outvite.entity.Guestbook;
import com.scsa.outvite.entity.Invitation;
import com.scsa.outvite.global.exception.AuthException;
import com.scsa.outvite.global.exception.BusinessException;
import com.scsa.outvite.guestbook.dto.CreateGuestbookRequest;
import com.scsa.outvite.repository.GuestRepository;
import com.scsa.outvite.repository.GuestbookRepository;
import com.scsa.outvite.repository.InvitationRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.scsa.outvite.global.ApiConstants.GUESTBOOK_ALLOWING_ONLY_GUEST;
import static com.scsa.outvite.guestbook.error.GuestBookError.*;
import static com.scsa.outvite.invitation.error.InvitationError.NOT_FOUND_INVITATION;

@Service
@RequiredArgsConstructor
public class GuestbookService {
    private final GuestbookRepository guestbookRepository;
    private final InvitationRepository invitationRepository;
    private final GuestRepository guestRepository;

    @Transactional
    public void createGuestbook(String invitationId, CreateGuestbookRequest request) {
        Invitation invitation = invitationRepository.findById(invitationId)
                .orElseThrow(() -> new BusinessException(NOT_FOUND_INVITATION));

        if (GUESTBOOK_ALLOWING_ONLY_GUEST.equals(invitation.getGuestbookAuthorization())
                && !guestRepository.existsById_invitationIdAndNameAndPassword(invitationId, request.getName(), request.getPassword())) {
            throw new AuthException(CREATE_GUESTBOOK_FORBIDDEN);
        }

        Guestbook guestbook = request.toEntity(invitationId);
        guestbookRepository.save(guestbook);
    }

    @Transactional
    public void deleteGuestbook(String invitationId, int guestbookId, int password) {
        if (!invitationRepository.existsById(invitationId)) throw new BusinessException(NOT_FOUND_INVITATION);
        Guestbook guestbook = guestbookRepository.findById(guestbookId)
                .orElseThrow(() -> new BusinessException(NOT_FOUND_GUESTBOOK));
        if (guestbook.getPassword() != password) throw new AuthException(WRONG_PASSWORD);

        guestbookRepository.delete(guestbook);
    }
}
