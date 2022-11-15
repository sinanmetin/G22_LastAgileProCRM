package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.pages.PollPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.ConfigurationReader;
import com.cydeo.agileProCrm.utilities.Driver;
import org.junit.Assert;




public class Poll_StepDefinitions extends TestBase {





    @When("user clicks on the {string} on Activity Stream menu")
    public void user_clicks_on_the_on_activity_stream_menu(String Poll) {
        ASM.activityStreamMenuClick(Poll);

    }

    @When("user selects to add more button")
    public void user_selects_to_add_more_button() {
        pollPage.toAddMoreLink.click();
    }

    @When("user clicks the emplooyes and departments option")
    public void user_clicks_the_emplooyes_and_departments_option() {

        pollPage.EmpandDeptOption.click();

    }


    @Then("user should select the multiple contacts from the emplooyes and departments contact lists.")
    public void user_should_select_the_multiple_contacts_from_the_emplooyes_and_departments_contact_lists() {
        actions.moveToElement(pollPage.hr101).perform();
    }

    //--------------------------------------------------------------------


    @And("user select to link button")
    public void userSelectToLinkButton() {

    }

    @And("user enter the link on link field")
    public void userEnterTheLinkOnLinkField() {

    }

    @And("user click on the send button")
    public void userClickOnTheSendButton() {

    }

    @Then("user should be attach a link on the text field")
    public void userShouldBeAttachALinkOnTheTextField() {
    }

}
