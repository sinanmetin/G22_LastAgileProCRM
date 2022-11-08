@AGIL-1742
Feature: As a user, I should be able to configure menu; so that I can edit the menu options for quick access to custom menu

  Background:
    Given user is on login page

  @AGIL-1739
  Scenario Outline: AC-1 User can add custom menu item as Google to redirect google.com
    Given "<user>" login with "<username>" and "<password>"
    When user click on Configure Menu
    And user click on Add Custom Menu Item
    And user enter Name "Google" and Link "https://google.com/"
    And user click on ADD button
    And user click on "Google" link
    Then link should be redirected on new tab

    Examples:
      | user      | username                       | password |
      | HR        | hr15@cybertekschool.com        | UserUser |
      | Helpdesk  | helpdesk84@cybertekschool.com  | UserUser |
      | Marketing | marketing58@cybertekschool.com | UserUser |

  @AGIL-1740
  Scenario Outline: AC-3 User can reset menu
    Given "<user>" login with "<username>" and "<password>"
    When user click on Configure Menu
    And user click on Reset Menu
    And user click on alert OK
    Then Activity Stream menu should reset to default

    Examples:
      | user      | username                       | password |
      | HR        | hr15@cybertekschool.com        | UserUser |
      | Helpdesk  | helpdesk84@cybertekschool.com  | UserUser |
      | Marketing | marketing58@cybertekschool.com | UserUser |

  @AGIL-1741
  Scenario Outline: AC-2 User can collapse menu
    Given "<user>" login with "<username>" and "<password>"
    When user click on Configure Menu
    And user click on Collapse Menu
    Then Activity Stream menu should collapsed
    And user click on expand button
    Then Activity Stream menu should expand

    Examples:
      | user      | username                       | password |
      | HR        | hr15@cybertekschool.com        | UserUser |
      | Helpdesk  | helpdesk84@cybertekschool.com  | UserUser |
      | Marketing | marketing58@cybertekschool.com | UserUser |