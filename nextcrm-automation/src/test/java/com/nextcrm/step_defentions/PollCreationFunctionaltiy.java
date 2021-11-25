package com.nextcrm.step_defentions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.utilities.BrowserUtils;
import library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import library.utilities.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PollCreationFunctionaltiy {
    Faker faker = new Faker();
    String title = faker.lorem().word();
    String question = faker.lorem().word();
    List<String > options = new ArrayList<>(Arrays.asList("happy","sad"));

    /**
     *     Scenario:users  hr create a poll with Q/A
     */
    @When("hr click on poll")
    public void hr_click_on_poll() {
        Pages.getStream().poll.click();

    }
    @When("hr write a title")
    public void hr_write_a_title() {
        Driver.getDriver().switchTo().frame(Pages.getStream().firstIframe);
        Pages.getStream().messageBoxInsideIframeOne.sendKeys(title);
        Driver.getDriver().switchTo().defaultContent();
    }
    @When("hr write the question")
    public void hr_write_the_question() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(Pages.getStream().questionBoxForPollCreation));
        Pages.getStream().questionBoxForPollCreation.sendKeys(question);

    }
    @When("hr give the options")
    public void hr_give_the_options() {

        new WebDriverWait(Driver.getDriver(),15).until(ExpectedConditions.visibilityOf(Pages.getStream().listOfVoteAnswerForPollCreation.get(0)));
        for (int i = 0; i < 2 ; i++) {
            Pages.getStream().listOfVoteAnswerForPollCreation.get(i).sendKeys(options.get(i));
        }
       Assert.assertTrue(Pages.getStream().multipleChoiceAllowButtonForPollCreation.isDisplayed());
    }
    @Then("hr should see the created poll")
    public void hr_should_see_the_created_poll() {

        BrowserUtils.sleep(1);
        String expectedPollTitle = title;
        String actualPollTitle = Pages.getStream().firstRecentlyPostedMessage.getText();
        Assert.assertEquals(expectedPollTitle,actualPollTitle);
        Driver.closeDriver();
    }



    /**
     *   Scenario:users  marketing create a poll with Q/A
     */
    @And("marketing click on poll")
    public void marketingClickOnPoll() {

        Pages.getStream().poll.click();
    }
    @And("marketing write a title")
    public void marketingWriteATitle() {
        Driver.getDriver().switchTo().frame(Pages.getStream().firstIframe);
        Pages.getStream().messageBoxInsideIframeOne.sendKeys(title);
        Driver.getDriver().switchTo().defaultContent();
    }
    @And("marketing write the question")
    public void marketingWriteTheQuestion() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(Pages.getStream().questionBoxForPollCreation));
        Pages.getStream().questionBoxForPollCreation.sendKeys(question);
    }
    @And("marketing give the options")
    public void marketingGiveTheOptions() {
        new WebDriverWait(Driver.getDriver(),15).until(ExpectedConditions.visibilityOf(Pages.getStream().listOfVoteAnswerForPollCreation.get(0)));
        for (int i = 0; i < 2 ; i++) {
            Pages.getStream().listOfVoteAnswerForPollCreation.get(i).sendKeys(options.get(i));
        }
        Assert.assertTrue(Pages.getStream().multipleChoiceAllowButtonForPollCreation.isDisplayed());
    }
    @Then("marketing should see the created poll")
    public void marketingShouldSeeTheCreatedPoll() {
        BrowserUtils.sleep(1);
        String expectedPollTitle = title;
        String actualPollTitle = Pages.getStream().firstRecentlyPostedMessage.getText();
        Assert.assertEquals(expectedPollTitle,actualPollTitle);
        Driver.closeDriver();
    }

    /**
     * Scenario:users  helpdesk create a poll with Q/A
     */
    @When("helpdesk click on poll")
    public void helpdesk_click_on_poll() {
        Pages.getStream().poll.click();
    }
    @When("helpdesk write a title")
    public void helpdesk_write_a_title() {
        Driver.getDriver().switchTo().frame(Pages.getStream().firstIframe);
        Pages.getStream().messageBoxInsideIframeOne.sendKeys(title);
        Driver.getDriver().switchTo().defaultContent();
    }
    @When("helpdesk write the question")
    public void helpdesk_write_the_question() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(Pages.getStream().questionBoxForPollCreation));
        Pages.getStream().questionBoxForPollCreation.sendKeys(question);
    }
    @When("helpdesk give the options")
    public void helpdesk_give_the_options() {
        new WebDriverWait(Driver.getDriver(),15).until(ExpectedConditions.visibilityOf(Pages.getStream().listOfVoteAnswerForPollCreation.get(0)));
        for (int i = 0; i < 2 ; i++) {
            Pages.getStream().listOfVoteAnswerForPollCreation.get(i).sendKeys(options.get(i));
        }
        Assert.assertTrue(Pages.getStream().multipleChoiceAllowButtonForPollCreation.isDisplayed());
    }
    @Then("helpdesk should see the created poll")
    public void helpdesk_should_see_the_created_poll() {

        BrowserUtils.sleep(1);
        String expectedPollTitle = title;
        String actualPollTitle = Pages.getStream().firstRecentlyPostedMessage.getText();
        Assert.assertEquals(expectedPollTitle,actualPollTitle);
        Driver.closeDriver();
    }

    /**
     * Scenario: users get error message The message title is not specified
     *
     */
    @Then("helpdesk should see {string} error Message")
    public void helpdeskShouldSeeErrorMessage(String arg0) {
        String actualText = Pages.getStream().errorMessageWhenTryingToCreatingPollWithOutTitle.getText();
      Assert.assertEquals(arg0,actualText);

    }

    /**
     * users check ""allow multiple Choice"" while create a poll
     */
    @And("helpdesk click on multiple answer check box")
    public void helpdeskClickOnMultipleAnswerCheckBox() {
        Assert.assertFalse(Pages.getStream().multipleChoiceAllowButtonForPollCreation.isSelected());
        Pages.getStream().multipleChoiceAllowButtonForPollCreation.click();
    }
    @Then("helpdesk should see multiple answer check box selected")
    public void helpdeskShouldSeeMultipleAnswerCheckBoxSelected() {
        Assert.assertTrue(Pages.getStream().multipleChoiceAllowButtonForPollCreation.isSelected());
    }

    /**
     *  Scenario:  users can add more questions to a poll
     */
    @And("helpdesk click on add question")
    public void helpdeskClickOnAddQuestion() {
        new WebDriverWait(Driver.getDriver(),15).until(ExpectedConditions.visibilityOf(Pages.getStream().addQuestionWhenCreatingPoll));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(Pages.getStream().addQuestionWhenCreatingPoll).perform();
        Pages.getStream().addQuestionWhenCreatingPoll.click();
    }
    @Then("helpdesk user should see extra box for question")
    public void helpdeskUserShouldSeeExtraBoxForQuestion() {
        Integer expectedBoxNumber = 2;
        Integer actualBoxNumber = Pages.getStream().allAddedQuestionWhenCreatedAPoll.size();
        Assert.assertEquals(actualBoxNumber,expectedBoxNumber);
    }




    /**
     *  Scenario:  users can can Cancel creating a poll
     */

    @And("helpdesk click on Cancel button")
    public void helpdeskClickOnCancelButton() {
        new Actions(Driver.getDriver()).moveToElement(Pages.getStream().cancelButton).perform();
        Pages.getStream().cancelButton.click();
    }


    @Then("helpdesk should see the poll canceled")
    public void helpdeskShouldSeeThePollCanceled() {
        Assert.assertFalse(Pages.getStream().questionBoxForPollCreation.isDisplayed());
    }
}
