package com.scsa.outvite.repository;

import com.scsa.outvite.entity.Guest;
import com.scsa.outvite.entity.GuestEmbedded;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, GuestEmbedded> {
}
