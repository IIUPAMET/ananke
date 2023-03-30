package com.feellemon.ananke.repository;

import com.feellemon.ananke.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
