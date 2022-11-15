package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.pages.quickMenu.Appreciate_Page;
import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.ConfigurationReader;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Appreciate_StepDef extends TestBase {

    Appreciate_Page appreciate = new Appreciate_Page();

    @When("user click more on Menu")
    public void user_click_more_on_menu(){
        appreciate.moreBtn.click();

    }

    @When("user click {string} on Quick Menu")
    public void user_click_on_quick_menu(String linkText) {
        BrowserUtils.waitForClickablility(ASM.activityStream,10).click();
        homePage.quickMenuClick(linkText);
    }


    @When("user click on Upload Files icon")
    public void user_click_on_upload_files_icon()  {

        appreciate.uploadFilesBtn.click();

    }

    @Then("user click on Upload Files and images and choose an image")
    public void user_click_on_upload_files_and_images_and_choose_an_image() {
        appreciate.uploadFilesAndImagesBtn.sendKeys(ConfigurationReader.getProperty("flower"));
    }
    @Then("user click on insert in text")
    public void user_click_on_insert_in_text()  {
        appreciate.insertInText1.click();

    }
    @Then("user click on Upload Files and images and upload a file")
    public void user_click_on_upload_files_and_images_and_upload_a_file() {
        appreciate.uploadFilesAndImagesBtn.sendKeys(ConfigurationReader.getProperty("Cydeo"));
    }
    @Then("user click on insert in text again")
    public void user_click_on_insert_in_text_again() {

        appreciate.insertInText2.click();
    }

    @Then("user click on select document from Bitrix24")
    public void user_click_on_select_document_from_bitrix24() {
        appreciate.selectDocumentFromBitrix24.click();
    }
    @Then("user click on Sales and marketing")
    public void user_click_on_sales_and_marketing() {
        appreciate.salesAndMarketingBtn.click();
        appreciate.MyDriveBtn.click();
        appreciate.salesAndMarketingBtn.click();

    }
    @Then("user select Agile Pro CRM Test Plan")
    public void user_select_agile_pro_crm_test_plan() {
        BrowserUtils.sleep(2);
        appreciate.AgileProCRMTestPlanFile.click();

    }
    @Then("user click on SELECT DOCUMENT button")
    public void user_click_on_select_document_button() {
        appreciate.selectDocumentBtn.click();
    }
    @Then("user click on in text button")
    public void user_click_on_in_text_button() {
        appreciate.insexInText3.click();
    }


   /* @Then("image and file should be uploaded")
    public void imageAndFileShouldBeUploaded() {

        Driver.getDriver().switchTo().frame(appreciate.ifram);

        Assert.assertTrue(appreciate.File1Confirm.isDisplayed());
        Assert.assertTrue(appreciate.File2Confirm.isDisplayed());

        Driver.getDriver().switchTo().defaultContent();

    }*/

    @Then("user click on Download from external drive")
    public void userClickOnDownloadFromExternalDrive() {
        appreciate.DownloadFromExternalDrive.click();
    }

    @And("user click on Office 365")
    public void userClickOnOffice() {
        appreciate.office365.click();
    }

    @Then("user see a notification that should contact to Administrator#Then image and file should be uploaded")
    public void userSeeANotificationThatShouldContactToAdministratorThenImageAndFileShouldBeUploaded() {
        Assert.assertTrue(appreciate.AdminNotification.isDisplayed());
        appreciate.cancelBtn.click();
    }

    @Then("user click the send button")
    public void userClickTheSendButton() {
        appreciate.sendBtn.click();
    }

    @Given("user click on Add more button")
    public void user_click_on_add_more_button() {

    }
    @Then("user click on hr22 user from recent contact lists")
    public void user_click_on_hr22_user_from_recent_contact_lists() {

    }
    @Then("user click on Employees and departments button and choose helpdesk9 user from HR department")
    public void user_click_on_employees_and_departments_button_and_choose_helpdesk9_user_from_hr_department() {

    }

    @Then("user click on X button to close contacts")
    public void user_click_on_x_button_to_close_contacts() {

    }
    @When("User click on Link button")
    public void user_click_on_link_button() {

    }
    @When("User enter {string} in Text")
    public void user_enter_in_text(String string) {

    }
    @When("User copy and paste the link from Youtube")
    public void user_copy_and_paste_the_link_from_youtube() {

    }
    @Then("User click on save button")
    public void user_click_on_save_button() {

    }
    @Given("User click on quote text button")
    public void user_click_on_quote_text_button() {

    }



}
