package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.pages.DepartmentPage;
import com.cydeo.agileProCrm.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Department_StepDef {

    DepartmentPage department = new DepartmentPage();

    Faker faker = new Faker();

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
        String fakerName = faker.funnyName().name();
        department.departmentName.sendKeys(fakerName);
    }

    @And("user click on the add button")
    public void userClickOnTheAddButton() {
        department.addButton.click();
    }

    @Then("user should see the department he added")
    public void userShouldSeeTheDepartmentHeAdded() {


    }

    @And("user click on the find employee button")
    public void userClickOnTheFindEmployeeButton() {
    }

    @And("user click on the More... button")
    public void userClickOnTheMoreButton() {
    }

    @And("user click on the export to excel button")
    public void userClickOnTheExportToExcelButton() {
    }

    @Then("user should be able to export the employee list on an excel file")
    public void userShouldBeAbleToExportTheEmployeeListOnAnExcelFile() {
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
}
