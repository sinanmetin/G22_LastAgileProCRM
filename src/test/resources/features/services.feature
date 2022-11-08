@wip
Feature:As a user, I should be able to use "Services" functionality so that I can take advantage of company's services.
  Background:
    Given user is on login page
    Given Helpdesk user logged in and on home page

    Scenario: Helpdesk User can display "Event Calendar" after switching view from table view to
    calendar view by clicking "Meeting Room Booking Table View" on the "Meeting Room Booking" page

      When user clicks on "Services" on Activity Stream Menu
      And user enters Meeting Rooms page
      And user clicks on the Meeting Room Booking table view
      Then Event Calender displays

    Scenario: Helpdesk Users can be redirected to the "New Event" page
    for booking a meeting room after clicking "Book meeting room".

      When user clicks on "Services" on Activity Stream Menu
      And user enters Meeting Rooms page
      And user clicks on the Meeting Room Booking table view
      And user clicks Book meeting room
      Then New Event page is opened



