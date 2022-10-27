@AGIL-1610
Feature: As a user, I should be able to logout from the app

  Background:
    Given user is on login page

  @AGIL-1607
  Scenario Template: AC-1 "<user>" can log out and ends up on the login page.
                     AC-2 "<user>" can not go to the home page again by clicking
                          the step back button after successfully logging out.
                     AC-3 "<user>" must be logged out if the user closes the open tab

    ######---AC-1---#######
    Given "<user>" login with "<username>" and "<password>"
    When user click on user menu
    And  user click on logout link
    Then user should land on login page
    ######---AC-2---#######
    And user try to navigate back
    Then user should land on login page
    ######---AC-3---#######
    And user close the browser
    And user is on login page
    Then user should land on login page

    Examples:
      | user      | username                       | password |
      | HR        | hr7@cybertekschool.com         | UserUser |
      | HR        | hr75@cybertekschool.com        | UserUser |
      | HR        | hr46@cybertekschool.com        | UserUser |
      | Helpdesk  | helpdesk18@cybertekschool.com  | UserUser |
      | Helpdesk  | helpdesk95@cybertekschool.com  | UserUser |
      | Helpdesk  | helpdesk54@cybertekschool.com  | UserUser |
      | Marketing | marketing25@cybertekschool.com | UserUser |
      | Marketing | marketing2@cybertekschool.com  | UserUser |
      | Marketing | marketing87@cybertekschool.com | UserUser |


