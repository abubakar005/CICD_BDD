package com.bdd.cicddemo.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        plugin = { "pretty", "json:target/Cucumber.json" }
)
//@Cucumber.Options( format={"json:target/Destination/cucumber.json"})
public class LoginTest {
}
