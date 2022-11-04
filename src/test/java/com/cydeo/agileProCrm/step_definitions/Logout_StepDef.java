package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.pages.HomePage;
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

public class Logout_StepDef extends TestBase {

    LoginPage login = new LoginPage();
    HomePage home = new HomePage();


    ///////////////////////////////////////////////////////////////////////////////////////////////
    /// AC-1 AC-2

    //////////As a HR user/////////////
    @Given("HR user logged in and on home page")
    public void hr_user_logged_in_and_on_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        login.loginHR();
    }

    //////////As a Helpdesk user/////////////
    @Given("Helpdesk user logged in and on home page")
    public void helpdesk_user_logged_in_and_on_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        login.loginHelpDesk();
    }

    //////////As a Marketing user/////////////

    @Given("Marketing user logged in and on home page")
    public void marketing_user_logged_in_and_on_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        login.loginMarketing();
    }


    /////AC-1 Same Steps for each user////////

    @When("user click on user menu")
    public void user_click_on_user_menu() {
        Driver.getDriver().navigate().refresh();
        home.userBlock.click();
    }

    @When("user click on logout link")
    public void user_click_on_logout_link() {

        home.logout.click();
    }

    @Then("user should land on login page")
    public void user_should_land_on_login_page() {
        String expectedTitle = "Authorization";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    /////AC-2 Same Step for each user////////

    @And("user try to navigate back")
    public void userTryToNavigateBack() {
        Driver.getDriver().navigate().back();

    }

    /////AC-3 Same Step for each user////////
    @And("user close the browser")
    public void userCloseTheBrowser() {
        Driver.closeDriver();
    }

    @And("user open new browser and try to navigate to home page")
    public void userOpenNewBrowserAndTryToNavigateToHomePage() {
        Driver.getDriver().get("https://qa.agileprocrm.com/stream/?login=yes");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("{string} login with {string} and {string}")
    public void login_with_and(String string, String username, String password) {
        login.login(username, password);
        wait.until(ExpectedConditions.visibilityOf(ASM.activityStream));

    }


}
