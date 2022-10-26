@AGIL-1610
Feature: As a user, I should be able to logout from the app

  @AGIL-1607
  Scenario: AC-1 HR user can log out and ends up on the login page.
            AC-2 HR user can not go to the home page again by clicking
                 the step back button after successfully logging out.
            AC-3 HR user must be logged out if the user closes the open tab

    ######---AC-1---#######
    Given HR user logged in and on home page
    When user click on user menu
    And  user click on logout link
    Then user should land on login page
    ######---AC-2---#######
    And user try to navigate back
    Then user should land on login page
    ######---AC-3---#######
    And user close the browser
    And user open new browser and try to navigate to home page
    Then user should land on login page


  @AGIL-1608
  Scenario: AC-1 Helpdesk user can log out and ends up on the login page.
            AC-2 Helpdesk user can not go to the home page again by clicking
                 the step back button after successfully logging out.
            AC-3 Helpdesk user must be logged out if the user closes the open tab

    ######---AC-1---#######
    Given Helpdesk user logged in and on home page
    When user click on user menu
    And  user click on logout link
    Then user should land on login page
    ######---AC-2---#######
    And user try to navigate back
    Then user should land on login page
    ######---AC-3---#######
    And user close the browser
    And user open new browser and try to navigate to home page
    Then user should land on login page




  @AGIL-1609
  Scenario: AC-1 Marketing user can log out and ends up on the login page.
            AC-2 Marketing user can not go to the home page again by clicking
                 the step back button after successfully logging out.
            AC-3 Marketing user must be logged out if the user closes the open tab

    ######---AC-1---#######
    Given Marketing user logged in and on home page
    When user click on user menu
    And  user click on logout link
    Then user should land on login page
    ######---AC-2---#######
    And user try to navigate back
    Then user should land on login page
    ######---AC-3---#######
    And user close the browser
    And user open new browser and try to navigate to home page
    Then user should land on login page

