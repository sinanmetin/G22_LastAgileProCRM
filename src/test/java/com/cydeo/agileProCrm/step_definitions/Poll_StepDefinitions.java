package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.pages.PollPage;
import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.github.dockerjava.api.model.Link;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Timespan;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.cydeo.agileProCrm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.util.Timer;


public class Poll_StepDefinitions extends TestBase {




    @And("user clicks {string} checkbox for answers")
    public void userClicksCheckboxForAnswers(String args0) {
        WebElement checkbox= Driver.getDriver().findElement(By.id("multi_0"));
        System.out.println("checkbox.isSelected()= " + checkbox.isSelected());
        checkbox.click();


    }

    @And("user selects add question button")
    public void userSelectsAddQuestionButton() {
        wait.until(ExpectedConditions.visibilityOf(pollPage.AddQuestionBtn));
        pollPage.AddQuestionBtn.click();

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

    @Then("user should see added mention under the topic")
    public void userShouldSeeAddedMentionUnderTheTopic() {
    }

    @And("user click delete button")
    public void userClickDeleteButton() {
        wait.until(ExpectedConditions.visibilityOf(pollPage.clickDeleteBtn));
        pollPage.clickDeleteBtn.click();

    }

    @Then("user should see deleted questions and multiple answers")
    public void userShouldSeeDeletedQuestionsAndMultipleAnswers() {

    }


    @And("user clicks on Add More button")
    public void userClicksOnAddMoreButton() {
        BrowserUtils.waitFor(2);
        pollPage.toAddMoreLink.click();
    }



    @And("user click on More button")
    public void userClickOnMoreButton() {
        pollPage.MoreBtn.click();
    }
}






