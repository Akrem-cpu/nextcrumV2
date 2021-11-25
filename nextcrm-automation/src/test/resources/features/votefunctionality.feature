@regression
Feature:5)As a user, I should be able to vote for a poll


  Scenario:users  marketing create a poll with Q/A

    When marketing user is login in to the marketing account
    And marketing click on poll
    And marketing write a title
    And marketing write the question
    And marketing give the options
    And marketing user click on send
    Then marketing should see the created poll



  Scenario:users hr can select an answer to vote a poll.
    Given hr user is login in to the hr account
    And hr user check the box that user like to vote for
    And hr user click on the vote button
    Then hr user should see "VOTE AGAIN" text

  Scenario:users marketing can select an answer to vote a poll.
    Given marketing user is login in to the marketing account
    And marketing user check the box that user like to vote for
    And marketing user click on the vote button
    Then marketing user should see "VOTE AGAIN" text


  Scenario:users helpdesk can select an answer to vote a poll.
    Given helpdesk user is login in to the helpdesk account
    And helpdesk  user check the box that user like to vote for
    And helpdesk user click on the vote button
    Then helpdesk  user should see "VOTE AGAIN" text

  Scenario:users helpdesk can select an answer to vote a poll.
    Given helpdesk user is login in to the helpdesk account
    And helpdesk  user check the box that user like to vote for
    And helpdesk user click on the VOTE AGAIN button
    Then helpdesk should see "VOTE" button

  Scenario:only vote owner stop the poll with STOP button
    Given marketing user is login in to the marketing account
    Then marketing user should see "STOP" text on the poll that user created




