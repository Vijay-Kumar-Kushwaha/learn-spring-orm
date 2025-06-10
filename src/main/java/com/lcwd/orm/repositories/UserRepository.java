package com.lcwd.orm.repositories;

import com.lcwd.orm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}