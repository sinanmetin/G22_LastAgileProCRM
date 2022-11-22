package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.pages.ApplicationsPage;
import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.ConfigurationReader;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Applications_StepDef extends TestBase {

    @Given("user logged in with valid credentials {string} and {string}")
    public void userLoggedInWithValidCredentialsAnd(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.inputUsername.sendKeys(username);
        loginPage.inputPassword.sendKeys(password);
        loginPage.loginBtn.click();
    }


    @Then("user land on the All applications page")
    public void userLandOnTheAllApplicationsPage() {
//        BrowserUtils.waitForPageToLoad(2);
        String expectedTitle = "All applications";
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    @And("user clicks on the {string} application")
    public void userClicksOnTheApplication(String appName) {

        String locator = "//span[.='"+appName+"']";
        Driver.getDriver().findElement(By.xpath(locator)).click();

    }


    @And("user clicks on the Install button")
    public void userClicksOnTheInstallButton() {

        Driver.getDriver().switchTo().frame(task.sidePanelIframe);
        BrowserUtils.waitForClickablility(applicationsPage.installBtn,3).click();


    }

    @And("user sees confirmation popup and send a request")
    public void userSeesConfirmationPopupAndSendARequest() {
        Assert.assertTrue(applicationsPage.confirmPopup.isDisplayed());
        applicationsPage.sendButton.click();
    }

    @Then("user can see popup message for sent request")
    public void userCanSeePopupMessageForSentRequest() {
        Assert.assertTrue(applicationsPage.popupWindow.isDisplayed());
        Driver.getDriver().switchTo().parentFrame();
    }


    @Then("user can display all content types")
    public void userCanDisplayAllContentTypes() {
        Driver.getDriver().switchTo().frame(task.sidePanelIframe);

        ApplicationsPage.clickAndVerifyContentDetails("Description");
        ApplicationsPage.clickAndVerifyContentDetails("Versions");
        ApplicationsPage.clickAndVerifyContentDetails("Support");
        ApplicationsPage.clickAndVerifyContentDetails("Install");

        Driver.getDriver().switchTo().parentFrame();

    }


}
