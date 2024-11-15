package com.scsa.outvite.invitation.service;

import com.scsa.outvite.entity.Invitation;
import com.scsa.outvite.global.exception.AuthException;
import com.scsa.outvite.global.exception.BusinessException;
import com.scsa.outvite.invitation.dto.CreateInvitationRequest;
import com.scsa.outvite.invitation.dto.CreateInvitationResponse;
import com.scsa.outvite.invitation.dto.GetInvitationResponse;
import com.scsa.outvite.repository.InvitationRepository;
import com.scsa.outvite.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.scsa.outvite.auth.error.AuthError.FORBIDDEN;
import static com.scsa.outvite.invitation.error.InvitationError.NOT_FOUND_INVITATION;

@Service
@RequiredArgsConstructor
public class InvitationService {
    private final InvitationRepository invitationRepository;
    private final MemberRepository memberRepository;

    @Transactional
    public CreateInvitationResponse createInvitation(String memberId, CreateInvitationRequest request) {
        if (memberId == null || !memberRepository.existsById(memberId)) {
            throw new AuthException(FORBIDDEN);
        }

        Invitation invitation = request.toEntity(memberId);
        // TODO: 이미지 업로드 로직
        invitationRepository.save(invitation);

        return new CreateInvitationResponse(invitation.getId());
    }

    public GetInvitationResponse getInvitation(String invitationId) {
        Invitation invitation = invitationRepository.findById(invitationId)
                .orElseThrow(() -> new BusinessException(NOT_FOUND_INVITATION));

        return new GetInvitationResponse(invitation);
    }
}
