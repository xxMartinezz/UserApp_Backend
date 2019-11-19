package com.example.exence.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public Page<User> findAll(Pageable pageable) { return userRepository.findAll(pageable); }

    @PostMapping("")
    public User create(@RequestBody @Valid User user) { return userRepository.save(user); }
}
