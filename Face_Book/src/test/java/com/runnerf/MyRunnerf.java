package com.runnerf;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="Feature/",
        glue= {"com_stepdefinitionf","com.hooksf"},
        plugin= {"json:target/cucumber.json"},
        monochrome=true,
        dryRun=false,
        tags="@smoke"
        
        
        
        
        
        )

public class MyRunnerf extends AbstractTestNGCucumberTests {

}
