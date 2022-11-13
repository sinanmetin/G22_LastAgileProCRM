
Feature:As a user, I should be able to use "Services" functionality so that I can take advantage of company's services.





    Scenario: Helpdesk User can display "Event Calendar" after switching view from table view to
    calendar view by clicking "Meeting Room Booking Table View" on the "Meeting Room Booking" page
      Given "helpdesk1@cybertekschool.com" users logged in and on home page
      When user clicks on "Services" on Activity Stream Menu
      And user enters Meeting Rooms page
      And user clicks on the Meeting Room Booking table view
      Then Event Calender displays

    Scenario: Helpdesk Users can be redirected to the "New Event" page
    for booking a meeting room after clicking "Book meeting room".
      Given "helpdesk1@cybertekschool.com" users logged in and on home page
      When user clicks on "Services" on Activity Stream Menu
      And user enters Meeting Rooms page
      And user clicks on the Meeting Room Booking table view
      And user clicks Book meeting room
      Then New Event page is opened

      Scenario: Helpdesk Users can uncheck the "East Meeting Room" under the "Calendars"
      section on the "Meeting Room Booking" page.
        Given "helpdesk1@cybertekschool.com" users logged in and on home page
        When user clicks on "Services" on Activity Stream Menu
        And user enters Meeting Rooms page
        And user clicks on the Meeting Room Booking table view
        And user uncheck box the East Meeting Room




  Scenario: Marketing Users can suggest new ideas by clicking
    "New idea" under the Ideas page of the Services module.
    Given "marketing1@cybertekschool.com" users logged in and on home page
      When user clicks on "Services" on Activity Stream Menu
      And user clicks idea button
      And user clicks New Idea button
      And user write a title as MY_TEST_IDEA
      And user write a description as MY_TEST_DESCRIPTION_OF_IDEA
      And user dropdomn from Catogory module
      And user selects Holiday
      Then user clicks Suggest new idea button


      Scenario: Marketing Users can dislike the idea.
        Given "marketing1@cybertekschool.com" users logged in and on home page
        When user clicks on "Services" on Activity Stream Menu
        And user clicks idea button
        Then user clicks unlike box


      Scenario: Marketing Users can dislike the idea.
        Given "marketing1@cybertekschool.com" users logged in and on home page
        When user clicks on "Services" on Activity Stream Menu
        And user clicks idea button
        Then user clicks like box

        Scenario: Marketing Users can sort the ideas by date added.


        Scenario:  HR Users can print the lists by clicking the "Print"
        button under the Lists page of the Services menu.

          Given "hr1@cybertekschool.com" users logged in and on home page
          When user clicks on "Services" on Activity Stream Menu
          And user clicks Themes link
          And user select one item from the list
          Then user clicks print button


          ##








