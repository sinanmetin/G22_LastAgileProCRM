package com.cydeo.agileProCrm.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
        },

        glue = "com/cydeo/agileProCrm/step_definitions",
        features = "@target/rerun.txt"


)

public class FailedTestRunner {
}
