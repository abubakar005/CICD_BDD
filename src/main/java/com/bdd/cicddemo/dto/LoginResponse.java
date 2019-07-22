package com.bdd.cicddemo.dto;

import java.io.Serializable;

public class LoginResponse implements Serializable {

    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public LoginResponse(String response) {
        this.response = response;
    }

    public LoginResponse() {
    }
}
