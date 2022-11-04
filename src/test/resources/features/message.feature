@AGIL-1725
Feature: As a user, I should be able to send messages
  by clicking on Message tab under Active Stream.

  Background:
    Given user is on login page
    Given HR user logged in and on home page

  @AGIL-1722
  Scenario:AC-1 User should be able to click on upload files icon
  to upload files and pictures from local disks.
    When user click on MESSAGE link
    And user enter text on message field
    And user click on Upload Files link
    And user send files on Upload files an images field
    Then test data should be loaded
    And user click on Send button
    Then message should be sent with uploaded files

  @AGIL-1723
  Scenario:AC-2/AC-7 User should be able to add users from selecting multiple contacts
  from Employees and Departments contact lists.
    When user click on MESSAGE link
    And user enter text on message field
    And user click on add more to open contact list
    And user click on Employees and departments list
    And user select a department from contact list
    And user select an employee from contact list
    And user click on Employees and departments list close button
    And user click on Send button
    Then message should be sent to selected users



  @AGIL-1724
  Scenario:AC-5 User should be able to create a quote by clicking on the Comma icon.
    When user click on MESSAGE link
    And user click on Quote
    And user enter text on quote field
    And user click on Send button
    Then message should be sent with quote text


  Scenario:AC-7 User cannot send an empty message
    When user click on MESSAGE link
    And user click on Send button
    Then user should see "The message title is not specified" error message












