package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Task_StepDef extends TestBase {

    String taskName="Task -"+ faker.numerify("###");
    String taskDesc=faker.chuckNorris().fact();

    @When("user click on New Task button")
    public void user_click_on_new_task_button() {
        BrowserUtils.waitForClickablility(task.newTaskBtn,10).click();
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
    @When("user mention an user under New task")
    public void user_mention_an_user() {
        task.addMention.click();
        BrowserUtils.waitForClickablility(message.empAndDeptList,10).click();
        BrowserUtils.scrollToElement(message.helpDesk100);
        BrowserUtils.waitForClickablility(message.helpDesk100,10).click();

    }
    @When("user enter a Deadline")
    public void user_enter_a_deadline() {

        task.deadline.click();
        BrowserUtils.waitForClickablility(task.selectDeadline,10).click();

    }
    @When("user click on Save button")
    public void user_click_on_save_button() {
        task.addTaskBtn.click();

    }
    @Then("user should see the Task under My tasks List")
    public void user_should_see_the_task_under_my_tasks_list() {

    }







}
