package com.projects.spring.security_facebook_login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String fun(){
        return "hello";
    }
}
