package com.boilerplate.databaseservice.controller;

import com.boilerplate.databaseservice.model.UserAccess;
import com.boilerplate.databaseservice.repository.UserAccessRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/user-access")
public class UserAccessController {

    private final UserAccessRepository userAccessRepository;

    public UserAccessController(UserAccessRepository userAccessRepository) {
        this.userAccessRepository = userAccessRepository;
    }

    @ResponseBody
    @GetMapping
    public List<UserAccess> getAccess() {
        PageRequest page = PageRequest.of(0, 10);
        return userAccessRepository.findByType("filter", page).getContent();
    }

}
