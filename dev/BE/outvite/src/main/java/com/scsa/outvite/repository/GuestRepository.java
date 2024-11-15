package com.scsa.outvite.repository;

import com.scsa.outvite.entity.Guest;
import com.scsa.outvite.entity.GuestEmbedded;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, GuestEmbedded> {
    List<Guest> findAllById_invitationId(String invitationId);
    boolean existsById_phone(String phone);
    boolean existsById_invitationIdAndNameAndPassword(String invitationId, String name, int password);
}
