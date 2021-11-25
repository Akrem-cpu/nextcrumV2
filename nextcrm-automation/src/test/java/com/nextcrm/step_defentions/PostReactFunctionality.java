package com.nextcrm.step_defentions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.pages.ActivityStream;
import library.utilities.BrowserUtils;
import library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import library.utilities.*;

public class PostReactFunctionality {
    /**
     *  hr users click Like button for any post
     */

    @When("hr user click on like button for the first post user see")
    public void hr_user_click_on_like_button_for_the_first_post_user_see() {
        if(!Pages.getStream().firstPostToLikeComfrmation.isDisplayed()){
            Pages.getStream().likeButtonForTheFirstPost.click();
        }
    }
    @Then("hr user should be able to see a thumps up with {string} text")
    public void hr_user_should_be_able_to_see_a_thumps_up_with_text(String string) {
        ActivityStream stream = new ActivityStream();
        String actualText = stream.firstPostToLikeComfrmation.getText();
        Assert.assertTrue(actualText.contains(string));


    }

    /**
     * Scenario: marketing users click Like button for any post
     */
    @When("marketing user click on like button for the first post user see")
    public void marketing_user_click_on_like_button_for_the_first_post_user_see() {
        if(!Pages.getStream().firstPostToLikeComfrmation.isDisplayed()){
            Pages.getStream().likeButtonForTheFirstPost.click();
        }



    }
    @Then("marketing user should be able to see a thumps up with {string} text")
    public void marketing_user_should_be_able_to_see_a_thumps_up_with_text(String string) {

        String actualText = Pages.getStream().firstPostToLikeComfrmation.getText();
        Assert.assertTrue(actualText.contains(string));

    }

    /**
     *  Scenario: helpdesk users click Like button for any post
     */
    @When("helpdesk user click on like button for the first post user see")
    public void helpdesk_user_click_on_like_button_for_the_first_post_user_see() {
        if(!Pages.getStream().firstPostToLikeComfrmation.isDisplayed()){
            Pages.getStream().likeButtonForTheFirstPost.click();
        }
    }
    @Then("helpdesk user should be able to see a thumps up with {string} text")
    public void helpdesk_user_should_be_able_to_see_a_thumps_up_with_text(String string) {
        String actualText =Pages.getStream().firstPostToLikeComfrmation.getText();
        Assert.assertTrue(actualText.contains(string));

    }


    /**
     * Scenario:  users are able to follow a post by clicking Follow button
     */

    @When("helpdesk user click on follow button")
    public void helpdesk_user_click_on_follow_button() {

        if(Pages.getStream().followButtonOnTheFirstMostRecentPost.getText().equals("Unfollow")){
            Pages.getStream().followButtonOnTheFirstMostRecentPost.click();
        }
        Pages.getStream().followButtonOnTheFirstMostRecentPost.click();
    }
    @Then("helpdesk should see {string} text")
    public void helpdesk_should_see_text(String string) {

        String actualText = Pages.getStream().followButtonOnTheFirstMostRecentPost.getText();
        Assert.assertEquals("there is diff b/n actual and expected this is the actual"+actualText,string,actualText);
    }
//Todo this TS keep failing when run together fix it.
    /**
     * Scenario: users can see who are the people viewed a post with eye icon
     */
    @When("helpdesk user click on the view icon")
    public void helpdesk_user_click_on_the_view_icon() {
        Pages.getStream().viewIconForTheMostRecentPost.click();
        BrowserUtils.sleep(5);

    }
    @Then("helpdesk should see the people who viewed the post")
    public void helpdesk_should_see_the_people_who_viewed_the_post() {
        BrowserUtils.fluentWait(Pages.getStream().peopleThatSeenThePostOnlyLoadOnThePageAfterYouClickOnTheViewButton,30);
        String actualText = Pages.getStream().peopleThatSeenThePostOnlyLoadOnThePageAfterYouClickOnTheViewButton.getText();
        String expectedText = "Views";
        Assert.assertEquals(actualText,expectedText);
    }

    /**
     Scenario: users click star icon to save a post as favorite
     */
    @When("helpdesk user click the star icon to save the post to favorites")
    public void helpdesk_user_click_the_star_icon_to_save_the_post_to_favorites() {

      String checkUp = Pages.getStream().addToFavoritesButtonForRecentPost.getAttribute("title");
      if(checkUp.equals("Remove from favorites")){
          Pages.getStream().addToFavoritesButtonForRecentPost.click();
      }
        Pages.getStream().addToFavoritesButtonForRecentPost.click();
      new  WebDriverWait(Driver.getDriver(),10).until(ExpectedConditions.attributeToBe(Pages.getStream().addToFavoritesButtonForRecentPost,"title","Remove from favorites"));
    }
    @Then("helpdesk user should see the post added to favorites post")
    public void helpdesk_user_should_see_the_post_added_to_favorites_post() {
        String actualText = Pages.getStream().addToFavoritesButtonForRecentPost.getAttribute("title");
        String expectedText = "Remove from favorites";
        Assert.assertEquals(actualText,expectedText);

    }

    /**
     *  Scenario: users can write comment to a post
     */

    @When("helpdesk user click on the comment box")
    public void helpdesk_user_click_on_the_comment_box() {
        Pages.getStream().commentBoxOnTheMostRecentPost.click();
    }
    @Then("helpdesk user write a comment")
    public void helpdesk_user_write_a_comment() {
        Driver.getDriver().switchTo().frame(Pages.getStream().iframeForCommentText);
        Pages.getStream().textBoxInsideCommentIframe.sendKeys(new Faker().name().fullName());
        Driver.getDriver().switchTo().defaultContent();
    }
    @Then("helpdesk user click on send button")
    public void helpdesk_user_click_on_send_button() {
        BrowserUtils.sleep(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(Pages.getStream().sendCommentForTheMostRecentPost).perform();
        new WebDriverWait(Driver.getDriver(),14).until(ExpectedConditions.visibilityOf(Pages.getStream().sendCommentForTheMostRecentPost));
        Pages.getStream().sendCommentForTheMostRecentPost.click();
    }
    @Then("helpdesk user should see the comment")
    public void helpdesk_user_should_see_the_comment() {
        Assert.assertTrue(Pages.getStream().firstCommentButtonForMostRecentPost.isDisplayed());
    }
    /**
     *    Scenario: users cancel a comment with Cancel button
     */

    @Then("helpdesk user click cancel button")
    public void helpdesk_user_click_cancel_button() {
       new  WebDriverWait(Driver.getDriver(),15).until(ExpectedConditions.visibilityOf(Pages.getStream().cancelButtonForCommentForRecentPost));
        new Actions(Driver.getDriver()).moveToElement(Pages.getStream().cancelButtonForCommentForRecentPost).perform();
        Pages.getStream().cancelButtonForCommentForRecentPost.click();
    }
    @Then("helpdesk user should see the comment canceled")
    public void helpdesk_user_should_see_the_comment_canceled() {
        new  WebDriverWait(Driver.getDriver(),15).until(ExpectedConditions.invisibilityOf(Pages.getStream().cancelButtonForCommentForRecentPost));
        Assert.assertFalse(Pages.getStream().sendCommentForTheMostRecentPost.isDisplayed());
    }


}
