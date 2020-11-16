package com.spboard.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class LoginController {

    @GetMapping("/login")
    public String loginHome(){
        log.info("login");
        System.out.println("LogIn Controller 호출!");
        return "login";
    }

    // 구현해야 함
    @PostMapping("/login")
    public String login(){
        return "login";
    }

}
