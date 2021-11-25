package com.nextcrm.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features ="C:\\Users\\akrem\\nextcrumV2\\nextcrm-automation\\src\\test\\resources\\features",
        glue = "com/nextcrm/step_defentions",
        dryRun =  false,
        tags = "@wip"


)

public class CukesRunner {

}

