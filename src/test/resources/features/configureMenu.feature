@wip
Feature: As a user, I should be able to configure menu; so that I can edit the menu options for quick access to custom menu

  Background:
    Given user is on login page

  Scenario Outline:
    Given "<user>" login with "<username>" and "<password>"
    When user click on Configure Menu
    And user click on Add Custom Menu Item
    And user enter Name "Google" and Link "https://google.com/"
    And user click on ADD button
    Then user should see "Google" on Activity Stream menu
    And user click on new link
    Then link should be redirected on new tab

    Examples:
      | user      | username                       | password |
      | HR        | hr7@cybertekschool.com         | UserUser |
      | Helpdesk  | helpdesk18@cybertekschool.com  | UserUser |
      | Marketing | marketing25@cybertekschool.com | UserUser |


  Scenario Outline:
    Given "<user>" login with "<username>" and "<password>"
    When user click on Configure Menu
    And user click on Reset Menu
    And user click on alert OK
    Then Activity Stream menu should reset to default

    Examples:
      | user      | username                       | password |
      | HR        | hr7@cybertekschool.com         | UserUser |
      | Helpdesk  | helpdesk18@cybertekschool.com  | UserUser |
      | Marketing | marketing25@cybertekschool.com | UserUser |


  Scenario Outline:
    Given "<user>" login with "<username>" and "<password>"
    When user click on Configure Menu
    And user click on Coolapse Menu
    Then Activity Stream menu should collapsed
    And user click on expand button
    Then Activity Stream menu should expand

    Examples:
      | user      | username                       | password |
      | HR        | hr7@cybertekschool.com         | UserUser |
      | Helpdesk  | helpdesk18@cybertekschool.com  | UserUser |
      | Marketing | marketing25@cybertekschool.com | UserUser |