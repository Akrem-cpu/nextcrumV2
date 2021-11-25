@regression
Feature:4)As a user, I should be able to create a poll

  Scenario:users  hr create a poll with Q/A
    Given hr user is login in to the hr account
    When hr click on poll
    And hr write a title
    And hr write the question
    And hr give the options
    And hr user click on send
    Then hr should see the created poll

  Scenario:users  marketing create a poll with Q/A
    Given marketing user is login in to the marketing account
    When marketing click on poll
    And marketing write a title
    And marketing write the question
    And marketing give the options
    And marketing user click on send
    Then marketing should see the created poll

  Scenario:users  helpdesk create a poll with Q/A
    Given helpdesk user is login in to the helpdesk account
    When helpdesk click on poll
    And helpdesk write a title
    And helpdesk write the question
    And helpdesk give the options
    And helpdesk user click on send
    Then helpdesk should see the created poll

    Scenario: users get error message The message title is not specified
     Given helpdesk user is login in to the helpdesk account
     When helpdesk click on poll
     And helpdesk write the question
     And helpdesk give the options
     And helpdesk user click on send
     Then helpdesk should see "The message title is not specified" error Message

    Scenario:  users check ""allow multiple Choice"" while create a poll
      Given helpdesk user is login in to the helpdesk account
      When helpdesk click on poll
      And helpdesk write a title
      And helpdesk write the question
      And helpdesk give the options
      And helpdesk click on multiple answer check box
      Then helpdesk should see multiple answer check box selected

  Scenario:  users can add more questions to a poll
    Given helpdesk user is login in to the helpdesk account
    When helpdesk click on poll
    And helpdesk write a title
    And helpdesk click on add question
    Then helpdesk user should see extra box for question

  Scenario:  users can can Cancel creating a poll
    Given helpdesk user is login in to the helpdesk account
    When helpdesk click on poll
    And helpdesk write a title
    And helpdesk click on Cancel button
    Then helpdesk should see the poll canceled