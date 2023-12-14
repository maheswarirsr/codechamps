@stack
Feature: Validating Stack Page

  @TS_stack_01
  Scenario: The user is navigate to Stack page
    Given The user is on login page
    When The user enter "Numpy" and "testuser01"
    Then The user should be redirected to home page as "Numpy"
    When The user click get started on "Stack" page
    Then The user redirected to "Stack" page

  @TS_stack_02
  Scenario: User verifies Operations in Stack link
    Given User is in the Stack Page after logged in
    When User clicks on the Operations in Stack link
    Then User redirected to "Operations in Stack" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
      | Sheet2    |         1 |

  @TS_stack_03
  Scenario: User verifies Implementation link
    Given User is in the Stack Page after logged in
    When User clicks on the Implementation link
    Then User redirected to "Implementation" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |

  @TS_stack_04
  Scenario: User verifies Applications link
    Given User is in the Stack Page after logged in
    When User clicks on the Applications link
    Then User redirected to "Applications" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
