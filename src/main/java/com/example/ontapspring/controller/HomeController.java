package com.example.ontapspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping()
    public String HomeController(){
        return "/view/home";
    }
    @GetMapping("/calculator")
    public String calculator(@RequestParam("number1") int number1, @RequestParam("number2") int number2, Model model){
        int sum = number1+number2;
        model.addAttribute("sumTwoNumbers",sum);
        return "/view/result";
    }


}