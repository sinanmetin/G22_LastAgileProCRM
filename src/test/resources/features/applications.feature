@AGIL-1820
Feature: As a user, I can use Applications menu; so that I can install or manage the applications.

  @AGIL-1818
  Scenario Outline:
  AC 1 - Verify that user can display the applications
  AC 2 - Verify that user can send a request for installing if there is no permission for installing

    Given user logged in with valid credentials "<username>" and "<password>"
    When user clicks on "Applications" on Activity Stream Menu
    Then user land on the All applications page
    And user clicks on the "Dependent fields" application
    And user clicks on the Install button
    And user sees confirmation popup and send a request
    Then user can see popup message for sent request

    Examples:
      | username                       | password |
      | hr43@cybertekschool.com        | UserUser |
      | marketing39@cybertekschool.com | UserUser |
      | helpdesk33@cybertekschool.com  | UserUser |

  @AGIL-1819
  Scenario Outline: : Verify that user can display the application's
  description, versions, support and installation

    Given user logged in with valid credentials "<username>" and "<password>"
    When user clicks on "Applications" on Activity Stream Menu
    And user clicks on the "Dependent fields" application
    Then user can display all content types

    Examples:
      | username                       | password |
      | hr33@cybertekschool.com        | UserUser |
      | marketing33@cybertekschool.com | UserUser |
      | helpdesk33@cybertekschool.com  | UserUser |







