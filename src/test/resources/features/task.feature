@AGIL-1838
Feature: As a user, I should be able to use "Tasks" functionality so that user can create,
  change, delete and track the tasks either on Activity Stream or Tasks page.

  Background:
    Given user is on login page


  @AGIL-1828 @smoke
  Scenario: AC1- HR User can create a high priority task in duration of
  the certain deadline by mentioning about a user.
    When HR user logged in and on home page
    And user clicks on "Tasks" on Activity Stream Menu
    And user click on New Task button
    And user enter task name and description
    And write task name to the Exel sheet
    And user click on High Priority
    And user mention "hr85@cybertekschool.com" under New task
    And user change "marketing11@cybertekschool.com" for "Created by"
    And user enter a Deadline
    And user click on Save button
    Then user should see the Task under My tasks List


  @AGIL-1829
  Scenario: AC2- Marketing User can edit the task by declaring
  himself/herself as responsible person.
    When user login "marketing11@cybertekschool.com" "UserUser"
    And user clicks on "Tasks" on Activity Stream Menu
    And get related task name from Exel sheet
    And user click related task
    And user declare "marketing11@cybertekschool.com" as responsible person
    And user clicks on "Tasks" on Activity Stream Menu
    Then user should see "marketing11@cybertekschool.com" as responsible person

  @AGIL-1830 @smoke
  Scenario: AC3- HR User can edit the task for adding time tracking.
    When HR user logged in and on home page
    And user clicks on "Tasks" on Activity Stream Menu
    And user click on New Task button
    And user enter task name and description
    And user click on Save button
    And user clicks on "Tasks" on Activity Stream Menu
    And user click on last created task
    And user click on Edit button
    And user clicks on More button
    And user set Time Tracking "2" hours "30" minutes
    And user click on Save Changes button
    Then user should see timer under the task name


  @AGIL-1831
  Scenario: AC5- Marketing User can create a subtask of the first acceptance
  criteria's task quickly by using plus button, adding tags.

    When user login "marketing11@cybertekschool.com" "UserUser"
    And user clicks on plus button next to "Task" in Activity Stream Menu
    And user enter task name and description
    And user enter a Deadline
    And user clicks on More button
    And user click on Subtask of +Add button
    And get related task name from Exel sheet
    And user search related task
    And user click on related task from list
    And user click on Select button
    And user click on Save Changes button
    And user clicks on "Tasks" on Activity Stream Menu
    And user click on plus button next to related task to see subtasks
    Then user should see created subtask under the related task


  @AGIL-1832 @smoke
  Scenario: AC7- Marketing User can add participants and
  observers to already created task by editing.
    When user login "marketing11@cybertekschool.com" "UserUser"
    And user clicks on "Tasks" on Activity Stream Menu
    And get related task name from Exel sheet
    And user click related task
    And user click on Edit button
    And user select "marketing10@cybertekschool.com" as a "Participants"
    And user select "hr20@cybertekschool.com" as an "Observers"
    And user click on Save Changes button
    And user clicks on "Tasks" on Activity Stream Menu
    And user click related task
    Then user should see "marketing10@cybertekschool.com" as "Participants"
    Then user should see "hr20@cybertekschool.com" as "Observers"

  @AGIL-1833 @smoke
  Scenario: AC8- Marketing User can add checklist to an already created task by editing.
    When user login "marketing11@cybertekschool.com" "UserUser"
    And user clicks on "Tasks" on Activity Stream Menu
    And get related task name from Exel sheet
    And user click related task
    And user click add Checklist button
    And user add "TEST" as checklist items
    And user clicks on "Tasks" on Activity Stream Menu
    And user click related task
    Then user should see created checklist items under the related task

  @AGIL-1834
  Scenario: AC9- HR User can add dependent tasks by editing the already created task.
    When HR user logged in and on home page
    And user clicks on "Tasks" on Activity Stream Menu
    And user click on New Task button
    And user enter task name and description
    And user click on Save button
    And user clicks on "Tasks" on Activity Stream Menu
    And user open last created task
    And user click on Edit button
    And user clicks on More button
    And user click on Dependent tasks +Add button
    And get related task name from Exel sheet
    And user search related Dependent task
    And user click on dependent task from list
    And user click on Select button
    And user click on Save Changes button
    And user clicks on "Tasks" on Activity Stream Menu
    And user open last created task
    Then user should see related task as Dependent task

  @AGIL-1835
  Scenario: AC10- HR User can be redirected to "New task template" page by clicking
  'All templates' under "TASK TEMPLATES" menu on "New task" module.
    When HR user logged in and on home page
    And user clicks on "Tasks" on Activity Stream Menu
    And user click on New Task button
    And user click on TASK TEMPLATES
    And user click on All templates
    And user click on +ADD button
    Then user should landed "New task template" page

  @AGIL-1836 @smoke
  Scenario: AC11- HR User can create new task template for high priority task, for him/herself,
  by mentioning about Marketing User, specifying the deadline, using the Options under 'Deadline in' section.
    When HR user logged in and on home page
    And user clicks on "Tasks" on Activity Stream Menu
    And user click on New Task button
    And user click on TASK TEMPLATES
    And user click on All templates
    And user click on +ADD button
    And user enter task template name and description
    And user click on High Priority
    And user mention "marketing25@cybertekschool.com" under New task
    And user specify deadline options
    And user click on Create Task Template button
    And user clicks on "Tasks" on Activity Stream Menu
    And user click on New Task button
    And user click on TASK TEMPLATES
    And user click on All templates
    Then user should see Task under Task templates list

  @AGIL-1837 @smoke
  Scenario: AC12- HR User can delete task by using "SELECT ACTION"
  dropdown menu after checking the task.
    When HR user logged in and on home page
    And user clicks on "Tasks" on Activity Stream Menu
    And user click on New Task button
    And user enter task name and description
    And user click on Save button
    And user clicks on "Tasks" on Activity Stream Menu
    And user select created Task
    And user Select Action Delete
    And user click on APPLY
    And user confirm action
    And user clicks on "Tasks" on Activity Stream Menu
    Then user shouldn't see that task under My tasks list

  @smoke @AGIL-1842
  Scenario Outline: AC13- User can create a high priority task in duration of
  the certain deadline by mentioning about a user.
    Given "<user>" login with "<username>" and "<password>"
    And user click "Task" on Quick Menu
    And user enter task name and description on quick menu
    And user click on High Priority
    And user enter a Deadline
    And user click on Send button
    And user clicks on "Tasks" on Activity Stream Menu
    Then user should see the Task under My tasks List

    Examples:
      | user      | username                       | password |
      | HR        | hr15@cybertekschool.com        | UserUser |
      | Helpdesk  | helpdesk20@cybertekschool.com  | UserUser |
      | Marketing | marketing58@cybertekschool.com | UserUser |


    ####

  ####















































