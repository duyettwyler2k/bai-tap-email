package com.codegym.controller;

import com.codegym.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController {
    Email email=new Email("VietNamese",25,true,"hello");
    @GetMapping("/emails")
    public ModelAndView showForm(){
        ModelAndView modelAndView=new ModelAndView("/views","email",email);
        return modelAndView;
    }
    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute(name="email") Email newEmail){
        email=newEmail;
        ModelAndView modelAndView=new ModelAndView("/views","email",email);
        return modelAndView;
    }
}
