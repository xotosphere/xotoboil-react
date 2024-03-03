package com.boilerplate.databaseservice.service;

import com.boilerplate.databaseservice.model.User;
import com.boilerplate.databaseservice.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        List<User> results = new ArrayList<>();
        Iterable<User> userList = userRepository.findAll();
        userList.forEach(u -> results.add(u));
        return results;
    }
}
