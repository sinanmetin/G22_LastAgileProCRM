Feature:As a user, I should be able to login

  Background:
    Given user is on login page
  @wip
  Scenario Outline:User should be able to login as HR user
    When hr enter username "<username>"
    And hr enter password "<password>"
    And user click on login button
    Then user should see dashboard

    Examples:
      | username                 | password |
      | hr7@cybertekschool.com   | UserUser |
      | hr15@cybertekschool.com  | UserUser |
      | hr22@cybertekschool.com  | UserUser |
      | hr39@cybertekschool.com  | UserUser |
      | hr42@cybertekschool.com  | UserUser |
      | hr57@cybertekschool.com  | UserUser |
      | hr66@cybertekschool.com  | UserUser |
      | hr75@cybertekschool.com  | UserUser |
      | hr80@cybertekschool.com  | UserUser |
      | hr93@cybertekschool.com  | UserUser |
      | hr101@cybertekschool.com | UserUser |
  @wip
  Scenario Outline:User should be able to login as Helpdesk user
    When Helpdesk enter username "<username>"
    And Helpdesk enter password "<password>"
    And user click on login button
    Then user should see dashboard

    Examples:
      | username                       | password |
      | helpdesk3@cybertekschool.com   | UserUser |
      | helpdesk18@cybertekschool.com  | UserUser |
      | helpdesk23@cybertekschool.com  | UserUser |
      | helpdesk37@cybertekschool.com  | UserUser |
      | helpdesk44@cybertekschool.com  | UserUser |
      | helpdesk51@cybertekschool.com  | UserUser |
      | helpdesk68@cybertekschool.com  | UserUser |
      | helpdesk75@cybertekschool.com  | UserUser |
      | helpdesk82@cybertekschool.com  | UserUser |
      | helpdesk90@cybertekschool.com  | UserUser |
      | helpdesk101@cybertekschool.com | UserUser |

  Scenario Outline:User should be able to login  as Marketing
    When Marketing enter username "<username>"
    And Marketing enter password "<password>"
    And user click on login button
    Then user should see dashboard

    Examples:
      | username                        | password |
      | marketing2@cybertekschool.com   | UserUser |
      | marketing13@cybertekschool.com  | UserUser |
      | marketing26@cybertekschool.com  | UserUser |
      | marketing32@cybertekschool.com  | UserUser |
      | marketing45@cybertekschool.com  | UserUser |
      | marketing59@cybertekschool.com  | UserUser |
      | marketing63@cybertekschool.com  | UserUser |
      | marketing78@cybertekschool.com  | UserUser |
      | marketing84@cybertekschool.com  | UserUser |
      | marketing99@cybertekschool.com  | UserUser |
      | marketing101@cybertekschool.com | UserUser |

  Scenario Outline: Users should not be able to login with invalid credentials
    When user enter invalid username "<username>"
    And user enter invalid password "<password>"
    And user click on login button
    Then user see the error message

    Examples:
      | username                      | password |
      | invalid                       | invalid  |
      | helpdesk1@cybertekschool.com  | invalid  |
      | hr1@cybertekschool.com        | invalid  |
      | marketing1@cybertekschool.com | invalid  |
      | invalid@cybertekschool.com    | UserUser |

  Scenario:User should be able to click "Remember me on this computer" checkbox
    When user click on remember me checkbox
    Then checkbox should be selected
    When user click on remember me checkbox
    Then checkbox should be deselected


  Scenario:User should be able to click "FORGOT YOUR PASSWORD?" link
    When user click forgot password link
    Then get password page should be opened






