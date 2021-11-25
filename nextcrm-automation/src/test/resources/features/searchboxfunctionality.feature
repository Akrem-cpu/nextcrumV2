@regression
Feature: "3. As a user, I should be able to search people,
  document and more from search box"


  3. users get ""Employees"", ""Groups"", ""Menu itemts"", and ""search"" once typeing at least a letter
  "

  Scenario: hr user search a valid info : employee, doc, post, task
    Given hr user is login in to the hr account
    Then hr user type "hello" in the search box
    And  hr user click on search
    Then hr user should see "hello" post

  Scenario: marketing user search a valid info : employee, doc, post, task
    Given marketing user is login in to the marketing account
    Then marketing  user type "hello" in the search box
    And  marketing user click on search
    Then marketing  user should see "hello" post

  Scenario: helpdesk user search a valid info : employee, doc, post, task
    Given helpdesk user is login in to the helpdesk account
    Then helpdesk  user type "hello" in the search box
    And  helpdesk user click on search
    Then helpdesk user should see "hello" post

    Scenario: users cannot find an invalid info, the page should show "" Nothing Found"" (negative)
      Given helpdesk user is login in to the helpdesk account
      And helpdesk  user type "invalid" in the search box
      Then helpdesk should see "Nothing found" message