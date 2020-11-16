package com.spboard.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class RegisterController {

    @GetMapping("/register")
    public String registerForm(){
        System.out.println("registerController 호출");
        log.info("registration");
        return "register";
    }


    // 구현해야 함
    @PostMapping("/register")
    public String register(Model model){
        System.out.println("registerController 호출(POST)");

        return "";
    }
}
