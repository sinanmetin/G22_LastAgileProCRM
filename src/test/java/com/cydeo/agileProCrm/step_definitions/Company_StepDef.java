package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.pages.CompanyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class Company_StepDef extends TestBase {

    CompanyPage companyPage = new CompanyPage();

    String date = faker.date().toString();

    @Given("User click on the ADD NEWS button")
    public void userClickOnTheADDNEWSButton() {
        companyPage.addNewsBtn.click();
    }
    @When("user click on the Type of information field")
    public void user_click_on_the_field() {
        companyPage.typeDropdown.click();
    }

    @And("user select {string} as a type of information")
    public void userSelectAsATypeOfInformation(String infoType) {
        Select selectObj = new Select(companyPage.typeDropdown);
        selectObj.selectByVisibleText(infoType);
    }

    @Then("the field should displays selected type")
    public void the_field_should_displays_selected_type() {
        Select selectObj = new Select(companyPage.typeDropdown);
        String expectedType = "News";
        String actualType = selectObj.getFirstSelectedOption().getText();
        Assert.assertEquals(actualType,expectedType);

    }



}
