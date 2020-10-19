package com.jedrzejewski.Luhn.algorithm.Controller;

import com.jedrzejewski.Luhn.algorithm.model.Numbers;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String get(Model model) {
        model.addAttribute("numbers", new Numbers());
        return "index";
    }

    @PostMapping("/")
    public String post(@ModelAttribute Numbers numbers){
        return "response";
    }
}
