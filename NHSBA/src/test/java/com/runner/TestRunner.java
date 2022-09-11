package com.runner;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/java/com/features",
        glue = {"com.test.stepdefs"},
        tags = {"@VerifyNHSBSAEligibilityCheckerFlow_Positive"},
        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/json-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun-reports/rerun.txt"
        },
        plugin = { "html:target/cucumber-html-report",
                "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt"})
@RunWith(Cucumber.class)
public class TestRunner {

}

/*

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
        import cucumber.api.CucumberOptions;
        import org.junit.runner.RunWith;

@RunWith(ExtendedCucumber.class)

@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
        features = "src/test/resources/features",
        glue = {"com.test.stepdefs"},
        tags = {"~@ignore"})

public class TestRunner{

}
*/
