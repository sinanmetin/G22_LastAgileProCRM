@wip

Feature: As a user, I should be able to create a poll by clicking on Poll tab under Activity Stream.

  Background:
    Given user is on login page
    Given user logged in and on home page

  Scenario: AC-1 User should be able to add users by selecting multiple contacts from the Employees and Departments contact lists.
        When user clicks on the "Poll" on Activity Stream menu
        And user selects to add more button
        And user clicks the emplooyes and departments option
        Then user should select the multiple contacts from the emplooyes and departments contact lists.

    Scenario: AC-2 User should be able to attach a link by clicking on the link icon.
      When user clicks on the "Poll" on Activity Stream menu
      And user select to link button
      And user enter the link on link field
      And user click on the send button
      Then user should be attach a link on the text field

            #AC-3 User should be able to add a mention by clicking on the add mention icon.
            #AC-4 User should be able to add questions and multiple answers.
            #AC-5 User should be able to delete questions and multiple answers.
            #AC-6 User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox.
            #AC-7 User should be able to send a poll.
