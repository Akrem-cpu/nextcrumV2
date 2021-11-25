package com.nextcrm.step_defentions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import library.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import library.utilities.*;

public class Hooks {
    @Before
    public void setup()  {
        Driver.getDriver().get("https://login2.nextbasecrm.com/");

    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenShot =((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png",scenario.getName());
        }


        System.out.println("scenario.getStatus().toString() = " + scenario.getStatus().toString());
        System.out.println("scenario.getName() = " + scenario.getName());
        System.out.println("scenario.getId() = " + scenario.getId());


        if(Pages.getStream() !=null){
            Pages.closeStream();
        }
        if(Pages.getAuthorization() != null){
            Pages.closeAuthorization();
        }

        Driver.closeDriver();



    }
}
