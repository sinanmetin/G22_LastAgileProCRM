package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.Driver;
import com.cydeo.agileProCrm.utilities.ExcelUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task_StepDef extends TestBase {

    private String taskName = "Task -" + faker.numerify("###");
    private String taskDesc = faker.chuckNorris().fact();

    private String relatedTask;

    ///////////////AC-1//////////////////////////////////////

    @When("user click on New Task button")
    public void user_click_on_new_task_button() {
        BrowserUtils.waitForClickablility(task.newTaskBtn, 10).click();
    }

    @When("user enter task name and description")
    public void user_enter_task_name_and_description() {
        Driver.getDriver().switchTo().frame(task.sidePanelIframe);
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

    @And("user select {string} for created by")
    public void userSelectForCreatedBy(String email) {
        task.taskEditTogClicker("Created by");
        BrowserUtils.waitForClickablility(task.changeBtn,10).click();
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

    }

    @Then("user should see the Task under My tasks List")
    public void user_should_see_the_task_under_my_tasks_list() {

        Driver.getDriver().switchTo().defaultContent();
        BrowserUtils.waitForPageToLoad(10);
        Assert.assertTrue(task.findTask(taskName).isDisplayed());



    }

    @And("write task name to the Exel sheet")
    public void writeTaskNameToTheExelSheet() {

        XSSFSheet sheet=ExcelUtil.openAndGetSheet("Sinan");

        sheet.getRow(1).getCell(1).setCellValue(taskName);

        ExcelUtil.fileSaveAndCloseAll();

    }


    @When("user login {string} {string}")
    public void user_login(String username, String password) {
        loginPage.login(username,password);
    }


    @And("user click related task")
    public void userClickRelatedTask() {

        XSSFSheet sheet = ExcelUtil.openAndGetSheet("Sinan");
        relatedTask=sheet.getRow(1).getCell(1).toString();
        BrowserUtils.waitForClickablility(task.findTask(relatedTask),10).click();

    }

    @And("user declare {string} as responsible person")
    public void userDeclareHimselfAsResponsiblePerson(String email) {
        Driver.getDriver().switchTo().frame(task.sidePanelIframe);
        BrowserUtils.waitForClickablility(task.respPersonQuickChange,10).click();
        findAndClickOnUser(email);
        Driver.getDriver().switchTo().defaultContent();
        task.sidePanelClose.click();


    }

    @Then("user should see {string} as responsible person")
    public void userShouldSeeHimselfAsResponsiblePerson(String email) {


        Assert.assertEquals(email,task.findRespPsn(relatedTask).getText());


    }



    ////////METHODS///////////////////////////////

    public void findAndClickOnUser(String email){

        String locator="//div[.='"+email+"' and @class='bx-finder-company-department-employee-name']";
        BrowserUtils.waitForClickablility(message.empAndDeptList, 10).click();
        BrowserUtils.scrollToElement( Driver.getDriver().findElement(By.xpath(locator)));
        BrowserUtils.waitForClickablility( Driver.getDriver().findElement(By.xpath(locator)), 10).click();


    }




}



