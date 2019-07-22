package com.bdd.cicddemo.controller;

import com.bdd.cicddemo.dto.Login;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.util.StringUtils.isEmpty;

@Controller
@RequestMapping
public class Views {

    /*@PostMapping("/login")
    public ModelAndView add(@RequestBody Login login) {

        if(isEmpty(login.getUsername()))
            System.out.print("Username cannot be empty");
        else
            System.out.println("Username is "+login.getUsername());

        if(isEmpty(login.getPassword()))
            System.out.print("password cannot be empty");

        ModelAndView modelAndView = new ModelAndView();
        if(login.getUsername().equals(login.getPassword())) {

            modelAndView.setViewName("Success");
            return modelAndView;
        }

        modelAndView.setViewName("Failed");

        return modelAndView;
    }*/

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/success")
    public String Success() {
        return "Success";
    }

    @RequestMapping("/my-error")
    public String error() {
        return "Error";
    }
}
