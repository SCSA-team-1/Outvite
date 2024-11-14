package com.scsa.outvite.auth.service;

import com.scsa.outvite.auth.dto.CheckDuplicatedIdResponse;
import com.scsa.outvite.auth.dto.SignupRequest;
import com.scsa.outvite.auth.dto.SignupResponse;
import com.scsa.outvite.entity.Member;
import com.scsa.outvite.global.exception.BusinessException;
import com.scsa.outvite.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.scsa.outvite.auth.error.AuthError.DUPLICATED_ID;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final MemberRepository memberRepository;

    @Transactional
    public SignupResponse signup(SignupRequest signupRequest) {
        Member newMember = signupRequest.toEntity();

        if (memberRepository.existsById(newMember.getId())) {
            throw new BusinessException(DUPLICATED_ID);
        }

        memberRepository.save(newMember);

        return new SignupResponse(newMember);
    }

    public CheckDuplicatedIdResponse checkDuplicatedId(String id) {
        boolean isDuplicated = memberRepository.existsById(id);

        return new CheckDuplicatedIdResponse(isDuplicated);
    }
}
