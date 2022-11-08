Feature: As a user, I should be able to send appreciation by clicking on Appreciation
         subheading from "More" tab under Activity Stream.

  Background:
    Given user is on login page
    Given HR user logged in and on home page

  Scenario: AC-1 User should be able to click on the upload files icon to upload files
                 and pictures from local disks, download from an external drive, select
                 documents from bixtrix24, and create files to upload.
            AC-2 User should be able to add users and recipients by selecting contacts
                 from E-mail users, Employees and Departments, and Recent contact lists.
            AC-3 User should be able to attach a link by clicking on the link icon.






  # AC-3
    When User click on Link button
    And User enter "Do Nothing" in Text
    And User copy and paste the link from Youtube
    Then User click on save button
