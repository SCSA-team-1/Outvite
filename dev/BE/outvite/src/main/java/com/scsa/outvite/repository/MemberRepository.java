package com.scsa.outvite.repository;

import com.scsa.outvite.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
    @Override
    boolean existsById(String id);
}
