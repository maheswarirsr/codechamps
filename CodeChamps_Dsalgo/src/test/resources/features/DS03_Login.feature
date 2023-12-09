@login
Feature: Validating Login Page

  @TS_login_01
  Scenario: Login with invalid credentials
    Given The user is on login page
    When The user enter invalid "username" and "password"
      | username | password |
      | Numpy    |          |
      |          | testuser |
      |          |          |
    And The user click login button
    Then It should display error message "Please fill out this field."

  @TS_login_02
  Scenario Outline: Login with valid and invalid credentials
    Given The user is on login page
    When The user enter sheet "<sheetname>" and <rownumber>
    Then The user get error message "Invalid Username and Password"

    Examples: 
      | sheetname | rownumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |

  @TS_login_03
  Scenario: Login with valid  credentials
    Given The user is on login page
    When The user enter "Numpy" and "testuser01"
    Then The user should be redirected to home page as "Numpy"

  @TS_login_04
  Scenario: Verify signout link
    Given The user is on login page with valid "Numpy" and "testuser01"
    When The user click signout link
    Then The user should be redirected to home page with message "Logged out successfully"
    
