@AGIL-1601
Feature:As a user, I should be able to login

  Background:
    Given user is on login page

  @AGIL-1597
  Scenario Outline:"<user>" should be able to login as
    When "<user>" enter username "<username>"
    And "<user>" enter password "<password>"
    And user click on login button
    Then user should see dashboard

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

  @AGIL-1598
  Scenario Outline: Users should not be able to login with invalid credentials
    When "<user>" enter username "<username>"
    And "<user>" enter password "<password>"
    And user click on login button
    Then user see the error message

    Examples:
      | user    | username                      | password |
      | invalid | invalid                       | invalid  |
      | invalid | helpdesk1@cybertekschool.com  | invalid  |
      | invalid | hr1@cybertekschool.com        | invalid  |
      | invalid | marketing1@cybertekschool.com | invalid  |
      | invalid | invalid@cybertekschool.com    | UserUser |

  @AGIL-1599
  Scenario:User should be able to click "Remember me on this computer" checkbox
    When user click on remember me checkbox
    Then checkbox should be selected
    When user click on remember me checkbox
    Then checkbox should be deselected

  @AGIL-1600
  Scenario:User should be able to click "FORGOT YOUR PASSWORD?" link
    When user click forgot password link
    Then get password page should be opened
