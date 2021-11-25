@smoke @wip
Feature: 1) nextbasecrm login functionality
    User story : As a user, I should be able to login to the app

  Scenario:As a Helper user, I should be able to login to the app

    When User input valid Credentials
    And Helper user click on Login
    Then User should see in title "(62) portal"

  Scenario:  As a hr user, I should be able to login to the app
    When hr User input valid Credentials
    And hr user click on Login
    Then User should see title "(53) portal"

  Scenario:As a marketing user, I should be able to login to the app
    When marketing User input valid Credentials
    And marketing user click on Login
    Then marketing User should see title "(84) portal"

  Scenario: users cannot login with invalid credentials.(Negative )
    When  User input invalid Credentials
    And user click on Login
    Then User should see "Incorrect login or password" massage displayed

  Scenario: verify users can check ""Remember me on this computer"" option
    When Helper user input valid Credentials
    And Helper user click on Remember me on this compute check box
    And Helper user login
    And Helper user log out
    And Helper user empty the user clear user name and password
    And Helper user refresh the page
    Then Helper  user should be able to see the username on the username box

  Scenario: verify users can check ""Remember me on this computer"" option
    When user click on FORGOT YOUR PASSWORD link
    Then user should see the "Get Password" title
