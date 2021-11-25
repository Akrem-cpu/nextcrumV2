@regression
Feature: 9. As a user, I should be able to send an event.



  Scenario: hr users send event.
    Given hr user is login in to the hr account
    When hr user click on event
    And hr user give need filed
    Then hr user click on send
    Then hr user should see the event created

  Scenario: marketing users send event.
    Given marketing user is login in to the marketing account
    When marketing user click on event
    And marketing user give need filed
    Then marketing user click on send
    Then marketing user should see the event created

  Scenario: helpdesk users send event.
    Given helpdesk user is login in to the helpdesk account
    When helpdesk user click on event
    And helpdesk user give need filed
    Then helpdesk user click on send
    Then helpdesk user should see the event created

  Scenario:users can cancel events with CANCEL button
    Given helpdesk user is login in to the helpdesk account
    When helpdesk user click on event
    And helpdesk user give need filed
    Then helpdesk user should see the event removed


  Scenario:  users can check modify event tarting and ending time
    Given helpdesk user is login in to the helpdesk account
    When helpdesk user click on event
    And helpdesk user click on event start Time
    And helpdesk user give the time needed"9"
    And helpdesk user click on set time for the start time
    And helpdesk user clicks on the event end time
    And helpdesk user clicks on give date needed"12"
    And helpdesk user click on set time for the end time
    Then helpdesk user should see the date changed start time "9" end time "12"

   Scenario:  users can check ""All day""
    Given helpdesk user is login in to the helpdesk account
    When helpdesk user click on event
    And helpdesk user give need filed
     And helpdesk user click on all day check box
     Then helpdesk user should see time disapear from the page