package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.pages.HomePage;
import com.cydeo.agileProCrm.pages.LoginPage;
import com.cydeo.agileProCrm.utilities.ConfigurationReader;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_StepDef {
    LoginPage login = new LoginPage();
//abduwali second push
    HomePage home = new HomePage();


    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @When("{string} enter username {string}")
    public void enter_username(String string, String username) {

        login.inputUsername.sendKeys(username);
    }

    @When("{string} enter password {string}")
    public void enter_password(String string, String password) {
        login.inputPassword.sendKeys(password);
    }


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
