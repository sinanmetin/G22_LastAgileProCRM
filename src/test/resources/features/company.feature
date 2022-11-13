@AGIL-1790
Feature: As a user, I should be able to add news under Company

  Background:
    Given HR user logged in and on home page
    Given user clicks on "Company" on Activity Stream Menu
    Given User click on the ADD NEWS button

  @AGIL-1783
  Scenario: Verify that user can select a type of information under the preview text
    When user click on the Type of information field
    And user select "News" as a type of information
    Then the field should displays selected type

  @AGIL-1784
  Scenario: Verify that user can select a date and set a time under the preview text
    When user click on the calendar icon
    And user select year "2022" month "November" day "14" as date
    Then user sees "11/14/2022" in the Date field

  @AGIL-1785
  Scenario: Verify that user can add and remove a picture under the details
    When user click on the Details menu
    And user can add a picture
    Then user can remove a picture

  @AGIL-1786
  Scenario: Verify that user can edit a picture under the details
    When user click on the Details menu
    And user can add a picture
    And user click on the editIcon
    Then user can see edit window

  @AGIL-1787
  Scenario: Verify that user can add tags under details
    When user click on the Details menu
    Then user can enter tags "One Piece,Red Hair Shanks" in TAGS field

  @AGIL-1788
  Scenario: Verify that user can select Text, HTML, and Visual Editor
    Then user can select all types

  @AGIL-1789
  Scenario: Verify that user can send news
    When user enter title and save the news
    Then user can see added news under Company menu








