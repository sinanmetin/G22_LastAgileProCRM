package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.ConfigurationReader;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class Message_StepDef extends TestBase {

    ////////////////////---AC-1---/////////////////////////////////////////////////
    @When("user click on MESSAGE link")
    public void user_click_on_message_link() {

        wait.until(ExpectedConditions.visibilityOf(ASM.activityStream));
        ASM.activityStream.click();

        message.message.click();
    }

    @When("user click on Upload Files link")
    public void user_click_on_upload_files_link() {

        message.uploadFilesBtn.click();
    }

    @When("user send files on Upload files an images field")
    public void user_send_files_on_upload_files_an_images_field() {
        message.uploadFilesAndImagesField.sendKeys(ConfigurationReader.getProperty("testData1"));
        message.uploadFilesAndImagesField.sendKeys(ConfigurationReader.getProperty("testData2"));

        wait.until(ExpectedConditions.visibilityOf(message.myDriveLink));
    }

    @Then("test data should be loaded")
    public void test_data_should_be_loaded() {
        Assert.assertTrue(message.uploadedFile1.isDisplayed());
        Assert.assertTrue(message.uploadedFile2.isDisplayed());


    }

    @Then("user click on Send button")
    public void user_click_on_send_button() {
        wait.until(ExpectedConditions.visibilityOf(message.sendBtn));
        message.sendBtn.click();
    }

    @Then("message should be sent with uploaded files")
    public void message_should_be_sent_with_uploaded_files() {
        BrowserUtils.sleep(2);

        String expectedSender = ConfigurationReader.getProperty("username.hr");
        String actualSender = message.messageSender.getText();

        String expectedText = testText;
        String actualText = message.textOfLastSentMessage.getText();

        String expected = "testdata_1";
        String actual = message.attachedData1OfLastSentMessage.getText();

        String expectedImg = "testdata_2";
        String actualImg = message.attachedImgDataOfLastSentMessage.getAttribute("alt");


        Assert.assertEquals(expectedSender, actualSender);
        Assert.assertTrue(actual.contains(expected));
        Assert.assertTrue(actualImg.contains(expectedImg));
        Assert.assertEquals(expectedText, actualText);

    }


    /////////////////////////////----AC-2/AC-7-----///////////////////////////////////////////

    public String testText = faker.chuckNorris().fact();

    @When("user enter text on message field")
    public void user_enter_text_on_message_field() {
        Driver.getDriver().switchTo().frame(message.textEditorIframe);
        message.textFld.sendKeys(testText);
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("user click on add more to open contact list")
    public void user_click_on_add_more_to_open_contact_list() {
        message.toAddMoreLink.click();
    }

    @When("user click on Employees and departments list")
    public void user_click_on_employees_and_departments_list() {
        message.empAndDeptList.click();
    }

    @When("user select an employee from contact list")
    public void user_select_an_employee_from_contact_list() {
        actions.moveToElement(message.helpDesk100).perform();
        message.helpDesk100.click();
    }

    @When("user select a department from contact list")
    public void user_select_a_department_from_contact_list() {
        message.HRDepartment.click();
        message.selectAllDeptAndSubDept.click();
    }

    @When("user click on Employees and departments list close button")
    public void user_click_on_employees_and_departments_list_close_button() {
        message.empAndDeptListCloseBtn.click();
    }

    @Then("message should be sent to selected users")
    public void message_should_be_sent_selected_users() {

        BrowserUtils.sleep(2);

        String expectedSender = ConfigurationReader.getProperty("username.hr");
        String actualSender = message.messageSender.getText();

        String expectedEmp = "helpdesk100@cybertekschool.com";
        String actualEmp = message.receiverEmployee.getText();

        String expectedDept = "HR";
        String actualDept = message.receiverDepartment.getText();

        String expectedText = testText;
        String actualText = message.textOfLastSentMessage.getText();

        Assert.assertEquals(expectedSender, actualSender);
        Assert.assertEquals(expectedEmp,actualEmp);
        Assert.assertEquals(expectedDept, actualDept);
        Assert.assertEquals(expectedText, actualText);

    }

    /////////////////////////////----AC-5-----///////////////////////////////////////////

    @And("user click on Quote")
    public void userClickOnQuote() {
        message.addQuoteBtn.click();

    }

    @And("user enter text on quote field")
    public void userEnterTextOnQuoteField() {
        Driver.getDriver().switchTo().frame(message.textEditorIframe);
        message.quoteEntryFld.sendKeys(testText);
        Driver.getDriver().switchTo().defaultContent();

    }

    @Then("message should be sent with quote text")
    public void messageShouldBeSentWithQuoteText() {

        BrowserUtils.sleep(2);

        String expectedSender = ConfigurationReader.getProperty("username.hr");
        String actualSender = message.messageSender.getText();

        String expectedText = testText;
        String actualText = message.quoteOfLastSentMessage.getText();

        Assert.assertEquals(expectedSender, actualSender);
        Assert.assertEquals(expectedText, actualText);




    }

    @Then("user should see {string} error message")
    public void userShouldSeeErrorMessage(String emptyMessageError) {

        String actErrMsg="The message title is not specified";

        Assert.assertEquals(emptyMessageError,actErrMsg);
    }
    //////////

}
