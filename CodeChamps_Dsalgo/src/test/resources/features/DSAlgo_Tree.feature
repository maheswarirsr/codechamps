@tree
Feature: Validating Tree Page

  @TS_tree_01
  Scenario: The user is navigate to tree page
    Given The user is on login page
    When The user enter "Numpy" and "testuser01"
    Then The user should be redirected to home page as "Numpy"
    When The user click get started in tree panel
    Then The user redirected to "Tree" page

  
 