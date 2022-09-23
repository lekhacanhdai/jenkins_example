package com.example.jenkins.jenkins_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lkadai0801
 * @since 23/09/2022
 */

@Controller
public class HomeController {
    @GetMapping(value = {
            "/home",
            "/"
    })
    public String homeTemplate(){
        return "home";
    }
}
