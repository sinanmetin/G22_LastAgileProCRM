package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.pages.ApplicationsPage;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Applications_StepDef {

    ApplicationsPage applicationsPage = new ApplicationsPage();
    @Then("user land on the All applications page")
    public void userLandOnTheAllApplicationsPage() {
        String expectedTitle = "All applications";
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    @And("user clicks on the View button")
    public void userClicksOnTheViewButton() {
        applicationsPage.viewBtn.click();
    }


    @And("user clicks on the Install button")
    public void userClicksOnTheInstallButton() {
        applicationsPage.installBtn.click();
    }

    @And("user sees confirmation popup and send a request")
    public void userSeesConfirmationPopupAndSendARequest() {
        Assert.assertTrue(applicationsPage.confirmPopup.isDisplayed());
        applicationsPage.sendButton.click();
    }

    @Then("user sees popup message for sent request")
    public void userSeesPopupMessageForSentRequest() {
        applicationsPage.popupWindow.isDisplayed();
    }
}
