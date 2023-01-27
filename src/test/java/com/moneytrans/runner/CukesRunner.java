package com.moneytrans.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"

        },

        features = "src/test/resources/features_money",
        glue = "com/moneytrans/step_def",
        dryRun = false,
        tags = "",
        //"@wip and @googleSearch"
        //"@student or @admin
        //"@Regression and not @student"
        publish = false //create a link to share test report

)
public class CukesRunner {
}
