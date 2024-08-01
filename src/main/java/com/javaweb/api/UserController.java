package com.javaweb.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.javaweb.model.User;


@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/user")
    @ResponseBody
    public User getUser() {
        return new User("John", "Doe", 30);
    }
}


