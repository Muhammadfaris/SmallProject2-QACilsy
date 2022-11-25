@regression3 @regression
Feature: Login Functionality

  @Negative @login1-5
  Scenario Outline: Verify user can't login with uncorrected credentials
    Given User on the login page
    When User fills Email "<email>" and Password "<password>"
    Then Verify error message for invalid credentials "<status>"
    Examples:
      | email          | password  | status                     |  |
      |                |           | An email address required. |  |
      | coba@gmail.com | coba1     | Authentication failed.     |  |
      | abc@gmail.com  |           | Password is required.      |  |
      |                | coba12334 | An email address required. |  |
      | hai@gmail.com  | hai1234   | Authentication failed.     |  |

  @Positive @login6
  Scenario: Verify user can login with correct credentials
    Given User on the login page
    When User fills Email "coba@gmail.com" and Password "coba12334"
    Then Verify user successfully login