@wip
Feature: As a user, I should be able to use "Tasks" functionality so that user can create,
  change, delete and track the tasks either on Activity Stream or Tasks page.

  Background:
    Given user is on login page


  Scenario: AC1- HR User can create a high priority task in duration of
  the certain deadline by mentioning about a user.

    When HR user logged in and on home page
    And user clicks on "Tasks" on Activity Stream Menu
    And user click on New Task button
    And user enter task name and description
    And user click on High Priority
    And user mention an user under New task
    And user enter a Deadline
    And user click on Save button
    Then user should see the Task under My tasks List



