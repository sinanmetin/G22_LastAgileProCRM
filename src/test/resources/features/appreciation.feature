@AGIL-1826
Feature: As a user, I should be able to send appreciation by clicking on Appreciation
         subheading from "More" tab under Activity Stream.

  Background:
    Given user is on login page

  @AGIL-1822
  Scenario Outline: AC-1 User should be able to click on the upload files icon to upload files
                 and pictures from local disks, download from an external drive and select
                 documents from bixtrix24.
    #AC-1
    Given "<user>" login with "<username>" and "<password>"
    When user click "Appreciation" on Quick Menu
    And user click on Upload Files icon
    Then user click on Upload Files and images and choose an image
    And user click on insert in text
    Then user click on Upload Files and images and upload a file
    And user click on insert in text again
    Then user click on select document from Bitrix24
    And user click on Sales and marketing
    And user select Agile Pro CRM Test Plan
    Then user click on SELECT DOCUMENT button
    And user click on in text button
    Then image，file and document should be uploaded
    Then user click on Download from external drive
    And user click on Office 365
    Then user see a notification that should contact to Administrator
    Then user click the send button

    Examples:
      | user      | username                       | password |
      | HR        | hr48@cybertekschool.com        | UserUser |
      | Helpdesk  | helpdesk1@cybertekschool.com   | UserUser |
      | Marketing | marketing49@cybertekschool.com  | UserUser |


  @AGIL-1823
    Scenario Outline: AC-2 User should be able to add users and recipients by selecting contacts
                           from Employees and Departments, and Recent contact lists.
                      AC-6 User should be able to add mention by clicking on the Add mention icon
                           and selecting contacts from the lists provided in the dropdown.

      Given "<user>" login with "<username>" and "<password>"
      When user click "Appreciation" on Quick Menu
      #AC-2
      And user click on Add more button
      Then user click on Employees and departments button and choose "helpdesk9@cybertekschool.com" user from HR department
      Then user click two times on helpdesk9 user from recent contact lists
      Then user click on X button to close contacts
      Then user have added helpdesk9 as a recipient
      #AC-6
      And user click on add mention icon and choose "hr11@cybertekschool.com" from Employees and departments
      Then user should see hr11 in content part

      Examples:
        | user      | username                       | password |
        | HR        | hr43@cybertekschool.com        | UserUser |
        | Helpdesk  | helpdesk1@cybertekschool.com  | UserUser |
        #| Marketing | marketing100@cybertekschool.com | UserUser |

  @AGIL-1824
    Scenario Outline: AC-3 User should be able to attach a link by clicking on the link icon.
                      AC-5 User should be able to create a quote by clicking on the Comma icon.
                      AC-7 User should be able to click on Visual Editor and see the editor text
                           bar displays on top of the message box.
                      AC-8 User should be able to click on the Topic icon to see the Appreciation
                           Topic text box display on top of the message box.
   # AC-3
    Given "<user>" login with "<username>" and "<password>"
    When user click "Appreciation" on Quick Menu
    When User click on Link button
    And User enter "Do Nothing" in Text
    And User copy and paste the link from Youtube
    Then User click on save button
    Then User should see the link in Text Part

  # AC-5
    Given User click on quote text button
    And user enter "Celebration" and should see the quote in Text Part

  # AC-7
    Given user click on visual editor icon
    And user should see the editor text bar on top of the message box

  # AC-8
    Given user click on Topic icon
    Then user should see the appreciation Topic text box display on top of the message box



    Examples:
      | user      | username                       | password |
      | HR        | hr43@cybertekschool.com        | UserUser |
      | Helpdesk  | helpdesk38@cybertekschool.com   | UserUser |
      | Marketing | marketing39@cybertekschool.com  | UserUser |

  @AGIL-1825
    Scenario Outline: AC-10 User should be able to add tags by selecting existing tags or creating
                           new tags by clicking on the # icon.
                      AC-11 User should be able to see all types of appreciation illustrations/emojis
                            by clicking on the existing illustration/emojis.

      Given "<user>" login with "<username>" and "<password>"
      When user click "Appreciation" on Quick Menu
    # AC-10
      When user click on Add tag button
      And enter "#wip" in Tag space
      Then user should see "#wip" in Tag box
      And user click on Add tag button again and enter "wip"
      Then user can also see "wip" in Tag box

    # AC-11
      And user click on the existing emoji
      And user should see all types of appreciation emojis

      Examples:
        | user      | username                       | password |
        | HR        | hr43@cybertekschool.com        | UserUser |
        | Helpdesk  | helpdesk1@cybertekschool.com   | UserUser |
        | Marketing | marketing1@cybertekschool.com  | UserUser |