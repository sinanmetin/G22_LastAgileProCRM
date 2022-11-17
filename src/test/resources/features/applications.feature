@wipp
Feature: As a user, I can use Applications menu; so that I can install or manage the applications.

  Background:
    Given HR user logged in and on home page


  Scenario: Verify that user can display the applications
    When user clicks on "Applications" on Activity Stream Menu
    Then user land on the All applications page


  Scenario: Verify that user can send a request for installing if there is no permission for installing
    When user clicks on "Applications" on Activity Stream Menu
    And user clicks on the "Dependent fields" application
    And user clicks on the Install button
    And user sees confirmation popup and send a request
    Then user can see popup message for sent request


    Scenario: Verify that user can display the application's
              description, versions, support and installation

      When user clicks on "Applications" on Activity Stream Menu
      And user clicks on the "Dependent fields" application
      Then user can display all content types







