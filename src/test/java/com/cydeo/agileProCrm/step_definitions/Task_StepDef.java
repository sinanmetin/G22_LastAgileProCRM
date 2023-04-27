package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.Driver;
import com.cydeo.agileProCrm.utilities.ExcelUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.math3.optim.univariate.BrentOptimizer;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Task_StepDef extends TestBase {

    private String taskName = "Task -" + faker.numerify("###");
    private String taskDesc = faker.chuckNorris().fact();

    private String relatedTask;

    ///////////////AC-1//////////////////////////////////////

    @When("user click on New Task button")
    public void user_click_on_new_task_button() {
        BrowserUtils.waitForClickablility(task.newTaskBtn, 10).click();
        Driver.getDriver().switchTo().frame(task.sidePanelIframe);

    }

    @When("user enter task name and description")
    public void user_enter_task_name_and_description() {

        task.taskNameFld.sendKeys(taskName);
        Driver.getDriver().switchTo().frame(task.textEditorIframe);
        task.taskDescFld.sendKeys(taskDesc);
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("user click on High Priority")
    public void user_click_on_high_priority() {
        task.highPriorityCB.click();
    }

    @And("user mention {string} under New task")
    public void userMentionUnderNewTask(String email) {
        task.addMention.click();
        findAndClickOnUser(email);
    }

    @And("user change {string} for {string}")
    public void userSelectForCreatedBy(String email, String togName) {
        task.taskEditTogClicker(togName);
        BrowserUtils.waitForClickablility(task.changeBtn, 10).click();
        findAndClickOnUser(email);

    }


    @When("user enter a Deadline")
    public void user_enter_a_deadline() {

        task.deadline.click();
        BrowserUtils.waitForClickablility(task.selectDeadline, 10).click();

    }

    @When("user click on Save button")
    public void user_click_on_save_button() {
        task.addTaskBtn.click();
        Driver.getDriver().switchTo().defaultContent();


    }

    @Then("user should see the Task under My tasks List")
    public void user_should_see_the_task_under_my_tasks_list() {


        Assert.assertTrue(task.findTask(taskName).isDisplayed());


    }

    @And("write task name to the Exel sheet")
    public void writeTaskNameToTheExelSheet() {

        XSSFSheet sheet = ExcelUtil.openAndGetSheet("Sinan");

        sheet.getRow(1).getCell(1).setCellValue(taskName);

        ExcelUtil.fileSaveAndCloseAll();

    }

    ////////////////------AC2-------/////////////////////////////////////


    @When("user login {string} {string}")
    public void user_login(String username, String password) {
        loginPage.login(username, password);
    }

    @And("get related task name from Exel sheet")
    public void getRelatedTaskNameFromExelSheet() {
        XSSFSheet sheet = ExcelUtil.openAndGetSheet("Sinan");
        relatedTask = sheet.getRow(1).getCell(1).toString();

    }

    @And("user click related task")
    public void userClickRelatedTask() {


        BrowserUtils.waitForClickablility(task.findTask(relatedTask), 10).click();


    }

    @And("user declare {string} as responsible person")
    public void userDeclareHimselfAsResponsiblePerson(String email) {
        Driver.getDriver().switchTo().frame(task.sidePanelIframe);
        BrowserUtils.waitForClickablility(task.respPersonQuickChange, 10).click();
        findAndClickOnUser(email);
        Driver.getDriver().switchTo().defaultContent();
        task.sidePanelClose.click();


    }

    @Then("user should see {string} as responsible person")
    public void userShouldSeeHimselfAsResponsiblePerson(String email) {


        Assert.assertEquals(email, task.findRespPsn(relatedTask).getText());


    }


    ////////METHODS///////////////////////////////

    public void findAndClickOnUser(String email) {

        String locator = "//div[.='" + email + "' and @class='bx-finder-company-department-employee-name']";
        BrowserUtils.waitForClickablility(message.empAndDeptList, 10).click();
        BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(locator)));
        BrowserUtils.waitForClickablility(Driver.getDriver().findElement(By.xpath(locator)), 10).click();


    }

