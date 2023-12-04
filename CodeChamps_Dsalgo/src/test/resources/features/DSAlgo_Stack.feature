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
Scenario: User verifies "Operations in Stack" link 
		Given The user is on stack page
		When The user click "operations-in-stack" link
    Then The user redirected to "Operations in Stack" page
    When The user click Try here button
    Then The user redirected to "Assessment" page
    
    Scenario Outline: 
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output
    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
      | Sheet2    |         1 |
      
@TS_stack_03
Scenario: User verifies "Implementation" link
		Given The user is on stack page 
		When The user click "implementation" link
    Then The user redirected to "Implementation" page
    When The user click Try here button
    Then The user redirected to "Assessment" page
    
    Scenario Outline: 
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output
    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
      | Sheet2    |         1 |
          
@TS_stack_04
Scenario: User verifies "Applications" link
		Given The user is on stack page 
		When The user click "stack-applications" link
    Then The user redirected to "Applications" page
    When The user click Try here button
    Then The user redirected to "Assessment" page
    
    Scenario Outline: 
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output
    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
      | Sheet2    |         1 |
          
          