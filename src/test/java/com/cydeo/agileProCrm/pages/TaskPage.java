package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

    public TaskPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    ///////Task Page General///////////////////
    @FindBy (id ="tasks-buttonAdd" )
    public WebElement newTaskBtn;

    @FindBy (xpath = "//span[.='All templates']")
    public WebElement allTemplatesBtn;

    /////---New Task Page

    @FindBy (xpath ="//iframe[@class='side-panel-iframe']" )
    public WebElement sidePanelIframe;


    @FindBy (xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement textEditorIframe;


    @FindBy (xpath ="//input[@data-bx-id='task-edit-title']" )
    public WebElement taskNameFld;


    @FindBy (xpath = "//body[@contenteditable='true']")
    public WebElement taskDescFld;

    @FindBy(css = "input#tasks-task-priority-cb")
    public WebElement highPriorityCB;

    @FindBy(xpath = "//span[@title='Add mention']")
    public WebElement addMention;

    @FindBy(xpath = "//span[@data-bx-id='dateplanmanager-deadline']/input")
    public WebElement deadline;

    @FindBy(xpath = "//span[@class='bx-calendar-button-text' and .='Select']")
    public WebElement selectDeadline;


    @FindBy (xpath =   "//span[@data-bx-id='task-edit-toggler' and .='Created by']" )
    public WebElement createdBy;

    @FindBy (xpath =   "//span[@data-bx-id='task-edit-toggler' and .='Participants']" )
    public WebElement participants;

    @FindBy (xpath =   "//span[@data-bx-id='task-edit-toggler' and .='Observers']" )
    public WebElement observers;

    @FindBy (css = "div.task-additional-alt-more")
    public WebElement moreBtn;

    @FindBy (xpath = "//input[@data-target='allow-time-tracking']")
    public WebElement allowTimeTracking;

    @FindBy (xpath = "//input[contains(@class,'js-id-timeestimate-hour')]")
    public WebElement timeTrackingHour;

    @FindBy (xpath = "//input[contains(@class,'js-id-timeestimate-minute')]")
    public WebElement timeTrackingMinute;

    @FindBy (xpath = "//a[contains(@class,'js-id-tag-sel-open-form')]/span[2]")
    public WebElement tagsAddBtn;

    @FindBy (xpath = "//div[@class='popup-tags-textbox']/input")
    public WebElement tagsInputFld;

    @FindBy (xpath = "//span[contains(@class,'popup-window-button-create')]")
    public WebElement tagsSaveBtn;


    @FindBy(xpath = "//button[@data-bx-id='task-edit-submit'][1]")
    public WebElement addTaskBtn;



    public void taskEditTogClicker(String togName){

        String locator="//span[@data-bx-id='task-edit-toggler' and .='"+togName+"']";
        BrowserUtils.waitForClickablility(By.xpath(locator),10).click();

    }




}