////////////////////////////////////////////////////////////

    ////////////-----------AC-3-----------//////////////////////

    @And("user click on last created task")
    public void userClickOnLastCreatedTask() {
        BrowserUtils.waitForClickablility(task.findTask(taskName), 10).click();
    }

    @And("user click on Edit button")
    public void userClickOnEditButton() {
        Driver.getDriver().switchTo().frame(task.sidePanelIframe);
        BrowserUtils.waitForClickablility(task.editBtn, 10).click();

    }

    @And("user clicks on More button")
    public void userClicksOnMoreButton() {
        BrowserUtils.waitForClickablility(task.moreBtn, 10).click();
    }

    @And("user set Time Tracking {string} hours {string} minutes")
    public void userSetTimeTrackingHoursMinutes(String hour, String minute) {


        BrowserUtils.scrollToElement(task.allowTimeTracking);
        BrowserUtils.waitForClickablility(task.allowTimeTracking, 10).click();
        BrowserUtils.waitForClickablility(task.timeTrackingHour, 10).sendKeys(hour);
        BrowserUtils.waitForClickablility(task.timeTrackingMinute, 10).sendKeys(minute);


    }

    @And("user click on Save Changes button")
    public void userClickOnSaveChangesButton() {
        task.taskEditSubmit.click();
        Driver.getDriver().switchTo().defaultContent();
        task.sidePanelClose.click();

    }

    @Then("user should see timer under the task name")
    public void userShouldSeeTimerUnderTheTaskName() {

        String locator = "//a[.='" + taskName + "']/..//span[@class='task-timer-time']";
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath(locator)).getText().contains("02:30"));

    }

    //////////////////////----------AC5-----------/////////////////////////////

    @And("user clicks on plus button next to {string} in Activity Stream Menu")
    public void userClicksOnPlusButtonNextToTaskInActivityStreamMenu(String menuItem) {

        WebElement tasks = Driver.getDriver().findElement(By.xpath("//a[@title='Tasks']"));
        actions.moveToElement(tasks).perform();
        BrowserUtils.waitForClickablility(task.quickTaskPlusIcon, 10).click();
        Driver.getDriver().switchTo().frame(task.sidePanelIframe);

    }

    @And("user click on Subtask of +Add button")
    public void userClickOnSubtaskOfAddButton() {
        BrowserUtils.waitFor(1);
        BrowserUtils.scrollToElement(task.subtaskOfAddBtn);
        BrowserUtils.waitForClickablility(task.subtaskOfAddBtn, 10).click();

    }

    @When("user search related task")
    public void user_search_related_task() {

        BrowserUtils.waitForClickablility(task.searchFldForSubTask, 10).sendKeys(relatedTask);
    }

    @And("user click on related task from list")
    public void userClickOnRelatedTaskFromList() {

        WebElement searchedMainTask = Driver.getDriver().findElement(By.xpath("//div[.='" + relatedTask + "' and @class='finder-box-item-text']"));
        BrowserUtils.waitForClickablility(searchedMainTask, 10).click();


    }

    @And("user click on Select button")
    public void userClickOnSelectButton() {
        task.selectSubTaskBtn.click();

    }

    @And("user click on plus button next to related task to see subtasks")
    public void userClickOnPlusButtonNextToRelatedTaskToSeeSubtasks() {

        BrowserUtils.waitForClickablility(task.findSubTaskPlusIcon(relatedTask), 10).click();

    }

    @Then("user should see created subtask under the related task")
    public void userShouldSeeCreatedSubtaskUnderTheRelatedTask() {
        BrowserUtils.waitForVisibility(task.findTask(taskName), 10);
        Assert.assertTrue(task.findTask(taskName).isDisplayed());

    }

    ////////////----------AC7---------////////////////////////////////////

    @And("user select {string} as a {string}")
    public void userSelectAsA(String email, String togName) {

        task.taskEditTogClicker(togName);
        BrowserUtils.waitForClickablility(task.participantsAdd, 10).click();
        findAndClickOnUser(email);
        message.empAndDeptListCloseBtn.click();

    }

    @And("user select {string} as an {string}")
    public void userSelectAsAn(String email, String togName) {

        task.taskEditTogClicker(togName);
        BrowserUtils.waitForClickablility(task.observersAdd, 10).click();
        findAndClickOnUser(email);
        message.empAndDeptListCloseBtn.click();

    }

    @Then("user should see {string} as {string}")
    public void userShouldSeeAs(String email, String togName) {


        Driver.getDriver().switchTo().frame(task.sidePanelIframe);


        String locator = "//div[contains(.,'" + togName + "') and @class='task-detail-sidebar-info-title task-detail-sidebar-info-title-line']/following-sibling::div[1]";
        BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(locator)));
        Assert.assertEquals(email, Driver.getDriver().findElement(By.xpath(locator)).getText());
        Driver.getDriver().switchTo().defaultContent();
    }

    ///////----AC8------//////////////////////////////////


    @And("user click add Checklist button")
    public void userClickAddChecklistButton() {

        Driver.getDriver().switchTo().frame(task.sidePanelIframe);
        BrowserUtils.waitForClickablility(task.checklistAddBtn, 10).click();

    }

    @And("user add {string} as checklist items")
    public void userAddAsChecklistItems(String item) {

        for (int i = 1; i < 4; i++) {

            String locator = "(//input[@placeholder='Things to do'])[" + i + "]";
            WebElement textFld = Driver.getDriver().findElement(By.xpath(locator));
            BrowserUtils.waitForClickablility(textFld, 10).sendKeys(item + i + " " + Keys.ENTER);

        }
        Driver.getDriver().switchTo().defaultContent();
        task.sidePanelClose.click();
    }

    @Then("user should see created checklist items under the related task")
    public void userShouldSeeCreatedChecklistItemsUnderTheRelatedTask() {
        Driver.getDriver().switchTo().frame(task.sidePanelIframe);
        List<WebElement> checklistItems = Driver.getDriver().findElements(By.xpath("//span[@class='js-id-checklist-is-i-title ']"));
        Assert.assertEquals(3, checklistItems.size());
    }


    ///////////////--------AC9---------////////////////

    @And("user open last created task")
    public void userOpenLastCreatedTask() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.waitForClickablility(task.findTask(taskName), 10).click();

    }

    @And("user click on Dependent tasks +Add button")
    public void userClickOnDependentTasksAddButton() {


        for (int i = 0; i < 6; i++) {

            actions.sendKeys(Keys.PAGE_DOWN).perform();
        }
        BrowserUtils.waitFor(1);
        BrowserUtils.waitForVisibility(task.dependentTasksAddBtn, 10).click();

    }

    @And("user search related Dependent task")
    public void userSearchRelatedDependentTask() {

        BrowserUtils.waitForVisibility(task.searchFldForDependentTask, 10).sendKeys("Task");


    }

    @And("user click on dependent task from list")
    public void userClickOnDependentTaskFromList() {

        WebElement searchedMainTask = Driver.getDriver().findElement(By.xpath("//div[@id='dependson_search']//div[contains(.,'Task ')]"));
        BrowserUtils.waitForClickablility(searchedMainTask, 10).click();

    }

    @Then("user should see related task as Dependent task")
    public void userShouldSeeRelatedTaskAsDependentTask() {

        Driver.getDriver().switchTo().frame(task.sidePanelIframe);

        Assert.assertTrue(task.assertDependTask.isDisplayed());

    }


    //////////////////------AC10-------////////////////////////

    @And("user click on TASK TEMPLATES")
    public void userClickOnTASKTEMPLATES() {
        BrowserUtils.waitForClickablility(task.taskTemplatesButton, 10).click();

    }

    @And("user click on All templates")
    public void userClickOnAllTemplates() {
        BrowserUtils.waitForClickablility(task.allTemplatesBtn, 10).click();
    }

    @And("user click on +ADD button")
    public void userClickOnADDButton() {

        BrowserUtils.waitForClickablility(task.taskTemplatesAddButton, 10).click();

    }

    @Then("user should landed {string} page")
    public void userShouldLandedPage(String pageHeader) {

        Assert.assertEquals(pageHeader, task.newTaskTemplatePageTitle.getText());


    }

    @And("user enter task template name and description")
    public void userEnterTaskTemplateNameAndDescription() {

        task.taskTemplateNameInput.sendKeys(taskName);
        Driver.getDriver().switchTo().frame(task.textEditorIframe);
        task.taskDescFld.sendKeys(taskDesc);
        Driver.getDriver().switchTo().parentFrame();

    }


    @And("user specify deadline options")
    public void userSpecifyDeadlineOptions() {

        for (int i = 0; i < 4; i++) {

            actions.sendKeys(Keys.PAGE_DOWN).perform();
        }

        BrowserUtils.waitForClickablility(task.deadlineOptionsTog, 10).click();
        BrowserUtils.waitForClickablility(task.respAllowChgDeadline, 10).click();
        BrowserUtils.waitForClickablility(task.approveTaskComp, 10).click();


    }

    @Then("user click on Create Task Template button")
    public void userClickOnCreateTaskTemplateButton() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        BrowserUtils.waitForClickablility(task.createTaskTempBtn, 10).click();

    }

    @Then("user should see Task under Task templates list")
    public void userShouldSeeTaskUnderTaskTemplatesList() {
        Assert.assertTrue(task.findTask(taskName).isDisplayed());

    }

    @And("user select created Task")
    public void userSelectCreatedTask() {

        BrowserUtils.waitForClickablility(task.findTaskCheckBox(taskName), 10).click();
    }

    @And("user Select Action Delete")
    public void userSelectActionDelete() {

        BrowserUtils.scrollToElement(task.selectAction);
        task.selectAction.click();
        BrowserUtils.waitForClickablility(task.selActDelete, 10).click();
    }

    @And("user click on APPLY")
    public void userClickOnAPPLY() {
        BrowserUtils.waitForClickablility(task.applyBtn, 10).click();

    }

    @And("user confirm action")
    public void userConfirmAction() {
        BrowserUtils.waitForClickablility(task.continueBtn, 10).click();

    }

    @Then("user shouldn't see that task under My tasks list")
    public void userShouldnTSeeThatTaskUnderMyTasksList() {

        String locator = "//a[.='" + taskName + "']";
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        BrowserUtils.verifyElementNotDisplayed(By.xpath(locator));


    }


    @And("user enter task name and description on quick menu")
    public void userEnterTaskNameAndDescriptionOnQuickMenu() {

        task.taskNameFld.sendKeys(taskName);
        Driver.getDriver().switchTo().frame(task.textEditorIframeQuickMenu);
        task.taskDescFld.sendKeys(taskDesc);
        Driver.getDriver().switchTo().parentFrame();

    }

    //recomit
}










