@register
Feature: Validating register page

  @TS_register_01
  Scenario: The user get error message for empty field  username and password textbox
    Given The user open register page
    When The user click Register button
    Then It should display error message "Please fill out this field."

  @TS_register_02
  Scenario: The user get error message for invalid  username
    Given The user open register page
    When The user enters a "username" with characters other than Letters, digits and "@/./+/-/_"
      | username | password | password confirmation |
      | &*#%^89! | testuser | testuser              |
    And The user click Register button
    Then The user get error message "password_mismatch:The two password fields didn’t match."

  @TS_register_03
  Scenario: The user get error message for validate password
    Given The user open register page
    When The user enters a valid "username" and "password" similar to username
      | username | password | password confirmation |
      | user     | user01   | user01                |
    And The user click Register button
    Then The user get error message "password_mismatch:The two password fields didn’t match."

  @TS_register_04
  Scenario: The user get error message for validate password
    Given The user open register page
    When The user enters a valid "username" and "password" with characters less than 8
      | username | password | password confirmation |
      | user     | word     | word                  |
    And The user click Register button
    Then The user get error message "password_mismatch:The two password fields didn’t match."

  @TS_register_05
  Scenario: The user get error message for validate password
    Given The user open register page
    When The user enters a valid "username" and commonly used password "password"
      | username | password | password confirmation |
      | user     | welcome  | welcome               |
    And The user click Register button
    Then The user get error message "password_mismatch:The two password fields didn’t match."

  @TS_register_06
  Scenario: The user get error message for validate password
    Given The user open register page
    When The user enters a valid "username" and "password" with only numbers
      | username | password | password confirmation |
      | user     | 12345678 |              12345678 |
    And The user click Register button
    Then The user get error message "password_mismatch:The two password fields didn’t match."

  @TS_register_07
  Scenario: The user redirected to home page with valid credentials
    Given The user open register page
    When The user enters a valid "username" and "password" and "password confirmation"
      | username | password   | password confirmation |
      | Numpy    | testuser01 | testuser01            |
    And The user click Register button
    Then The user should be redirected to homepage with message "New Account Created. You are logged in as <username>"
