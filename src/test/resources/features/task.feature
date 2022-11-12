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
    And write task name to the Exel sheet
    And user click on High Priority
    And user mention "hr85@cybertekschool.com" under New task
    And user select "marketing11@cybertekschool.com" for created by
    And user enter a Deadline
    And user click on Save button
    Then user should see the Task under My tasks List

  Scenario: AC2- Marketing User can edit the task by declaring
  himself/herself as responsible person.

    When user login "marketing11@cybertekschool.com" "UserUser"
    And user clicks on "Tasks" on Activity Stream Menu
    And user click related task
    And user declare "marketing11@cybertekschool.com" as responsible person
    And user clicks on "Tasks" on Activity Stream Menu
    Then user should see "marketing11@cybertekschool.com" as responsible person





