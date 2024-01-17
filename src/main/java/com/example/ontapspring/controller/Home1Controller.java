package com.example.ontapspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home1")
public class Home1Controller {
    @GetMapping()
    public String Home1Controller(){
        return "/view/home1";
    }
    @GetMapping("/calculator1")
    public String calculator1 (@RequestParam("number1")float number1,
                              @RequestParam ("number2")float number2,
                              @RequestParam ("option") String option,
                              Model model){
        float result = 0;
        switch (option) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        };
        model.addAttribute("calculator",result);
        return "/view/result1";

    }
}
