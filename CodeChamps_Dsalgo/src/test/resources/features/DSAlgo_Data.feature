@data_structure
Feature: Validating DataStructure Page

  @TS_DataStructure
  Scenario Outline: The user is navigate to DS introduction page
    Given The user is on login page
    When The user enter "Numpy" and "testuser01"
    Then The user should be redirected to home page as "Numpy"
    When The user click get started
    Then The user redirected to "Data Structures-Introduction" page
    When The user click Time complexity link
    Then The user redirected to "Time Complexity" page
    When The user click Try here button
    Then The user redirected to "Assessment" page
    When The user enter the sheet "<sheetname>" and <rownumber>
    And The user click run button

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
      | Sheet2    |         1 |
