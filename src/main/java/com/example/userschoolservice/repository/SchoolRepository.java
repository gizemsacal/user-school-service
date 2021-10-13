package com.example.userschoolservice.repository;

import com.example.userschoolservice.model.School;
import com.example.userschoolservice.model.User;
import com.google.common.util.concurrent.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Integer> {
    School getByName(String name);
}
