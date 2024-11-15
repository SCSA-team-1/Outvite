package com.scsa.outvite.repository;

import com.scsa.outvite.entity.Guestbook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestbookRepository extends JpaRepository<Guestbook, Integer> {
}
