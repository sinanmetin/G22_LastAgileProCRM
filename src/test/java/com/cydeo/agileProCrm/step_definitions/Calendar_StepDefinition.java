package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.pages.CalenderPage;
import com.cydeo.agileProCrm.pages.LoginPage;
import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.ConfigurationReader;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Calendar_StepDefinition extends TestBase {
    CalenderPage calenderPage = new CalenderPage();

    @Given("user is already logged in")
    public void user_is_already_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginHR();
        Driver.getDriver().navigate().refresh();

    }
    @When("user clicks on the calender tab")
    public void user_clicks_on_the_calender_tab() {
        wait.until(ExpectedConditions.visibilityOf(calenderPage.calenderTab));
        calenderPage.calenderTab.click();
    }
    @When("user clicks on the add event button")
    public void user_clicks_on_the_add_event_button() {
        calenderPage.addButton.click();

    }
    @When("user set the date {string} and {string}  of {string} repeating event")
    public void user_set_the_date_and_of_repeating_event(String startDate, String endDate, String cycle) {
        startDate ="25/08/2022";
        endDate ="30/08/2022";
        cycle ="DAILY";
        calenderPage.inputStartDate.clear();
        calenderPage.inputEndDate.clear();

        calenderPage.inputStartDate.sendKeys(startDate);
        calenderPage.inputEndDate.sendKeys(endDate);

        BrowserUtils.sleep(2);

        calenderPage.selectCycle(cycle);
    }

    @And("user selects location {string}and add given attendees {string},{string}")
    public void userSelectsLocationAndAddGivenAttendees(String room, String attendee1, String attendee2) {
        room="Central Meeting Room-2";
        attendee1="marketing3@cybertekschool.com";
        attendee2="helpdesk3@cybertekschool.com";

        calenderPage.locations.sendKeys(room);
        calenderPage.repeatSpace.click();

        calenderPage.addMoreBttn.click();
        calenderPage.employeesAndDepTab.click();
        calenderPage.employeeMarketing.click();
        calenderPage.employeeHelpDesk.click();


        BrowserUtils.sleep(2);



    }

    @When("user writes given description {string} and select color {string}")
    public void user_writes_given_description_and_select_color(String description, String color) {
        description="MY_FIRST_DESCRIPTION_OF_BIRTHDAY";
        color="pink";
        calenderPage.moreBttn.click();
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().frame(calenderPage.frame);
        calenderPage.bodyInFrame.sendKeys(description);

        Driver.getDriver().switchTo().parentFrame();
        calenderPage.pinkColor.click();


    }
    @When("user selects availability as {string} and save the event")
    public void user_selects_availability_as_and_save_the_event(String string) {
        calenderPage.saveButton.click();
    }
    @Then("the event saved is shown on the Schedule")
    public void the_event_saved_is_shown_on_the_schedule() {
        Assert.assertTrue(calenderPage.newEvent.isDisplayed());
    }

    //AC2====================================================================


    @When("user clicks double on New Event and click on edit")
    public void user_clicks_double_on_new_event_and_click_on_edit() {
        calenderPage.newEventTextAfterCreating.click();
        calenderPage.newEventTextAfterCreating.click();
        BrowserUtils.sleep(1);

        calenderPage.editButton.click();

    }
    @When("user clicks one more button")
    public void user_clicks_one_more_button() {
        calenderPage.moreBttn.click();

    }
    @When("user edit the color as {string} and save the changes")
    public void user_edit_the_color_as_and_save_the_changes(String colorCode) {
        colorCode ="000080";
        calenderPage.editColor(colorCode);

        calenderPage.saveButton.click();

    }
    @Then("the color edited as {string}")
    public void the_color_edited_as(String colorCode) {
        colorCode ="rgb(0, 0, 128)";
        Assert.assertTrue(calenderPage.getColorCode().contains(colorCode));
    }



}
