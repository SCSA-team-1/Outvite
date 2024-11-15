package com.scsa.outvite.guest.service;

import com.scsa.outvite.entity.Guest;
import com.scsa.outvite.entity.GuestEmbedded;
import com.scsa.outvite.global.exception.AuthException;
import com.scsa.outvite.global.exception.BusinessException;
import com.scsa.outvite.guest.dto.CreateGuestRequest;
import com.scsa.outvite.guest.dto.GetGuestResponse;
import com.scsa.outvite.repository.GuestRepository;
import com.scsa.outvite.repository.InvitationRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.scsa.outvite.auth.error.AuthError.FORBIDDEN;
import static com.scsa.outvite.guest.error.GuestError.NOT_FOUND_GUEST;
import static com.scsa.outvite.guest.error.GuestError.NOT_FOUND_PHONE;
import static com.scsa.outvite.invitation.error.InvitationError.NOT_FOUND_INVITATION;

@Service
@RequiredArgsConstructor
public class GuestService {
    private final GuestRepository guestRepository;
    private final InvitationRepository invitationRepository;

    @Transactional
    public void createGuest(String invitationId, CreateGuestRequest request) {
        if (!invitationRepository.existsById(invitationId)) {
            throw new BusinessException(NOT_FOUND_INVITATION);
        }

        GuestEmbedded embeddedId = GuestEmbedded.builder()
                .invitationId(invitationId)
                .phone(request.getPhone())
                .build();

        Guest guest = request.toEntity(embeddedId);

        guestRepository.save(guest);
    }

    @Transactional
    public GetGuestResponse readGuest(String memberId, String invitationId) {
        if (!invitationRepository.existsById(invitationId)) {
            throw new BusinessException(NOT_FOUND_INVITATION);
        }

        if (!invitationId.equals(memberId)) {
            throw new AuthException(FORBIDDEN);
        }

        List<Guest> guestList = guestRepository.findAllById_invitationId(invitationId);
        return new GetGuestResponse(guestList);
    }

    @Transactional
    public void deleteGuest(String memberId, String invitationId, String phone) {
        if (!invitationRepository.existsById(invitationId)) {
            throw new BusinessException(NOT_FOUND_INVITATION);
        } else if (!guestRepository.existsById_phone(phone)) {
            throw new BusinessException(NOT_FOUND_PHONE);
        }

        if (!invitationId.equals(memberId)) {
            throw new AuthException(FORBIDDEN);
        }


        GuestEmbedded embeddedId = GuestEmbedded.builder()
                .invitationId(invitationId)
                .phone(phone)
                .build();

        Guest guest = guestRepository.findById(embeddedId).orElseThrow(
                () -> new BusinessException(NOT_FOUND_GUEST));

        guestRepository.delete(guest);
    }

}
