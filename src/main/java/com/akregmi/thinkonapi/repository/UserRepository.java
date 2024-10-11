package com.akregmi.thinkonapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.akregmi.thinkonapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
