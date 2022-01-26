package com.example.springboot_new.repository;

import com.example.springboot_new.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
