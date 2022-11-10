Feature: As a user, I should be able to send appreciation by clicking on Appreciation
         subheading from "More" tab under Activity Stream.

  Background:
    Given user is on login page
    Given HR user logged in and on home page

  Scenario: AC-1 User should be able to click on the upload files icon to upload files
                 and pictures from local disks, download from an external drive and select
                 documents from bixtrix24.
    #AC-1
    When user click "More" on Quick Menu
    When user click "Appreciate" on Quick Menu
    And user click on Upload Files icon
    Then user click on Upload Files and images and choose an image
    And user click on insert in text
    Then user click on Upload Files and images and upload a file
    And user click on insert in text again
    Then image and file should be uploaded
    Then user click the send button


    Scenario: AC-2 User should be able to add users and recipients by selecting contacts
                 from E-mail users, Employees and Departments, and Recent contact lists.
            AC-3 User should be able to attach a link by clicking on the link icon.
            AC-4 User should be able to create a quote by clicking on the Comma icon.
            AC-5 User should be able to add mention by clicking on the Add mention icon
                 and selecting contacts from the lists provided in the dropdown.
            AC-6 User should be able to click on Visual Editor and see the editor text
                 bar displays on top of the message box.
            AC-7 User should be able to click on the Topic icon to see the Appreciation
                 Topic text box display on top of the message box.
            AC-8 User should be able to click on the "Record Video" tab to record a video
                 and attach it with the message.
            AC-9 User should be able to add tags by selecting existing tags or creating
                 new tags by clicking on the # icon.
            AC-10 User should be able to see all types of appreciation illustrations/emojis
                 by clicking on the existing illustration/emojis.



  #AC-2
    Given user click on Add more button
    Then user click on hr22 user from recent contact lists
    And user click on Employees and departments button and choose helpdesk9 user from HR department
    And user click on E-mail users, but there is no user there
    Then user click on X button to close contacts

  # AC-3
    When User click on Link button
    And User enter "Do Nothing" in Text
    And User copy and paste the link from Youtube
    Then User click on save button

  # AC-4
    Given User click on quote text button

