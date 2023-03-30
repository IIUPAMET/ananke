package com.feellemon.ananke.controller;

import com.feellemon.ananke.domain.User;
import com.feellemon.ananke.repository.UserRepository;
import com.feellemon.ananke.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping(path = "/users")
@AllArgsConstructor
public class UserController {
    private UserService userService;
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }
    @PostMapping
    public User create(@RequestBody User user) {
        return userRepository.save(user);
    }
}
