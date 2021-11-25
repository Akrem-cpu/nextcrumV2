package com.nextcrm.step_defentions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.pages.Authorization;
import library.utilities.Driver;
import org.junit.Assert;
import library.utilities.*;
public class NextbaseLogin_StepDefinitions {

    /**
     * Scenario:  As a Helper user, I should be able to login to the app
     */

    @When("User input valid Credentials")
    public synchronized void user_input_valid_credentials() {
         Authorization.inputValidCredentials("helperUserName");
    }
    @When("Helper user click on Login")
    public synchronized void helper_user_click_on_login() {
        Pages.getAuthorization().loginButton.click();
    }
    @Then("User should see in title {string}")
    public synchronized void user_should_see_in_title(String string) {
     String actualTitle = Driver.getDriver().getTitle();
     String expectedTitle = "(62) portal";
     Assert.assertEquals(actualTitle,expectedTitle,string);
     Driver.closeDriver();
    }




    /**
     *  Scenario:  As a Hr user, I should be able to login to the app
     */

    @When("hr User input valid Credentials")
    public synchronized void hr_user_input_valid_credentials() {
        Authorization.inputValidCredentials("hrUserName");
    }
    @When("hr user click on Login")
    public synchronized void hr_user_click_on_login() {
        Pages.getAuthorization().loginButton.click();
    }
    @Then("User should see title {string}")
    public synchronized void userShouldSeeTitle(String arg0) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "(53) portal";
        Assert.assertEquals(actualTitle,expectedTitle,arg0);
        Driver.closeDriver();
    }






    /**
     * Scenario:As a marketing user, I should be able to login to the app
     */

    @When("marketing User input valid Credentials")
    public synchronized void marketing_user_input_valid_credentials() {
        Authorization.inputValidCredentials("mrUserName");
    }
    @When("marketing user click on Login")
    public synchronized void marketing_user_click_on_login() {

        Pages.getAuthorization().loginButton.click();
    }
    @Then("marketing User should see title {string}")
    public synchronized void marketing_user_should_see_title(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "(84) portal";
        Assert.assertEquals(actualTitle,expectedTitle,string);
        Driver.closeDriver();
    }








    /**
     * Scenario: users cannot login with invalid credentials.(Negative )
     */

    @When("User input invalid Credentials")
    public synchronized void user_input_invalid_credentials() {
       Authorization.inputInvalidCredentials();
    }
    @When("user click on Login")
    public synchronized void user_click_on_login() {

        Pages.getAuthorization().loginButton.click();
    }
    @Then("User should see {string} massage displayed")
    public synchronized void user_should_see_massage_displayed(String string) {
        Authorization page = new Authorization();
        String actualErrorMessage = page.ErrorMessage.getText();
        String expectedErrorMessage = "Incorrect login or password";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage,string);
        Driver.closeDriver();

    }






    /**
     * Scenario: verify users can check ""Remember me on this computer"" option
     */

    @When("Helper user input valid Credentials")
    public synchronized void helper_user_input_valid_credentials() {
       Authorization.inputValidCredentials("helperUserName");
    }
    @When("Helper user click on Remember me on this compute check box")
    public synchronized void helper_user_click_on_remember_me_on_this_compute_check_box() {
        Pages.getAuthorization().rememberMeCheckBox.click();
    }
    @When("Helper user login")
    public synchronized void helper_user_login() {
    Pages.getAuthorization().loginButton.click();
    }
    @When("Helper user log out")
    public synchronized void helper_user_log_out() {
        Pages.getStream().userInfDiv.click();
        Pages.getStream().Logout.click();
    }
    @When("Helper user empty the user clear user name and password")
    public synchronized void helper_user_empty_the_user_clear_user_name_and_password() {

      Pages.getAuthorization().userNameInputBox.clear();
      Pages.getAuthorization().passwordInputBox.clear();

    }
    @When("Helper user refresh the page")
    public synchronized void helper_user_refresh_the_page() {
        Driver.getDriver().navigate().refresh();

    }
    @Then("Helper  user should be able to see the username on the username box")
    public synchronized void helper_user_should_be_able_to_see_the_username_on_the_username_box() {

        String actualUserName = Pages.getAuthorization().userNameInputBox.getAttribute("value");
        String expectedUserName = ConfiReader.getProperty("helperUserName");
       Assert.assertEquals(actualUserName,expectedUserName);
       Driver.closeDriver();



    }

    /**
     *  Scenario: verify users can check ""Remember me on this computer"" option
     */

    @When("user click on FORGOT YOUR PASSWORD link")
    public synchronized void user_click_on_forgot_your_password_link() {

        Pages.getAuthorization().forgotMyPasswordLink.click();
    }
    @Then("user should see the {string} title")
    public synchronized void user_should_see_the_title(String string) {
       String actualTitle = Driver.getDriver().getTitle();
       String expectedTitle = "Get Password";
       Assert.assertEquals(actualTitle,expectedTitle,string);
       Driver.closeDriver();

    }









}
