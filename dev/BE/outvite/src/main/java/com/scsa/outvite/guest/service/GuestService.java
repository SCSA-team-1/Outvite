package com.scsa.outvite.guest.service;

import com.scsa.outvite.entity.Guest;
import com.scsa.outvite.entity.GuestEmbedded;
import com.scsa.outvite.entity.Invitation;
import com.scsa.outvite.global.exception.BusinessException;
import com.scsa.outvite.guest.dto.CreateGuestRequest;
import com.scsa.outvite.repository.GuestRepository;
import com.scsa.outvite.repository.InvitationRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
