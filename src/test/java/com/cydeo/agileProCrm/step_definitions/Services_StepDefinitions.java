package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.pages.LoginPage;
import com.cydeo.agileProCrm.pages.ServicesPage;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Services_StepDefinitions extends TestBase {
LoginPage loginPage= new LoginPage();

    @When("user clicks on {string} on Activity Stream Menu")
    public void userClicksOnOnActivityStreamMenu(String linkText) {

        ASM.activityStreamMenuClick(linkText);

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

    @When("user uncheck box the East Meeting Room")
    public void user_uncheck_box_the_east_meeting_room() {
        servicesPage.unchecktBtn.click();
        Assert.assertTrue(!servicesPage.unchecktBtn.isSelected());
    }

    @When("user clicks idea button")
    public void user_clicks_idea_button() {
    servicesPage.ideaBtn.click();
    }
    @When("user clicks New Idea button")
    public void user_clicks_new_idea_button() {
    servicesPage.newIdeaBtn.click();

    }
    @When("user write a title as MY_TEST_IDEA")
    public void user_write_a_title_as_my_test_idea() {
    servicesPage.title.sendKeys("MY_TEST_IDEA");
    }
    @When("user write a description as MY_TEST_DESCRIPTION_OF_IDEA")
    public void user_write_a_description_as_my_test_description_of_idea() {
        Driver.getDriver().switchTo().frame(servicesPage.iframe);
        servicesPage.bodyText.sendKeys("MY_TEST_DESCRIPTION_OF_IDEA");
        Driver.getDriver().switchTo().defaultContent();

    }
    @When("user dropdomn from Catogory module")
    public void user_dropdomn_from_catogory_module() {
        Select select= new Select(servicesPage.dropDown);
    }
    @When("user selects Holiday")
    public void user_selects_holiday() {
        Select select= new Select(servicesPage.dropDown);
        select.selectByValue("OUR_EVENTS");

    }
    @Then("user clicks Suggest new idea button")
    public void user_clicks_suggest_new_idea_button() {
    servicesPage.suggestBtn.click();


        Assert.assertTrue(servicesPage.titleIdea.isDisplayed());
    }

    @When("user clicks unlike box")
    public void user_clicks_unlike_box() {

       servicesPage.unlikeBox.click();

    }
    @When("user clicks like box")
    public void user_clicks_like_box() {
       servicesPage.likeButton.click();
    }

    @When("user clicks Themes link")
    public void user_clicks_themes_link() {
     servicesPage.themesBtn.click();
    }
    @When("user select one item from the list")
    public void user_select_one_item_from_the_list() {
        servicesPage.photoBtn.click();

    }
    @Then("user clicks print button")
    public void user_clicks_print_button() {
        servicesPage.printBtn.click();

    }









}
