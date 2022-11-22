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
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Appreciate_StepDef extends TestBase {

    Appreciate_Page appreciate = new Appreciate_Page();

//--------AC-1---------
    @When("user click {string} on Quick Menu")
    public void user_click_on_quick_menu(String linkText) {
        BrowserUtils.waitForClickablility(ASM.activityStream,10).click();
        homePage.quickMenuClick(linkText);
    }

    //-------------AC-1-----------
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
        BrowserUtils.sleep(2);
        appreciate.MyDriveBtn.click();
        BrowserUtils.sleep(2);
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


   @Then("image，file and document should be uploaded")
    public void imageAndFileShouldBeUploaded() {

        Driver.getDriver().switchTo().frame(appreciate.iframe);

        Assert.assertTrue(appreciate.ImageConfirm.isDisplayed());
        Assert.assertTrue(appreciate.FileConfirm.isDisplayed());
       Assert.assertTrue(appreciate.DocumentConfirm.isDisplayed());

        Driver.getDriver().switchTo().defaultContent();

    }

    @Then("user click on Download from external drive")
    public void userClickOnDownloadFromExternalDrive() {
        appreciate.DownloadFromExternalDrive.click();
    }

    @And("user click on Office 365")
    public void userClickOnOffice() {
        appreciate.office365.click();
    }

    @Then("user see a notification that should contact to Administrator")
    public void userSeeANotificationThatShouldContactToAdministrator() {
        Assert.assertTrue(appreciate.AdminNotification.isDisplayed());
        BrowserUtils.waitFor(3);
        appreciate.cancelBtn.click();
    }

    @Then("user click the send button")
    public void userClickTheSendButton() {
        appreciate.sendBtn.click();
    }

    //------------AC-2-------------
    @Given("user click on Add more button")
    public void user_click_on_add_more_button() {
        BrowserUtils.waitForVisibility(appreciate.addMoreBtn,10);
        appreciate.addMoreBtn.click();
    }

    public void findAndClickOnUser(String email) {

        String locator = "//div[.='" + email + "' and @class='bx-finder-company-department-employee-name']";
        BrowserUtils.waitForClickablility(appreciate.HRBtn, 10).click();
        BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(locator)));
        BrowserUtils.waitForClickablility(Driver.getDriver().findElement(By.xpath(locator)), 10).click();
    }

    @Then("user click on Employees and departments button and choose {string} user from HR department")
    public void user_click_on_employees_and_departments_button_and_choose_helpdesk9_user_from_hr_department(String email) {

        appreciate.EmployeesAndDepartmentsBtn.click();
        findAndClickOnUser(email);
    }
    @Then("user click two times on helpdesk9 user from recent contact lists")
    public void user_click_two_times_on_helpdesk9_user_from_recent_contact_lists() {

        appreciate.Recent.click();
        BrowserUtils.waitFor(2);
        appreciate.helpdesk9.click();
        BrowserUtils.waitFor(2);
        appreciate.helpdesk9.click();
    }

    @Then("user click on X button to close contacts")
    public void user_click_on_x_button_to_close_contacts() {
        appreciate.xBtn.click();
    }

    @Then("user have added helpdesk9 as a recipient")
    public void userHaveAddedHelpdeskAsARecipient() {

        Assert.assertTrue((appreciate.recipient.getText()).contains("helpdesk9@cybertekschool.com"));
    }

    //-------------AC-6-----------
    @And("user click on add mention icon and choose {string} from Employees and departments")
    public void userClickOnAddMentionIconAndChooseHelpdesk9FromTheList(String email) {

        appreciate.addMentionBtn.click();
        BrowserUtils.waitFor(1);
        appreciate.EmployeeDepartments.click();
        BrowserUtils.waitFor(1);
        String locator = "//div[.='" + email + "' and @class='bx-finder-company-department-employee-name']";
        BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(locator)));
        BrowserUtils.waitFor(1);
        BrowserUtils.waitForClickablility(Driver.getDriver().findElement(By.xpath(locator)), 10).click();

    }

    @Then("user should see hr11 in content part")
    public void userShouldSeeHr11InContentPart() {
        Driver.getDriver().switchTo().frame(appreciate.iframe);
        Assert.assertTrue(appreciate.contentHr11.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();

    }
//------------AC-3----------------
    @When("User click on Link button")
    public void user_click_on_link_button() {

        appreciate.LinkIcon.click();
    }
    @When("User enter {string} in Text")
    public void user_enter_in_text(String string) {

        appreciate.LinkText.sendKeys(string);
    }
    @When("User copy and paste the link from Youtube")
    public void user_copy_and_paste_the_link_from_youtube() {

        appreciate.LinkLink.sendKeys("https://www.youtube.com/watch?v=8An2SxNFvmU");
    }
    @Then("User click on save button")
    public void user_click_on_save_button() {

        appreciate.LinkSaveBtn.click();
    }

    @Then("User should see the link in Text Part")
    public void user_should_see_the_link_in_text_part() {
        Driver.getDriver().switchTo().frame(appreciate.iframe);
        Assert.assertTrue(appreciate.DoNothingAdded.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
    }

    //-------------AC-5-----------
    @Given("User click on quote text button")
    public void user_click_on_quote_text_button() {

        appreciate.QuoteTextIcon.click();
    }

    @Given("user enter {string} and should see the quote in Text Part")
    public void user_enter(String string) {
        Driver.getDriver().switchTo().frame(appreciate.iframe);
        appreciate.WriteCelebration.sendKeys(string);
        Assert.assertTrue(appreciate.WriteCelebration.getText().contains("Celebration"));
        Driver.getDriver().switchTo().defaultContent();
    }

    //-------------AC-7-----------
    @Given("user click on visual editor icon")
    public void user_click_on_visual_editor_icon() {
        appreciate.VisualEditorIcon.click();
    }
    @Given("user should see the editor text bar on top of the message box")
    public void user_should_see_the_editor_text_bar_on_top_of_the_message_box() {
        Assert.assertTrue(appreciate.EditorTextBar.isDisplayed());
    }

    //-------------AC-8-----------
    @Given("user click on Topic icon")
    public void userClickOnTopicIcon() {
        appreciate.TopicIcon.click();
    }

    @Then("user should see the appreciation Topic text box display on top of the message box")
    public void userShouldSeeTheAppreciationTopicTextBoxDisplayOnTopOfTheMessageBox() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(appreciate.TopicTextBox.isDisplayed());
    }

    //----------AC-10-------------
    @When("user click on Add tag button")
    public void user_click_on_add_tag_button() {
        appreciate.addTagIcon.click();
    }
    @When("enter {string} in Tag space")
    public void enter_in_tag_space(String string) {
        appreciate.TagSpace.sendKeys(string + Keys.ENTER);
    }
    @Then("user should see {string} in Tag box")
    public void user_should_see_in_tag_box(String string) {
        Assert.assertTrue(appreciate.wip1.isDisplayed());
    }

    @Then("user click on Add tag button again and enter {string}")
    public void user_click_on_add_tag_button_again_and_enter(String string) {

        appreciate.addTagIcon.click();
        appreciate.TagSpace.sendKeys(string + Keys.ENTER);
    }
    @Then("user can also see {string} in Tag box")
    public void user_can_also_see_in_tag_box(String string) {
        Assert.assertTrue(appreciate.wip2.isDisplayed());
    }

    //---------AC-11---------
    @And("user click on the existing emoji")
    public void userClickOnTheExistingEmoji() {
        appreciate.existingEmoji.click();
    }

    @And("user should see all types of appreciation emojis")
    public void userShouldSeeAllTypesOfAppreciationEmojis() {
        Assert.assertTrue(appreciate.AllEmojis.isDisplayed());
    }
}
