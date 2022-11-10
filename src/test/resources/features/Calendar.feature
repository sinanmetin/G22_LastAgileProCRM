Feature: Calender Page Functions
  User Story:As a user, I should be able to navigate "Calendar" page so that user can filter and search,
  display, add and track the tasks or events either on "Calendar" page.
  @AGIL-1779
  Scenario: Create new repeating event
    Given user is already logged in
    When  user clicks on the calender tab
    And   user clicks on the add event button
    And   user set the date "25/08/2022" and "30/08/2022"  of "Daily" repeating event
    And   user selects location "Central Meeting Room-2"and add given attendees "marketing3@cybertekschool.com","helpdesk3@cybertekschool.com"
    And   user writes given description "MY_FIRST_DESCRIPTION_OF_BIRTHDAY" and select color "#F87396"
    And   user selects availability as "Occupied" and save the event
    Then  the event saved is shown on the Schedule
  @AGIL-1780
  Scenario: Edit task color
    Given user is already logged in
    When  user clicks on the calender tab
    And   user clicks double on New Event and click on edit
    And   user clicks one more button
    And   user edit the color as "Navy Blue" and save the changes
    Then  the color edited as "Navy Blue"




