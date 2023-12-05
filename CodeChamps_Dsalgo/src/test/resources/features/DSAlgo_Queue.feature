#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Queue
Feature: User launch DSAlgo application and test Queue page
    
		@TC_Queue_01
  	Scenario: The user is able to navigate to Queue page
    Given The user is on login page
    When The user enter "Numpy" and "testuser01"
    Then The user should be redirected to home page as "Numpy"
    When The user clicks the "Get Started" button in Queue Panel
    Then The user should be redirected to "Queue" page
    
  	@TC_Queue_02
  	Scenario: The user is able to navigate to Implementation of Queue in Python page
    Given The user is on the queue page
    When The user clicks "Implementation of Queue in Python" link
    Then The user should be redirected to "Implementation of Queue in Python" page
    When The user click try here button
    Then The user redirected to "Assessment" page
 
   Scenario Outline: The user submits python code
   When The user enter the python code from sheet "<Sheetname>" and <rownumber>
   And The user click run button
   Then The user should see the expected output

   Examples:
   | Sheetname | rownumber |
   | Sheet2    |         0 |
   | Sheet2    |         1 |
    
     @TC_Queue_03
  	Scenario: The user is able to navigate to Implementation using collections.deque page
    Given The user is on the queue page 
    When The user clicks "Implementation using collections.deque" link
    Then The user should be redirected to "Implementation using collections.deque" page
    When The user click try here button
    Then The user redirected to "Assessment" page
 
   Scenario Outline: The user submits python code
   When The user enter the python code from sheet "<Sheetname>" and <rownumber>
   And The user click run button
   Then The user should see the expected output

   Examples:
   | Sheetname | rownumber |
   | Sheet2    |         0 |
   | Sheet2    |         1 |
    
    @TC_Queue_04
  	Scenario: The user is able to navigate to Implementation using array page
    Given The user is on the queue page 
    When The user clicks "Implementation using array" link
    Then The user should be redirected to "Implementation using array" page
    When The user click try here button
    Then The user redirected to "Assessment" page
 
   Scenario Outline: The user submits python code
   When The user enter the python code from sheet "<Sheetname>" and <rownumber>
   And The user click run button
   Then The user should see the expected output

   Examples:
   | Sheetname | rownumber |
   | Sheet2    |         0 |
   | Sheet2    |         1 |
    
    @TC_Queue_05
  	Scenario: The user is able to navigate to Queue Operations page
    Given The user is on the queue page 
    When The user clicks "Queue Operations" link
    Then The user should be redirected to "Queue Operations" page
    When The user click try here button
    Then The user redirected to "Assessment" page
 
   Scenario Outline: The user submits python code
   When The user enter the python code from sheet "<Sheetname>" and <rownumber>
   And The user click run button
   Then The user should see the expected output

   Examples:
   | Sheetname | rownumber |
   | Sheet2    |         0 |
   | Sheet2    |         1 |
   
    
