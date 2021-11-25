@regression
Feature: 2) As a user, I should be able to send message

  Scenario: hr users  send message with ""MESSAGE"" tab
    Given hr user is login in to the hr account
    Then hr Type "Test message" in the Message box
    And hr user click on send
    Then hr user should see the text under activity stream

  Scenario: marketing users  send message with ""MESSAGE"" tab
    Given marketing user is login in to the marketing account
    Then marketing Type "Test message" in the Message box
    And marketing user click on send
    Then marketing user should see the text under activity stream


  Scenario: helpdesk users  send message with ""MESSAGE"" tab
    Given helpdesk user is login in to the helpdesk account
    When helpdesk Type "Test message" in the Message box
    And helpdesk user click on send
    Then helpdesk user should see the text under activity stream

  Scenario: helpdesk users  send message with ""MESSAGE"" tab
    Then Helper user input valid Credentials
    And Helper user login
    And helpdesk Type "Test message" in the Message box
    Then helpdesk should be able to click on cancel button

  Scenario: helpdesk users  send message with ""MESSAGE"" tab
    Then Helper user input valid Credentials
    And Helper user login
    And helpdesk Type  in the Message box
    And helpdesk click on link icon
    And helpdesk give a name and link
    And helpdesk click on save
    And helpdesk save the message
    Then helpdesk text should contain href attribute value that match the input





