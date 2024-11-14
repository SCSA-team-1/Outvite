package com.scsa.outvite.auth.service;

import com.scsa.outvite.auth.dto.LoginResponse;
import com.scsa.outvite.auth.dto.SignupRequest;
import com.scsa.outvite.auth.dto.SignupResponse;
import com.scsa.outvite.entity.Member;
import com.scsa.outvite.global.exception.BusinessException;
import com.scsa.outvite.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.scsa.outvite.auth.error.AuthError.*;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final MemberRepository memberRepository;

    @Transactional
    public LoginResponse login(String id, String pwd) {
        Member newMember = memberRepository.findById(id).orElseThrow(
                () -> new BusinessException(NON_EXIST_ID)
        );

        if(!newMember.getPassword().equals(pwd)){
            throw new BusinessException(WRONG_PWD);
        }

        return new LoginResponse(newMember);
    }

    @Transactional
    public SignupResponse signup(SignupRequest signupRequest) {
        Member newMember = signupRequest.toEntity();

        if (memberRepository.existsById(newMember.getId())) {
            throw new BusinessException(DUPLICATED_ID);
        }

        memberRepository.save(newMember);

        return new SignupResponse(newMember);
    }
}
