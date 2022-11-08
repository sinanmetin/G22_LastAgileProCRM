package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.pages.ServicesPage;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Services_StepDefinitions {
ServicesPage servicesPage= new ServicesPage();
    @When("user clicks on the Services link")
    public void user_clicks_on_the_services_link() {
    servicesPage.serviceBtn.click();
    }
    @When("user enters Meeting Rooms page")
    public void user_enters_meeting_rooms_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Meeting Rooms"));
    }
    @When("user clicks on the Meeting Room Booking table view")
    public void user_clicks_on_the_meeting_room_booking_table_view() {
        servicesPage.meetingBtn.click();

    }
    @Then("Event Calender displays")
    public void event_calender_displays() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Meeting Room"));
    }
    @When("user clicks Book meeting room")
    public void user_clicks_book_meeting_room() {
    servicesPage.bookRoomBtn.click();
    }
    @Then("New Event page is opened")
    public void new_event_page_is_opened() {
    Assert.assertTrue(servicesPage.newEvent.isDisplayed());
    }


}
