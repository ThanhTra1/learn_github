Feature: Check Login
  As a QA, I want to login in the page, so verify function work well.

  Scenario: Login successfully
    Given User opens the Demo page with the url as "http://demo.guru99.com"
    When User enters the email is "trant@gmail.com"
    And User clicks the Submit button
    Then User receives username
    And User receives password



    When User opens the login page with the url as "http://demo.guru99.com/v4/"
    And User enters username
    And User enters pass
    And User clicks the Login button
    Then Message displayed Welcome to Manager's Page of Guru99 Bank