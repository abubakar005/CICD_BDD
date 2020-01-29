package com.bdd.cicddemo.controller;

import com.bdd.cicddemo.dto.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.StringUtils.isEmpty;


@RestController
@RequestMapping
public class Login {

    //@GetMapping("cicddemo-bdd/")
    @GetMapping("/login")
    public ResponseEntity<LoginResponse> add(com.bdd.cicddemo.dto.Login login) {

        if(isEmpty(login.getUsername())){
            System.out.println("Username cannot be empty");
            return ResponseEntity.ok(new LoginResponse("Username cannot be empty"));
        } else
            System.out.println("Username is " + login.getUsername());

        if(isEmpty(login.getPassword())) {
            System.out.println("password cannot be empty");
            return ResponseEntity.ok(new LoginResponse("Password cannot be empty"));
        } else
            System.out.println("Password is " + login.getPassword());

        if(login.getUsername().equals(login.getPassword()))
            return ResponseEntity.ok( new LoginResponse("Login Successful"));

        return ResponseEntity.ok(new LoginResponse("User not found"));
    }
}
