@regression4 @regression
Feature: Registration Functionality

  @Register
  Scenario Outline: Verify user should be can Registration on Hotel site
    Given User is on the Homepage of the application
    And User navigates to login page
    Then Verify user on login page
    When User fills Email "<email>" to create account
    Then Verify user on registration page
    When User fills registration details : "<email>", "<firstname>", "<lastname>", "<password>", "<days>", "<months>", "<years>"
    Then Verify user successfully registered

    Examples:
      | email            | firstname | lastname  | password | days | months | years |
      | coba12@gmail.com | farisima  | imaduddin | coba1234 | 20   | 8      | 1997  |