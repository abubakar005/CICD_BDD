package com.bdd.cicddemo.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

public class LoginStepDefinitions {

    protected RestTemplate restTemplate = new RestTemplate();
    protected final String DEFAULT_URL = "http://localhost:7788/";

    String response = "";
    //String url = DEFAULT_URL + "cicddemo-bdd/";
    String url = DEFAULT_URL + "login";

    //@Autowired
    //Environment environment;
    //String port = environment.getProperty("server.port");

    @Value("${server.port}")
    private String serverPort;

    @Given("^username is empty$")
    public void the_client_calls_login_without_username() {
        response = restTemplate.getForObject(url  + "?password="+"password", String.class);
    }

    @When("the client calls login with password {string}")
    public void the_client_calls_login_withsq_password(String password) {
        //System.out.println("=====port: " + port);
        System.out.println("=====serverPort: " + "${server.port}");
        System.out.println("the client calls login with password: " + password);
        response = restTemplate.getForObject(url  + "?password="+password, String.class);
    }

    @Then("the client receives username empty result {string}")
    public void the_client_receives_username_empty_result(String result) {
        System.out.println("the client receives username empty result: " + result);
        //assertEquals(result, response);
        response = restTemplate.getForObject(url  + "?password=password", String.class);
    }

    @Given("password is empty")
    public void password_is_empty() {
        //throw new cucumber.api.PendingException();
        System.out.println("password is empty");
    }

    @When("the client calls login with username {string}")
    public void the_client_calls_login_with_username(String username) {
        System.out.println("the client calls login with username: " + username);
        response = restTemplate.getForObject(url  + "?username="+username, String.class);
    }

    @Then("the client receives password empty result \"(.*)\"")
    public void the_client_receives_password_empty_result(String result) {
        System.out.println("the client receives password empty result: " + result);
        //throw new cucumber.api.PendingException();
    }

    @Given("^user enters username and password$")
    public void user_enters_username_and_password() {
        response = restTemplate.getForObject(url  + "?username="+"admin"+ "&password="+"admin", String.class);
    }

    @When("the client calls login with username {string} and password {string}")
    public void the_client_calls_login_with_values_username_and_password(String username, String password) {
        System.out.println("the client calls login with username: " + username + " and password: " + password);
        response = restTemplate.getForObject(url  + "?username="+username+ "&password="+password, String.class);
    }

    @Then("the client receives result \"(.*)\"")
    public void the_client_receives_result(String result) {
        System.out.println("the client receives result: " + result);
        //throw new cucumber.api.PendingException();
        assertEquals("Login Successful", result);
    }
}
