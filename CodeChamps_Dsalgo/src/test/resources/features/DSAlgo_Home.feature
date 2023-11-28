@home
Feature: User launch dsalgo application and test Home page

  @TS_home_01
  Scenario: User launch home page of an dsalgo project
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage

  @TS_home_02
  Scenario Outline: User is on home page and click dropdown without signin
    Given The user is on home page
    When The user clicks on dropdown "<option>"
    Then The user get warning message "You are not logged in"

    Examples: 
      | option      |
      | Arrays      |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |

  @TS_home_03
  Scenario Outline: User is on home page and click getstarted without signin
    Given The user is on home page
    When The user click on getstarted in homepage "<option>" without signin
    Then The user get warning message "You are not logged in"

    Examples: 
      | option      |
      | Array       |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |

  @TS_home_04
  Scenario: User is on home page and click Register link
    Given The user is on home page
    When The user click on register link
    Then The user redirected to register page

  @TS_home_05
  Scenario: User is on home page and click signin link
    Given The user is on home page
    When The user click on signin link
    Then The user redirected to login page
