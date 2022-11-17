Feature: As a user, I can use Applications menu; so that I can install or manage the applications.

  Background:
    Given HR user logged in and on home page


  Scenario: Verify that user can display the applications
    When user clicks on "Applications" on Activity Stream Menu
    Then user land on the All applications page

  @wipp
  Scenario: Verify that user send a request for installing if there is no permission for installing
    When user clicks on "Applications" on Activity Stream Menu
    And user clicks on the View button
    And user clicks on the Install button
    And user sees confirmation popup and send a request
    Then user sees popup message for sent request




