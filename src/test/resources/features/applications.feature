Feature: As a user, I can use Applications menu; so that I can install or manage the applications.

  Background:
    Given HR user logged in and on home page


  Scenario: Verify that user can display the applications
    When user clicks on "Applications" on Activity Stream Menu
    Then user land on the All applications page

