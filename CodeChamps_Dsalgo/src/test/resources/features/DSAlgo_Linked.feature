@link
Feature: Validating Linked List Page

  @TS_linked_01
  Scenario: The user is navigate to linkedlist page
    Given The user is on login page
    When The user enter "Numpy" and "testuser01"
    Then The user should be redirected to home page as "Numpy"
    When The user click get started in linked panel
    Then The user redirected to "Linked List" page

  @TS_linked_02
  Scenario: The user is navigate to introduction page
    Given The user is on linkedlist page
    When The user click on "introduction" link
    Then The user is redirected to "Linked List" page
    When The user click "introduction" link
    Then The user is redirected to "Introduction" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |

  @TS_linked_03
  Scenario: The user is navigate to creating linked lIst page
    Given The user is on linkedlist page
    When The user click on "creatinglinkedlist" link
    Then The user is redirected to "Linked List" page
    When The user click "creatinglinkedlist" link
    Then The user is redirected to "Creating Linked LIst" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |

  @TS_linked_04
  Scenario: The user is navigate to types-of-linked-list page
    Given The user is on linkedlist page
    When The user click on "typesoflinkedlist" link
    Then The user is redirected to "Linked List" page
    When The user click "typesoflinkedlist" link
    Then The user is redirected to "Types of Linked List" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         1 |

  @TS_linked_05
  Scenario: The user is navigate to implement-linked-list-in-python page
    Given The user is on linkedlist page
    When The user click on "implementlinkedlistinpython" link
    Then The user is redirected to "Linked List" page
    When The user click "implementlinkedlistinpython" link
    Then The user is redirected to "Implement Linked List in Python" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         1 |

  @TS_linked_06
  Scenario: The user is navigate to traversal page
    Given The user is on linkedlist page
    When The user click on "traversal" link
    Then The user is redirected to "Linked List" page
    When The user click "traversal" link
    Then The user is redirected to "Traversal" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         1 |

  @TS_linked_07
  Scenario: The user is navigate to insertion-in-linked-list page
    Given The user is on linkedlist page
    When The user click on "insertioninlinkedlist" link
    Then The user is redirected to "Linked List" page
    When The user click "insertioninlinkedlist" link
    Then The user is redirected to "Insertion" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         1 |

  @TS_linked_08
  Scenario: The user is navigate to deletion-in-linked-list page
    Given The user is on linkedlist page
    When The user click on "deletioninlinkedlist" link
    Then The user is redirected to "Linked List" page
    When The user click "deletioninlinkedlist" link
    Then The user is redirected to "Deletion" page
    When The user click try here button
    Then The user is redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         1 |
