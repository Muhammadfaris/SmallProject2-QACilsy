@regression1 @regression
Feature: Booking Flow
  As a user
  I want make some hotel reservation with booking hotel apps

  Background: User is Logged In
    Given User on the login page
    When User fills Email "coba@gmail.com" and Password "coba12334"
    Then Verify user successfully login
    And User navigate to Homepage

  @Booking01
  Scenario: User should be able to make some booking room with Bank Wire payment method
    Given User fills some data for searching hotel on Homepage
    And User navigate to the hotel result preference
    When User chooses the preferred hotel
    Then Verify user successfully proceed checkout with Bank Wire payment method

  @Booking02
  Scenario: User should be able to make some booking room with Bank Wire payment method
    Given User fills some data for searching hotel on Homepage
    And User navigate to the hotel result preference
    When User chooses the preferred hotel
    Then Verify user successfully proceed checkout with Check payment method

