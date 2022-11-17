package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.pages.PollPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.cydeo.agileProCrm.utilities.Driver;
import org.junit.Assert;




public class Poll_StepDefinitions extends TestBase {


//---------------------AC-1-------------------------------------------

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

    //------------------------AC-2--------------------------------------------


    @And("user select to link button")
    public void userSelectToLinkButton() {
        wait.until(ExpectedConditions.visibilityOf(ASM.activityStream));
        ASM.activityStream.isSelected();


    }

    @And("user enter the link on link field")
    public void userEnterTheLinkOnLinkField() {



    }

    @And("user click on the send button")
    public void userClickOnTheSendButton() {
        wait.until(ExpectedConditions.visibilityOf(pollPage.sendBtn));
        pollPage.sendBtn.click();
    }

    @Then("user should be attach a link on the text field")
    public void userShouldBeAttachALinkOnTheTextField() {

    }
//--------------------------------AC-4-6-7---------------------------------------
     @And("user writes question and more answers  under the topic field")
      public void userWritesQuestionAndMoreAnswersUnderTheTopicField() {
      }

    @And("user clicks {string} checkbox for answers")
    public void userClicksCheckboxForAnswers(String arg0) {


        pollPage.AllMultChoBox.click();

    }

    @And("user selects add question button")
    public void userSelectsAddQuestionButton() {
        wait.until(ExpectedConditions.visibilityOf(ASM.activityStream));
        ASM.activityStream.isSelected();
        pollPage.AddQuestionBtn.isSelected();


    }

    @And("user add another question and answers")
    public void userAddAnotherQuestionAndAnswers() {

    }


    @Then("user should add questions and multiple answers")
    public void userShouldAddQuestionsAndMultipleAnswers() {
    }

    @Then("attendees should select multiple choice")
    public void attendeesShouldSelectMultipleChoice() {
    }

    //------------------------------AC-3---------------------------------------------------
    @And("user click on the mention icon")
    public void userClickOnTheMentionIcon() {
        wait.until(ExpectedConditions.visibilityOf(pollPage.clickmention));
        pollPage.clickmention.click();

    }

    @And("user add a mention")
    public void userAddAMention() {

    }

    @Then("user should see added mention under the topic")
    public void userShouldSeeAddedMentionUnderTheTopic() {
    }

    @And("user click delete button")
    public void userClickDeleteButton() {

    }

    @Then("user should see deleted questions and multiple answers")
    public void userShouldSeeDeletedQuestionsAndMultipleAnswers() {

    }

    @Given("user logged in and on home page")
    public void userLoggedInAndOnHomePage() {
    }
}
