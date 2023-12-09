@tree
Feature: Validating Tree Page

  @TS_tree_01
  Scenario: The user is navigate to tree page
    Given The user is on login page
    When The user enter "Numpy" and "testuser01"
    Then The user should be redirected to home page as "Numpy"
    When The user click get started in tree panel
    Then The user redirected to "Tree" page

  @TS_tree_02
  Scenario: The user is validating the overview of trees
    Given The user is on tree page
    When The user click on "overviewoftrees" link
    Then The user is redirected to "Overview of Trees" page
    When The user click try here button
    Then The user redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
      | Sheet2    |         1 |

  @Ts_tree_03
  Scenario: The user is validating the terminologies
    Given The user is on tree page
    When The user click on "terminologies" link
    Then The user is redirected to "Terminologies" page
    When The user click try here button
    Then The user redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
      | Sheet2    |         1 |

  @Ts_tree_04
  Scenario: The user is validating the types-of-trees
    Given The user is on tree page
    When The user click on "typesoftrees" link
    Then The user is redirected to "Types of Trees" page
    When The user click try here button
    Then The user redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |

  @Ts_tree_05
  Scenario: The user is validating the tree-traversals
    Given The user is on tree page
    When The user click on "treetraversals" link
    Then The user is redirected to "Tree Traversals" page
    When The user click try here button
    Then The user redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |

  @Ts_tree_06
  Scenario: The user is validating the traversals-illustration
    Given The user is on tree page
    When The user click on "traversalsillustration" link
    Then The user is redirected to "Traversals-Illustration" page
    When The user click try here button
    Then The user redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         1 |

  @Ts_tree_07
  Scenario: The user is validating the binary-trees
    Given The user is on tree page
    When The user click on "binarytrees" link
    Then The user is redirected to "Binary Trees" page
    When The user click try here button
    Then The user redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         1 |

  @Ts_tree_08
  Scenario: The user is validating the types-of-binary-trees
    Given The user is on tree page
    When The user click on "typesofbinarytrees" link
    Then The user is redirected to "Types of Binary Trees" page
    When The user click try here button
    Then The user redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         1 |

  @Ts_tree_09
  Scenario: The user is validating the implementation-in-python
    Given The user is on tree page
    When The user click on "implementationinpython" link
    Then The user is redirected to "Implementation in Python" page
    When The user click try here button
    Then The user redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |

  @Ts_tree_10
  Scenario: The user is validating the binary-tree-traversals
    Given The user is on tree page
    When The user click on "binarytreetraversals" link
    Then The user is redirected to "Binary Tree Traversals" page
    When The user click try here button
    Then The user redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |

  @Ts_tree_11
  Scenario: The user is validating the implementation-of-binary-trees
    Given The user is on tree page
    When The user click on "implementationofbinarytrees" link
    Then The user is redirected to "Implementation of Binary Trees" page
    When The user click try here button
    Then The user redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |

  @Ts_tree_12
  Scenario: The user is validating the applications-of-binary-trees
    Given The user is on tree page
    When The user click on "applicationsofbinarytrees" link
    Then The user is redirected to "Applications of Binary trees" page
    When The user click try here button
    Then The user redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |

  @Ts_tree_13
  Scenario: The user is validating the binary-search-trees
    Given The user is on tree page
    When The user click on "binarysearchtrees" link
    Then The user is redirected to "Binary Search Trees" page
    When The user click try here button
    Then The user redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |

  @Ts_tree_14
  Scenario: The user is validating the implementation-of-bst
    Given The user is on tree page
    When The user click on "implementationofbst" link
    Then The user is redirected to "Implementation Of BST" page
    When The user click try here button
    Then The user redirected to "Assessment" page

  Scenario Outline: The user submits python code
    When The user enter the python code from sheet "<sheetname>" and <rownumber>
    And The user click run button
    Then The user should see the expected output

    Examples: 
      | sheetname | rownumber |
      | Sheet2    |         0 |
