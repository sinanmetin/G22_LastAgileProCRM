@AGIL-1810
Feature: AC-1 User should be able to display the company structure.

  Background:
    Given user is on login page

  @AGIL-1767
  Scenario Outline: 1. User should be able to display the company structure
    When "<user>" login with "<username>" and "<password>"
    And user clicks on "Employees" on Activity Stream Menu
    Then user should see the company structure display


    Examples:
      | user      | username                       | password |
      | HR        | hr36@cybertekschool.com        | UserUser |
      | Helpdesk  | helpdesk18@cybertekschool.com  | UserUser |
      | Marketing | marketing25@cybertekschool.com | UserUser |


  @AGIL-1768
  Scenario Outline: 2. User should be able to add a department
    When "<user>" login with "<username>" and "<password>"
    And user clicks on "Employees" on Activity Stream Menu
    And user click on the add department button
    And user type any department name
    And user click on the add button
    Then user should see the department he added

    Examples:
      | user | username                | password |
      | HR   | hr39@cybertekschool.com | UserUser |
      | HR   | hr18@cybertekschool.com | UserUser |
      | HR   | hr25@cybertekschool.com | UserUser |


  @AGIL-1808
  Scenario Outline: 6. User should be able to display the telephone directory
    When "<user>" login with "<username>" and "<password>"
    And user click on the Employees button
    And user click on the telephone directory button
    Then user should be able to see the telephon directory display

    Examples:
      | user      | username                       | password |
      | HR        | hr36@cybertekschool.com        | UserUser |
      | Helpdesk  | helpdesk18@cybertekschool.com  | UserUser |
      | Marketing | marketing25@cybertekschool.com | UserUser |

  @AGIL-1809
  Scenario Outline: 7. User should be able to send messages to employee from the telephone directory
    When "<user>" login with "<username>" and "<password>"
    And user click on the Employees button
    And user click on the telephone directory button
    And user click on any employee
    And user click on send message button
    And user types a message and clicks the enter button
    Then user should send the message

    Examples:
      | user      | username                       | password |
      | HR        | hr36@cybertekschool.com        | UserUser |
      | Helpdesk  | helpdesk18@cybertekschool.com  | UserUser |
      | Marketing | marketing25@cybertekschool.com | UserUser |

