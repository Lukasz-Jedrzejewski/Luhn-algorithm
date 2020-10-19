package com.jedrzejewski.Luhn.algorithm.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String get() {
        return "index";
    }
}
