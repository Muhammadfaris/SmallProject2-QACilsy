@regression2 @regression
Feature: Home Page Functionality

  User want to explore functionality on the homepage apps

  @Positive @Home1
  Scenario: Verify user should be navigate to sign in page
    Given User is on the Homepage of the application
    When User navigates to login page
    Then Verify user on login page

  @Positive @Home2
  Scenario: Verify user should be navigate to cart page
    Given User is on the Homepage of the application
    When User click cart symbol
    Then Verify user navigates to cart page

  @Positive @Home3
  Scenario: Verify user should be navigate to hotel result preference without login
    Given User is on the Homepage of the application
    When User fills some data for searching hotel on Homepage
    Then User navigate to the hotel result preference

  @Positive @Home4
  Scenario: Verify user should be on the homepage after click in logo apps
    When User click logo apps on the Homepage
    Then User is on the Homepage of the application

  @Positive @Home5
  Scenario: Verify user should be see menu list after click nav button
    When User click hamburger navigation button
    Then User must see list menu

  @Positive @Home6
  Scenario: Verify user should be navigate to Home after click Home on Nav Menu
    Given User click hamburger navigation button
    And User must see list menu
    When User click Home on Nav Menu
    Then User is on the Homepage of the application

  @Positive @Home7
  Scenario: Verify user should be navigate to Interior section on Homepage after click Interior on Nav Menu
    Given User click hamburger navigation button
    And User must see list menu
    When User click Interior on Nav Menu
    Then User navigate to Interior section on Homepage

  @Positive @Home8
  Scenario: Verify user should be navigate to Amenities section on Homepage after click Amenities on Nav Menu
    Given User click hamburger navigation button
    And User must see list menu
    When User click Amenities on Nav Menu
    Then User navigate to Amenities section on Homepage

  @Positive @Home9
  Scenario: Verify user should be navigate to Our Rooms section on Homepage after click Rooms on Nav Menu
    Given User click hamburger navigation button
    And User must see list menu
    When User click Rooms on Nav Menu
    Then User navigate to Rooms section on Homepage

  @Positive @Home10
  Scenario: Verify user should be navigate to Testimonials section on Homepage after click Testimonials on Nav Menu
    Given User click hamburger navigation button
    And User must see list menu
    When User click Testimonials on Nav Menu
    Then User navigate to Testimonials section on Homepage

  @Positive @Home11
  Scenario: Verify user should be navigate to Legal Notice page after click Legal Notice on Nav Menu
    Given User click hamburger navigation button
    And User must see list menu
    When User click Legal Notice on Nav Menu
    Then User navigate to Legal Notice section on Homepage

  @Positive @Home12
  Scenario: Verify user should be navigate to About us page after click About us on Nav Menu
    Given User click hamburger navigation button
    And User must see list menu
    When User click About Us on Nav Menu
    Then User navigate to About Us section on Homepage

  @Positive @Home13
  Scenario: Verify user should be navigate to Contact page after click Contact on Nav Menu
    Given User click hamburger navigation button
    And User must see list menu
    When User click Contact on Nav Menu
    Then User navigate to Contact Notice section on Homepage

  @Positive @Home14
  Scenario: Verify user should be can close menu list
    Given User click hamburger navigation button
    And User must see list menu
    When User click close button
    Then User is on the Homepage of the application

  @Positive @Home15
  Scenario: Verify user should be can sliding picture on Interior section
    Given User is on the Homepage of the application
    When User click next navigation slider on Interior section
    Then Verify user can see next picture

  @Positive @Home16
  Scenario: Verify user should be can't navigate to result search page with blank data fills on the search hotel feature
    Given User is on the Homepage of the application
    When User click search button on hotel search function
    Then Verify user can't navigate to result search hotel

  @Negative @Home17
  Scenario: Verify user should be can't navigate to result search page only with hotel location data fills on the search hotel feature
    Given User is on the Homepage of the application
    When User fills correct hotel location only
    Then Verify user can't navigate to result search hotel

  @Negative @Home18
  Scenario: Verify user should be can't navigate to result search page only with hotel name data fills on the search hotel feature
    Given User is on the Homepage of the application
    When User fills hotel name only
    Then Verify user can't navigate to result search hotel

  @Negative @Home19
  Scenario: Verify user should be can't navigate to result search page only with check in data fills on the search hotel feature
    Given User is on the Homepage of the application
    When User fills check in date only
    Then Verify user can't navigate to result search hotel

  @Negative @Home20
  Scenario: Verify user should be can't navigate to result search page only with check out data fills on the search hotel feature
    Given User is on the Homepage of the application
    When User fills check out date only
    Then Verify user can't navigate to result search hotel

  @Negative @Home21
  Scenario: Verify user should be can't navigate to result search page with wrong hotel location data fills on the search hotel feature
    Given User is on the Homepage of the application
    When User fills wrong hotel location
    Then Verify user can't navigate to result search hotel