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
    When user click on the calendar icon
    And user select year "2022" month "November" day "14" as date
    Then user sees "11/14/2022" in the Date field


  Scenario: User can add and remove a picture under the details
    When user click on the Details menu
    And user can add a picture by inserting file path
    Then user can remove a picture

  @wipp
  Scenario: User can edit a picture under the details
    When user click on the Details menu
    And user can add a picture by inserting file path
    And user click on the editIcon
    Then user can see edit window




