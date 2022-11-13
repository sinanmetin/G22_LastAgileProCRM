package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.pages.CompanyPage;
import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Company_StepDef extends TestBase {

    CompanyPage companyPage = new CompanyPage();

    String date = faker.date().toString();

    String newsTitle = faker.chuckNorris().toString();

    @Given("User click on the ADD NEWS button")
    public void userClickOnTheADDNEWSButton() {
        companyPage.addNewsBtn.click();
    }

    // -------------- AC1 ------------------
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

    // -------------- AC2 ------------------
    @When("user click on the calendar icon")
    public void userClickOnTheCalendarIcon() {
        companyPage.calendarIcon.click();
    }

    @And("user select year {string} month {string} day {string} as date")
    public void userSelectYearMonthDayAsDate(String year, String month, String day) {

        year="//span[.='"+year+"']";
        month="//span[.='"+month+"']";
        day = "//a[.='"+day+"']";


        // year
        companyPage.yearDropdown.click();
        WebElement Year = Driver.getDriver().findElement(By.xpath(year));
        Year.click();
        // month
        companyPage.calendarIcon.click();
        companyPage.monthDropdown.click();
        WebElement Month = Driver.getDriver().findElement(By.xpath(month));
        Month.click();
        // day
        companyPage.calendarIcon.click();
        WebElement Day = Driver.getDriver().findElement(By.xpath(day));
        Day.click();

        companyPage.selectButton.click();

    }

    @Then("user sees {string} in the Date field")
    public void userSeesInTheDateField(String expectedDate) {
        String actualDate = companyPage.dateField.getAttribute("value");
        Assert.assertEquals(expectedDate,actualDate);
    }

    // -------------- AC3 ------------------
    @When("user click on the Details menu")
    public void userClickOnTheDetailsMenu() {
        companyPage.detailsMenu.click();
    }

    @And("user can add a picture")
    public void userCanAddAPicture() {
//        companyPage.addFileBtn.click();
//        companyPage.insertFilePathBtn.click();
//        companyPage.linkField.sendKeys(ConfigurationReader.getProperty("flower"));
//        companyPage.addButton.click();
        companyPage.pictureInput.sendKeys("/Users/z.neyn/Desktop/Test Automation/HTML/HTML Class/shanks.jpg");
        Assert.assertTrue(companyPage.addedPicture.isDisplayed());
    }

    @Then("user can remove a picture")
    public void userCanRemoveAPicture() {
        companyPage.removeBtn.click();
        Assert.assertTrue(companyPage.blankPictureField.isDisplayed());
    }

    // -------------- AC4 ------------------
    @And("user click on the editIcon")
    public void userClickOnTheEditIcon() {
        companyPage.editIcon.click();
    }

    @Then("user can see edit window")
    public void userCanSeeEditWindow() {
        Assert.assertTrue(companyPage.editWindow.isDisplayed());
    }


    // -------------- AC5------------------
    @Then("user can enter tags {string} in TAGS field")
    public void userCanEnterTagsInTAGSField(String tags) {
        companyPage.tagsField.sendKeys(tags);
        Assert.assertTrue(companyPage.tagsField.isEnabled());

    }


    // -------------- AC6 ------------------
    @Then("user can select all types")
    public void userCanSelectAllTypes() {
        CompanyPage.clickAndVerifyRadioButton(Driver.getDriver(),"PREVIEW_TEXT_TYPE","bxed_PREVIEW_TEXT_text");
        CompanyPage.clickAndVerifyRadioButton(Driver.getDriver(),"PREVIEW_TEXT_TYPE","bxed_PREVIEW_TEXT_html");
        CompanyPage.clickAndVerifyRadioButton(Driver.getDriver(),"PREVIEW_TEXT_TYPE","bxed_PREVIEW_TEXT_editor");

    }


    // -------------- AC7 ------------------
    @When("user enter title and save the news")
    public void userEnterTitleAndSaveTheNews() {
        companyPage.titleField.sendKeys(newsTitle);
        companyPage.saveBtn.click();

    }

    @Then("user can see added news under Company menu")
    public void userCanSeeAddedNewsUnderCompanyMenu() {
        String locator = "//div[@class='news-list']/table/tbody/tr/td[contains(.,'"+ newsTitle + "')]";
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath(locator)).isDisplayed());
    }
}
