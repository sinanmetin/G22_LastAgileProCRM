package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.pages.HomePage;
import com.cydeo.agileProCrm.pages.LoginPage;
import com.cydeo.agileProCrm.pages.quickMenu.MessageQM;
import com.cydeo.agileProCrm.utilities.ConfigurationReader;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LoginStepDef {

    LoginPage login = new LoginPage();
    HomePage home = new HomePage();


    ///////////////////////////////////////////////////////////////////////////////////
    //AC-1, AC-2, AC-3
    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    ///////////HRCredentials////////////////////
    @When("hr enter username {string}")
    public void hr_enter_username(String username) {
        login.inputUsername.sendKeys(username);
    }

    @When("hr enter password {string}")
    public void hr_enter_password(String password) {
        login.inputPassword.sendKeys(password);
    }

    //////////HelpDeskCredentials//////////////

    @When("Helpdesk enter username {string}")
    public void helpdesk_enter_username(String username) {
        login.inputUsername.sendKeys(username);
    }

    @When("Helpdesk enter password {string}")
    public void helpdesk_enter_password(String password) {
        login.inputPassword.sendKeys(password);
    }

    ///////////MarketingCredentials///////////////
    @When("Marketing enter username {string}")
    public void marketing_enter_username(String username) {
        login.inputUsername.sendKeys(username);
    }

    @When("Marketing enter password {string}")
    public void marketing_enter_password(String password) {
        login.inputPassword.sendKeys(password);
    }

    /////////LoginAndAssert///////////////////
    @When("user click on login button")
    public void user_click_on_login_button() {
        login.loginBtn.click();
    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        Assert.assertTrue(home.userBlock.isDisplayed());
    }

    ///////////////////////////////////////////////////////////////////////////////////
    //negative scenario AC-4

    @When("user enter invalid username {string}")
    public void user_enter_invalid_username(String username) {
        login.inputUsername.sendKeys(username);
    }

    @When("user enter invalid password {string}")
    public void user_enter_invalid_password(String password) {
        login.inputPassword.sendKeys(password);
    }

    @Then("user see the error message")
    public void user_see_the_error_message() {
        String expectedErrorMessage="Incorrect login or password";
        String actualErrorMessage=login.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

    ////////////////////////////////////////////////////////////////////////////////
    //AC-5
    @When("user click on remember me checkbox")
    public void user_click_on_remember_me_checkbox() {
        login.userRememberInput.click();
    }

    @Then("checkbox should be selected")
    public void checkbox_should_be_selected() {
        Assert.assertTrue(login.userRememberInput.isSelected());
    }

    @Then("checkbox should be deselected")
    public void checkbox_should_be_deselected() {
        Assert.assertTrue(!login.userRememberInput.isSelected());
    }

    //////////////////////////////////////////////////////////////////////////////////
    //AC-6

    @When("user click forgot password link")
    public void user_click_forgot_password_link() {
        login.forgotPassLink.click();
    }

    @Then("get password page should be opened")
    public void get_password_page_should_be_opened() {
        String expectedPageTitle="Get Password";
        String actualPageTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
    }

    ////////////////////////////////////////////////////////////////////////////////


}
