@queue
Feature: User launch DSAlgo application and test Queue page

  @TS_queue_01
  Scenario: The user is navigate to queue page
    Given The user is on login page
    When The user enter "Numpy" and "testuser01"
    Then The user should be redirected to home page as "Numpy"
    When The user click get started in queue panel
    Then The user redirected to "Queue" page

  @TS_queue_02
  Scenario: The user is able to navigate to the Implementation of Queue in Python page
    Given User is in the Queue Page after logged in
    When User clicks on the Implementation of Queue in Python link
    Then User redirected to "Implementation of Queue in Python" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |

  @TS_queue_03
  Scenario: The user is able to navigate to the Implementation using collections.deque page
    Given User is in the Queue Page after logged in
    When User clicks on the Implementation using collections.deque link
    Then User redirected to "Implementation using collections.deque" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
      
   @TS_queue_04
  Scenario: The user is able to navigate to the Implementation using array page
    Given User is in the Queue Page after logged in
    When User clicks on the Implementation using array link
    Then User redirected to "Implementation using array" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
      
   @TS_queue_05
  Scenario: The user is able to navigate to the Queue Operations page
    Given User is in the Queue Page after logged in
    When User clicks on the Queue Operations link
    Then User redirected to "Queue Operations" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
  
