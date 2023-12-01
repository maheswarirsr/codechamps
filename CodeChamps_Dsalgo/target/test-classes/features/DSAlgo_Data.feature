@data_structure
Feature: Validating DataStructure Page

  Scenario: The user is navigate to DS introduction page
    Given The user is on login page
    When The user enter "Numpy" and "testuser01"
    Then The user should be redirected to home page as "Numpy"
    When The user click get started
    Then The user redirected to "Data Structures-Introduction" page
    When The user click Time complexity link
    Then The user redirected to "Time Complexity" page
    When The user click Try here button
    Then The user redirected to "Assessment" page

  Scenario Outline: The user submits python code  	
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
      | Sheet2    |         1 |
      
