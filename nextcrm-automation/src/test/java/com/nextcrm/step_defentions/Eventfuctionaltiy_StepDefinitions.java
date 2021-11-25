package com.nextcrm.step_defentions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.utilities.BrowserUtils;
import library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import library.utilities.*;

public class Eventfuctionaltiy_StepDefinitions {
    String data = new Faker().name().firstName();
    String actualEndTime = "";
    String actualStartTime = "";

//8723984

    /**
     * Scenario: hr users send event.
     */
    @When("hr user click on event")
    public void hr_user_click_on_event() {
        Pages.getStream().event.click();
    }
    @When("hr user give need filed")
    public void hr_user_give_need_filed() {
        Driver.getDriver().switchTo().frame(Pages.getStream().firstIframe);
        Pages.getStream().textBoxInsideCommentIframe.sendKeys(data);
        Driver.getDriver().switchTo().defaultContent();
    }
    @Then("hr user should see the event created")
    public void hr_user_should_see_the_event_created() {
        BrowserUtils.sleep(1);
        Assert.assertTrue(Pages.getStream().mostRecentPostedEvent.isDisplayed());
        Assert.assertTrue(Pages.getStream().mostRecentPostedEvent.getText().contains(data));

    }
    /**
     *  Scenario: marketing users send event.
     */


    @When("marketing user click on event")
    public void marketing_user_click_on_event() {
        Pages.getStream().event.click();
    }
    @When("marketing user give need filed")
    public void marketing_user_give_need_filed() {
        Driver.getDriver().switchTo().frame(Pages.getStream().firstIframe);
        Pages.getStream().textBoxInsideCommentIframe.sendKeys(data);
        Driver.getDriver().switchTo().defaultContent();
    }
    @Then("marketing user should see the event created")
    public void marketing_user_should_see_the_event_created() {
        BrowserUtils.sleep(1);
        Assert.assertTrue(Pages.getStream().mostRecentPostedEvent.isDisplayed());
        Assert.assertTrue(Pages.getStream().mostRecentPostedEvent.getText().contains(data));
    }

    /**
     *     Scenario: helpdesk users send event.
     */
    @When("helpdesk user click on event")
    public void helpdesk_user_click_on_event() {
        Pages.getStream().event.click();
    }
    @When("helpdesk user give need filed")
    public void helpdesk_user_give_need_filed() {
        Driver.getDriver().switchTo().frame(Pages.getStream().firstIframe);
        Pages.getStream().textBoxInsideCommentIframe.sendKeys(data);
        Driver.getDriver().switchTo().defaultContent();
    }
    @Then("helpdesk user should see the event created")
    public void helpdesk_user_should_see_the_event_created() {
        BrowserUtils.sleep(1);
        Assert.assertTrue(Pages.getStream().mostRecentPostedEvent.isDisplayed());
        Assert.assertTrue(Pages.getStream().mostRecentPostedEvent.getText().contains(data));
    }

    /**
     *  Scenario:users can cancel events with CANCEL button
     */

    @Then("helpdesk user should see the event removed")
    public void helpdesk_user_should_see_the_event_removed() {
        Pages.getStream().cancelButton.click();
        Assert.assertFalse(Pages.getStream().sendMessage.isDisplayed());
    }


    /**
     *  users can check modify event tarting and ending time
     */

    @When("helpdesk user click on event start Time")
    public void helpdesk_user_click_on_event_start_date() {

        Pages.getStream().startTimeBoxForEvenCreation.click();

    }
    @And("helpdesk user give the time needed{string}")
    public void helpdeskUserGiveTheDateNeeded(String arg0) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(Pages.getStream().startTimeBoxForEvenCreation));
        Pages.closeStream();
        Pages.getStream().startTimeBoxTOChangeTime.clear();
        Pages.getStream().startTimeBoxTOChangeTime.sendKeys(arg0+ Keys.ENTER);
        actualStartTime = Driver.getDriver().findElement(By.xpath("//div[@class='bxc-title'][1]")).getAttribute("innerText");

    }
    @And("helpdesk user click on set time for the start time")
    public void helpdeskUserClickOnSetTime() {
        Pages.getStream().setStartTimeForEventCreation.click();
    }


    @When("helpdesk user clicks on the event end time")
    public void helpdesk_user_clicks_on_the_even_date() {
        Pages.getStream().endTimeBoxForEventCreation.click();


    }
    @And("helpdesk user clicks on give date needed{string}")
    public void helpdeskUserClicksOnGiveDateNeeded(String arg0) {
        Pages.getStream().endTimeBoxToChangeTime.clear();
        Pages.getStream().endTimeBoxToChangeTime.sendKeys(arg0+Keys.ENTER);



    }
    @And("helpdesk user click on set time for the end time")
    public void helpdeskUserClickOnSetTimeForTheEndTime() {
        Pages.getStream().setEndTimeForEvenCreation.click();
        actualEndTime = Driver.getDriver().findElement(By.xpath("//div[@id='feed_cal_event_to_timecal_3Jcl_div']")).getAttribute("innerText");

    }


    @Then("helpdesk user should see the date changed start time {string} end time {string}")
    public void helpdeskUserShouldSeeTheDateChangedStartTimeEndTime(String arg0, String arg1) {
        System.out.println(actualStartTime);
        System.out.println(actualEndTime);
        Assert.assertTrue(actualStartTime.contains(arg0));
        Assert.assertTrue(actualEndTime.contains(arg1));




    }

    /**
     * users can chekc ""All day""
     */
    @And("helpdesk user click on all day check box")
    public void helpdeskUserClickOnAllDayCheckBox() {
        Pages.getStream().allDayButtonForEventCreation.click();
    }

    @Then("helpdesk user should see time disapear from the page")
    public void helpdeskUserShouldSeeTimeDisapearFromThePage() {
        Assert.assertFalse(Pages.getStream().endTimeBoxForEventCreation.isDisplayed());
        Assert.assertFalse(Pages.getStream().startTimeBoxForEvenCreation.isDisplayed());

    }
}
