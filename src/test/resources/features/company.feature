@wip
Feature: As a user, I should be able to add news under Company

  Background:
    Given HR user logged in and on home page
    Given user clicks on "Company" on Activity Stream Menu
    Given User click on the ADD NEWS button

  Scenario: User can select a type of information under the preview text
    When user click on the Type of information field
    And user select "News" as a type of information
    Then the field should displays selected type

  Scenario: User can select a date and set a time under the preview text