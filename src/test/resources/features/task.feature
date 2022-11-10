
Feature: As a user, I should be able to use "Tasks" functionality so that user can create,
  change, delete and track the tasks either on Activity Stream or Tasks page.

  Background:
    Given user is on login page


  Scenario: AC1- HR User can create a high priority task in duration of
  the certain deadline by mentioning about a user.

    When HR user logged in and on home page
    Then user click "Task" on Quick Menu
    Then user click "Event" on Quick Menu

