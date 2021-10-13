package com.example.userschoolservice.repository;

import com.example.userschoolservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User getByUsername(String username);
}
