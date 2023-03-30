package com.feellemon.ananke.service;

import com.feellemon.ananke.domain.User;
import com.feellemon.ananke.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
