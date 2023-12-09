@array
Feature: Validating Array Page

  @TS_array_01
  Scenario: The user is navigate to array page
    Given The user is on login page
    When The user enter "Numpy" and "testuser01"
    Then The user should be redirected to home page as "Numpy"
    When The user click get started in array panel
    Then The user redirected to "Array" page

  @TS_array_02
  Scenario: The user is navigate to arrays in python page
    Given The user is on array page after logged in
    When The user click on Arrays in Python link
    Then The user is redirected to "Arrays in Python" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         1 |

  @TS_array_03
  Scenario: The user is navigate to arrays using list page
    Given The user is on array page after logged in
    When The user click on Arrays Using List link
    Then The user is redirected to "Arrays Using List" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         1 |

  @TS_array_04
  Scenario: The user is navigate to basic operations in lists page
    Given The user is on array page after logged in
    When The user click on Basic Operations in Lists link
    Then The user is redirected to "Basic Operations in Lists" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |

  @TS_array_05
  Scenario: The user is navigate to applications of array page
    Given The user is on array page after logged in
    When The user click on Applications of Array link
    Then The user is redirected to "Applications of Array" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |

  @TS_array_06
  Scenario: The user is navigate to practice questions page
    Given The user is on pactice question page after logged in
    When The user click on Search the array link
    Then The user is redirected to Questions page contains a tryEditor with Run and Submit buttons

  @TS_array_06
  Scenario Outline: The user is able to run code in tryEditor for Search the array link
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |         0 |

  @TS_array_07
  Scenario: The user is navigate to practice questions page
    Given The user is on pactice question page after logged in
    When The user click on Search the array link
    Then The user is redirected to Questions page contains a tryEditor with Run and Submit buttons

  @TS_array_07
  Scenario Outline: The user is able to run code in tryEditor for Search the array link
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click submit button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet3    |         1 |

  @TS_array_08
  Scenario: The user is navigate to practice questions page
    Given The user is on pactice question page after logged in
    When The user click on Max Consecutive Ones link
    Then The user is redirected to Questions page contains a tryEditor with Run and Submit buttons

  @TS_array_09
  Scenario: The user is navigate to practice questions page
    Given The user is on pactice question page after logged in
    When The user click on Find Numbers with Even Number of Digits link
    Then The user is redirected to Questions page contains a tryEditor with Run and Submit buttons

  @TS_array_10
  Scenario: The user is navigate to practice questions page
    Given The user is on pactice question page after logged in
    When The user click on Squares of a Sorted Array link
    Then The user is redirected to Questions page contains a tryEditor with Run and Submit buttons
