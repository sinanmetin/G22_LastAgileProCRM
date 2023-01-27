package com.moneytrans.step_def;

import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.Driver;
import com.moneytrans.base.TestBase;
import com.moneytrans.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login extends TestBase {


    @Given("user is on money login page")
    public void user_is_on_money_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url.money"));
        BrowserUtils.waitForPageToLoad(10);

        BrowserUtils.waitForClickablility(login.acceptBtn, 10);
        login.acceptBtn.click();



    }
    @When("user click register button")
    public void user_click_register_button() {

        login.registerBtn.click();

    }





}
