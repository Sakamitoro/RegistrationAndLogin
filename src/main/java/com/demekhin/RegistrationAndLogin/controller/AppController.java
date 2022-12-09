package com.demekhin.RegistrationAndLogin.controller;

import com.demekhin.RegistrationAndLogin.model.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    private UserRepository userRepository;

    @GetMapping("")
    public String viewHomePage() {
        return "index.html";
    }
}
