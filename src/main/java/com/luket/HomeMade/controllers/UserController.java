package com.luket.HomeMade.controllers;

import com.luket.HomeMade.models.UserModel;
import com.luket.HomeMade.models.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(final UserRepository userRespository) {
        this.userRepository = userRespository;
    }

    @GetMapping("/user/all")
    Iterable<UserModel> all() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    UserModel userById(@PathVariable final Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/user/save")
    UserModel save(@RequestBody final UserModel user) {
        return userRepository.save(user);
    }
}
