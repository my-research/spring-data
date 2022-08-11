package com.wonit.controller;

import com.wonit.persistence.entity.User;
import com.wonit.persistence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
@RequiredArgsConstructor
public class UserJoinController {

    private final UserRepository repository;

    @GetMapping("/join")
    public String join() {
        User user = repository.save(User.builder().id(1L).name("jangwonik").build());
        return user.toString();
    }
}
