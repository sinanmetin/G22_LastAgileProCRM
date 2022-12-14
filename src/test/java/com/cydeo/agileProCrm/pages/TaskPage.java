package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.pages.quickMenu.MessageQM;
import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

    public TaskPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    ///////Task Page General///////////////////
    @FindBy(id = "tasks-buttonAdd")
    public WebElement newTaskBtn;

    @FindBy(xpath = "//span[.='All templates']")
    public WebElement allTemplatesBtn;

    @FindBy(xpath = "//button[@data-bx-id='templateselector-open']")
    public WebElement taskTemplatesButton;

    @FindBy(xpath = "//a[@class='ui-btn ui-btn-primary ui-btn-icon-add tasks-filter-btn-add']")
    public WebElement taskTemplatesAddButton;

    @FindBy(css = "span#pagetitle")
    public WebElement newTaskTemplatePageTitle;

    /////---New Task Page

    @FindBy(xpath = "//iframe[@class='side-panel-iframe']")
    public WebElement sidePanelIframe;


    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement textEditorIframe;

    @FindBy(xpath = "(//iframe[@class='bx-editor-iframe'])[2]")
    public WebElement textEditorIframeQuickMenu;


    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement taskNameFld;


    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement taskDescFld;

    @FindBy(css = "input#tasks-task-priority-cb")
    public WebElement highPriorityCB;

    @FindBy(xpath = "//span[@title='Add mention']")
    public WebElement addMention;

    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-deadline']/input")
    public WebElement deadline;

    @FindBy(xpath = "//span[@class='bx-calendar-button-text' and .='Select']")
    public WebElement selectDeadline;

    @FindBy(xpath = "//a[contains (text(), 'Change') and @class='js-id-tdp-mem-sel-is-open-form task-form-field-link']")
    public WebElement changeBtn;

    @FindBy(xpath = "//div[@id='bx-component-scope-bitrix_tasks_widget_member_selectorview_3']//span[.='change']")
    public WebElement respPersonQuickChange;

    @FindBy(xpath = "//span[@class='side-panel-close-inner']")
    public WebElement sidePanelClose;


    @FindBy(xpath = "(//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-empty task-form-field-link add'])[1]")
    public WebElement participantsAdd;

    @FindBy(xpath = "(//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-empty task-form-field-link add'])[2]")
    public WebElement observersAdd;

    @FindBy(xpath = "//a[@class='task-view-button edit ui-btn ui-btn-link']")
    public WebElement editBtn;

    @FindBy(css = "div.task-additional-alt-more")
    public WebElement moreBtn;

    @FindBy(xpath = "//input[@data-target='allow-time-tracking']")
    public WebElement allowTimeTracking;

    @FindBy(xpath = "//input[contains(@class,'js-id-timeestimate-hour')]")
    public WebElement timeTrackingHour;

    @FindBy(xpath = "//input[contains(@class,'js-id-timeestimate-minute')]")
    public WebElement timeTrackingMinute;

    @FindBy(xpath = "//button[@data-bx-id='task-edit-submit']")
    public WebElement taskEditSubmit;


    @FindBy(xpath = "//a[@data-bx-id='task-item-set-open-form'][1]/span[.='+ Add']")
    public WebElement subtaskOfAddBtn;

    @FindBy(css = "input#parenttask_task_input")
    public WebElement searchFldForSubTask;


    @FindBy(xpath = "//div[@class='finder-box-item finder-box-item-selected']")
    public WebElement searchedTask;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement selectSubTaskBtn;


    @FindBy(xpath = "(//a[@data-bx-id='task-item-set-open-form'])[2]/span[.='+ Add']")
    public WebElement dependentTasksAddBtn;

    @FindBy(css = "input#dependson_task_input")
    public WebElement searchFldForDependentTask;

    @FindBy (xpath = "//div[.='Dependent tasks']")
    public WebElement assertDependTask;


    @FindBy(xpath = "//a[contains(@class,'js-id-tag-sel-open-form')]/span[2]")
    public WebElement tagsAddBtn;

    @FindBy(xpath = "//div[@class='popup-tags-textbox']/input")
    public WebElement tagsInputFld;

    @FindBy(xpath = "//span[contains(@class,'popup-window-button-create')]")
    public WebElement tagsSaveBtn;


    @FindBy(xpath = "//button[@data-bx-id='task-edit-submit'][1]")
    public WebElement addTaskBtn;

    @FindBy(xpath = "//a[@class='menu-item-plus-icon']")
    public WebElement quickTaskPlusIcon;

    @FindBy(xpath = "//span[@class='js-id-checklist-is-open-form task-dashed-link-inner']")
    public WebElement checklistAddBtn;

    @FindBy(xpath = "//input[@placeholder='Things to do']")
    public WebElement checklistTextFld;

    @FindBy(xpath = "//span[@class='js-id-checklist-is-form-submit block-edit tasks-btn-apply task-field-title-ok']")
    public WebElement checklistSubmitBtn;

    @FindBy(xpath = "//span[@class='js-id-checklist-is-form-close tasks-btn-delete task-field-title-del']")
    public WebElement checkListCancelBnt;

    @FindBy(xpath = "//span[@class='js-id-checklist-is-i-title ']")
    public WebElement checklistCreatedTask;


    /////////New Task Template/////////////

    @FindBy(xpath = "//input[@class='js-id-task-template-edit-title']")
    public WebElement taskTemplateNameInput;

    @FindBy(xpath = "//span[.='Options']")
    public WebElement deadlineOptionsTog;

    @FindBy(xpath = "//input[@data-target='allow-change-deadline']")
    public WebElement respAllowChgDeadline;

    @FindBy(xpath = "//input[@data-target='task-control']")
    public WebElement approveTaskComp;

    @FindBy(xpath = "//button[contains(@class,'js-id-wfr-edit-form-submit')]")
    public WebElement createTaskTempBtn;


    /////////////Delete Task//////////////

    @FindBy(xpath = "//span[.='Delete' and @class='main-dropdown-item']")
    public WebElement selActDelete;

    @FindBy(xpath = "//span[@class='main-dropdown main-grid-panel-control']")
    public WebElement selectAction;

    @FindBy(css = "span#apply_button_control")
    public WebElement applyBtn;

    @FindBy(xpath = "//span[.='Continue']")
    public WebElement continueBtn;


    public void taskEditTogClicker(String togName) {

        String locator = "//span[@data-bx-id='task-edit-toggler' and .='" + togName + "']";
        BrowserUtils.waitForClickablility(By.xpath(locator), 10).click();

    }


    public WebElement userFinder(String email) {
        String locator = "//div[.='" + email + "' and @class='bx-finder-company-department-employee-name']";
        return Driver.getDriver().findElement(By.xpath(locator));
    }


    public WebElement findTask(String taskName) {
        String locator = "//a[.='" + taskName + "']";
        return Driver.getDriver().findElement(By.xpath(locator));
    }


    //////TASK PAGE TABLE UTILS///////////
    public WebElement findRespPsn(String taskName) {
        String locator = "//a[.='" + taskName + "']/../../following-sibling::td[3]//span[@class='tasks-grid-username-inner ']";
        return Driver.getDriver().findElement(By.xpath(locator));
    }

    public WebElement findSubTaskPlusIcon(String taskName) {
        String locator = "//a[.='" + taskName + "']//preceding-sibling::span[1]";
        return Driver.getDriver().findElement(By.xpath(locator));

    }

    public WebElement findTaskCheckBox(String taskName) {
        String locator = "//a[.='" + taskName + "']/../../preceding-sibling::td[2]/span";
        return Driver.getDriver().findElement(By.xpath(locator));

    }


}
