
@AGIL-1748
Feature: As a user, I should be able to create a poll by clicking on Poll tab under Activity Stream.

  Background:
    Given user is on login page
    Given user login "hr43@cybertekschool.com" "UserUser"
    Given user click "Poll" on Quick Menu
@AGIL-1811
     Scenario: AC-1 User should be able to add users by selecting multiple contacts from the Employees and Departments contact lists.

       And user enter text on message field
       And user click on add more to open contact list
       And user click on Employees and departments list
       And user select a department from contact list
       And user select an employee from contact list
       And user click on Employees and departments list close button
       And user click on Send button
       Then message should be sent to selected users


@AGIL-1814
  Scenario: AC-4 User should be able to add questions and multiple answers.
            AC-6 User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox.

        And user enter text on message field
        And user clicks "Allow multiple choice" checkbox for answers
        And user click on Send button
        Then user should add questions and multiple answers
        Then attendees should select multiple choice
        Then attendees should select multiple choice
@AGIL-1815
  Scenario: AC-5 User should be able to delete questions and multiple answers.
       And user enter text on message field
       And user click on Send button
       And user click on More button
       And user click delete button
       Then user should see deleted questions and multiple answers
@AGIL-1812
    Scenario: AC-7 User should be able to send a poll.
        And user click on Quote
        And user enter text on quote field
        And user click on Send button
        Then message should be sent with quote text




