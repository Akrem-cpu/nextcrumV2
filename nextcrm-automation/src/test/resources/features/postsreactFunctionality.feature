@regression
Feature:7) As a user, I should be able to do
  see posts from homepage.




   Scenario: hr users click Like button for any post
     Given hr user is login in to the hr account
     When hr user click on like button for the first post user see
     Then hr user should be able to see a thumps up with "You" text

  Scenario: marketing users click Like button for any post
    Given marketing user is login in to the marketing account
    When marketing user click on like button for the first post user see
    Then marketing user should be able to see a thumps up with "You" text

  Scenario: helpdesk users click Like button for any post
    Given helpdesk user is login in to the helpdesk account
    When helpdesk user click on like button for the first post user see
    Then helpdesk user should be able to see a thumps up with "You" text

    Scenario:  users are able to follow a post by clicking Follow button
      Given helpdesk user is login in to the helpdesk account
      When helpdesk user click on follow button
      Then helpdesk should see "Unfollow" text

      Scenario: users can see who are the people viewed a post with eye icon
        Given helpdesk user is login in to the helpdesk account
        When helpdesk user click on the view icon
        Then helpdesk should see the people who viewed the post

  Scenario: users click star icon to save a post as favorite
    Given helpdesk user is login in to the helpdesk account
    When helpdesk user click the star icon to save the post to favorites
    Then helpdesk user should see the post added to favorites post

  Scenario: users can write comment to a post
    Given helpdesk user is login in to the helpdesk account
    When helpdesk user click on the comment box
    Then helpdesk user write a comment
    Then helpdesk user click on send button
    Then helpdesk user should see the comment

  Scenario: users cancel a comment with Cancel button
    Given helpdesk user is login in to the helpdesk account
    When helpdesk user click on the comment box
    Then helpdesk user click cancel button
    Then helpdesk user should see the comment canceled