package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.pages.DepartmentPage;
import com.cydeo.agileProCrm.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Department_StepDef extends TestBase {

    DepartmentPage department = new DepartmentPage();

    String departmentName = faker.funnyName().name();



    @And("user click on the Employees button")
    public void userClickOnTheEmployeesButton() {
        Driver.getDriver().navigate().refresh();
        department.employeesButton.click();

    }


    @Then("user should see the company structure display")
    public void userShouldSeeTheCompanyStructureDisplay() {
        String expectedUrl = "https://qa.agileprocrm.com/company/vis_structure.php";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @And("user click on the add department button")
    public void userClickOnTheAddDepartmentButton() {
        department.addDepartment.click();
    }

    @And("user type any department name")
    public void userTypeAnyDepartmentName() {

        department.departmentNameinput.sendKeys(departmentName);
    }

    @And("user click on the add button")
    public void userClickOnTheAddButton() {
        department.addButton.click();
    }

    @Then("user should see the department he added")
    public void userShouldSeeTheDepartmentHeAdded() {
        Assert.assertTrue(Driver.getDriver().findElement(By.linkText(departmentName)).isDisplayed());

    }

    @And("user click on the telephone directory button")
    public void userClickOnTheTelephoneDirectoryButton() {
        department.telDirButton.click();
    }

    @Then("user should be able to see the telephon directory display")
    public void userShouldBeAbleToSeeTheTelephonDirectoryDisplay() {
        String expectedUrl = "https://qa.agileprocrm.com/company/telephones.php?login=yes";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }


    @And("user click on any employee")
    public void userClickOnAnyEmployee() {

    }

    @And("user click on send message button")
    public void userClickOnSendMessageButton() {
    }

    @And("user types a message and clicks the enter button")
    public void userTypesAMessageAndClicksTheEnterButton() {
    }

    @Then("user should send the message")
    public void userShouldSendTheMessage() {
    }
}
