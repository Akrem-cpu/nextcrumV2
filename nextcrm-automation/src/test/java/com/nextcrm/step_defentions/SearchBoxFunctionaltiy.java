package com.nextcrm.step_defentions;

import io.cucumber.java.en.Then;
import library.pages.ActivityStream;
import library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import library.utilities.*;


public class SearchBoxFunctionaltiy {

    /**
     * Scenario: hr user search a valid info : employee, doc, post, task
     * @param string
     */

    @Then("hr user type {string} in the search box")
    public void hr_user_type_in_the_search_box(String string) {
        Pages.getStream().searchBox.sendKeys(string);
    }
    @Then("hr user click on search")
    public void hr_user_click_on_search() {

        Pages.getStream().searchButton.click();
    }
    @Then("hr user should see {string} post")
    public void hrUserShouldSeePost(String arg0) {
       new  WebDriverWait(Driver.getDriver(),10).until(ExpectedConditions.visibilityOf(Pages.getStream().searchedPostOnlyForSearchPurposeNeedToChangeIfUsedAnotherSearchThing));
        String actualText = Pages.getStream().searchedPostOnlyForSearchPurposeNeedToChangeIfUsedAnotherSearchThing.getText();
        Assert.assertEquals(actualText, arg0);
    }

    /**
     * Scenario: marketing user search a valid info : employee, doc, post, task
     * @param string
     */
    @Then("marketing  user type {string} in the search box")
    public void marketing_user_type_in_the_search_box(String string) {
        Pages.getStream().searchBox.sendKeys(string);
    }
    @Then("marketing user click on search")
    public void marketing_user_click_on_search() {
        ActivityStream stream = new ActivityStream();
        stream.searchButton.click();
    }
    @Then("marketing  user should see {string} post")
    public void marketing_user_should_see_post(String string) {
        ActivityStream stream = new ActivityStream();
        new  WebDriverWait(Driver.getDriver(),10).until(ExpectedConditions.visibilityOf(stream.searchedPostOnlyForSearchPurposeNeedToChangeIfUsedAnotherSearchThing));
        String actualText = stream.searchedPostOnlyForSearchPurposeNeedToChangeIfUsedAnotherSearchThing.getText();
        Assert.assertEquals(actualText, string);
    }

    /**
     * Scenario: helpdesk user search a valid info : employee, doc, post, task
     * @param string
     */

    @Then("helpdesk  user type {string} in the search box")
    public void helpdesk_user_type_in_the_search_box(String string) {

        Pages.getStream().searchBox.sendKeys(string);
    }
    @Then("helpdesk user click on search")
    public void helpdesk_user_click_on_search() {
        Pages.getStream().searchButton.click();
    }
    @Then("helpdesk user should see {string} post")
    public void helpdesk_user_should_see_post(String string) {
        new  WebDriverWait(Driver.getDriver(),10).until(ExpectedConditions.visibilityOf(Pages.getStream().searchedPostOnlyForSearchPurposeNeedToChangeIfUsedAnotherSearchThing));
        String actualText = Pages.getStream().searchedPostOnlyForSearchPurposeNeedToChangeIfUsedAnotherSearchThing.getText();
        Assert.assertEquals(actualText, string);
    }

    /**
     * Scenario: users cannot find an invalid info, the page should show "" Nothing Found"" (negative)
     * @param arg0
     */

    @Then("helpdesk should see {string} message")
    public void helpdeskShouldSeeMessage(String arg0) {
        new  WebDriverWait(Driver.getDriver(),10).until(ExpectedConditions.visibilityOf(Pages.getStream().invalidSearch));
        String actualText = Pages.getStream().invalidSearch.getText();
        Assert.assertEquals(actualText, arg0);
    }

    //todo  3. users get ""Employees"", ""Groups"", ""Menu itemts"", and ""search"" once typeing at least a letter
    //todo dont understand this AC.





}
