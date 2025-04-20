package com.valid_example.exception.repository;

import com.valid_example.exception.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(int id);

}
