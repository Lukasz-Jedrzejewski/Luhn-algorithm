package com.jedrzejewski.Luhn.algorithm.Controller;

import com.jedrzejewski.Luhn.algorithm.model.Numbers;
import com.jedrzejewski.Luhn.algorithm.service.impl.NumbersServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class Controller {

    private final NumbersServiceImpl numbersService;

    public Controller(NumbersServiceImpl numbersService) {
        this.numbersService = numbersService;
    }

    @GetMapping("/")
    public String get(Model model) {
        model.addAttribute("numbers", new Numbers());
        return "index";
    }

    @PostMapping("/")
    public String post(@ModelAttribute Numbers numbers, Model model){
        model.addAttribute("result", numbersService.validate(numbers.toString()));
        model.addAttribute("checkDigit", numbersService.getACheckDigit(numbers.toString()));
        return "response";
    }
}
