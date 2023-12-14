@graph
Feature: Validating Graph Page

  @TS_graph_01
  Scenario: The user is navigate to Graph page
    Given The user is on login page
    When The user enter "Numpy" and "testuser01"
    Then The user should be redirected to home page as "Numpy"
    When The user click get started button on "Graph" page
    Then The user redirected to "Graph" page

  @TS_graph_02
  Scenario: User verifies Graph link
    Given The user is on graph page
    When The user click "graph" link in Graph Page
    Then The user redirected to "Graph" page
    When The user click Try here button
    Then The user redirected to "Assessment" page

  Scenario Outline:  The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
      | Sheet2    |         1 |

  @TS_graph_03
  Scenario: User verifies Graph Representations link
    Given The user is on graph page
    When The user click "graph-representations" link in Graph Page
    Then The user redirected to "Graph Representations" page
    When The user click Try here button
    Then The user redirected to "Assessment" page

  Scenario Outline:  The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
      | Sheet2    |         1 |
