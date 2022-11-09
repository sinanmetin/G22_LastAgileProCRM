
Feature: AC-1 User should be able to display the company structure.

  Background:
    Given user is on login page

  Scenario Outline: 1. User should be able to display the company structure
    When "<user>" login with "<username>" and "<password>"
    And user click on the Employees button
    Then user should see the company structure display

    Examples:
      | user      | username                       | password |
      | HR        | hr36@cybertekschool.com        | UserUser |
      | Helpdesk  | helpdesk18@cybertekschool.com  | UserUser |
      | Marketing | marketing25@cybertekschool.com | UserUser |

  Scenario Outline: 2. User should be able to add a department
    When "<user>" login with "<username>" and "<password>"
    And user click on the Employees button
    And user click on the add department button
    And user type any department name
    And user click on the add button
    Then user should see the department he added

    Examples:
      | user      | username                       | password |
      | HR        | hr36@cybertekschool.com        | UserUser |
      | Helpdesk  | helpdesk18@cybertekschool.com  | UserUser |
      | Marketing | marketing25@cybertekschool.com | UserUser |

  Scenario Outline: 5. User should be able to export the employee list
    When "<user>" login with "<username>" and "<password>"
    And user click on the Employees button
    And user click on the find employee button
    And user click on the More... button
    And user click on the export to excel button
    Then user should be able to export the employee list on an excel file

    Examples:
      | user      | username                       | password |
      | HR        | hr36@cybertekschool.com        | UserUser |
      | Helpdesk  | helpdesk18@cybertekschool.com  | UserUser |
      | Marketing | marketing25@cybertekschool.com | UserUser |

  @smoke
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

