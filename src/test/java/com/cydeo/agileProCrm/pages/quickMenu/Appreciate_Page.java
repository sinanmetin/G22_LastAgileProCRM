package com.cydeo.agileProCrm.pages.quickMenu;

import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Appreciate_Page {

    public Appreciate_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="feed-add-post-form-link-text")
    public WebElement moreBtn;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesBtn;

    @FindBy(name = "bxu_files[]")
    public WebElement uploadFilesAndImagesBtn;

    @FindBy(xpath = "(//span[@class='f-wrap'])[1]")
    public WebElement uploadedFile1;

    @FindBy(xpath = "(//span[@class='f-wrap'])[2]")
    public WebElement uploadedFile2;

    @FindBy(xpath = "//span[@class='insert-btn-text']")
    public WebElement insertInText1;

    @FindBy(xpath = "(//span[@class='insert-btn-text'])[2]")
    public WebElement insertInText2;

    @FindBy(xpath = "//iframe[@style='width: 100%; height: 100%;']")
    public WebElement iframe;

    @FindBy(xpath = "//img[@style='max-width:400px;max-height:400px;']")
    public WebElement ImageConfirm;

    @FindBy(xpath = "//span[contains(@style,'color: #2067B0; border-bottom:')]")
    public WebElement FileConfirm;

    @FindBy(xpath = "(//span[contains(@style,'color: #2067B0; border-bottom:')])[2]")
    public WebElement DocumentConfirm;

    @FindBy(xpath = "//span[@class='wd-fa-add-file-light-title-text diskuf-selector-link']")
    public WebElement selectDocumentFromBitrix24;

    @FindBy(xpath = "(//span[@class='bx-file-dialog-tab-item-link-text'])[3]")
    public WebElement salesAndMarketingBtn;

    @FindBy(xpath = "//a[.='Agile Pro CRM Test Plan.docx']")
    public WebElement AgileProCRMTestPlanFile;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement selectDocumentBtn;

    @FindBy(xpath = "(//span[@class='insert-btn-text'])[3]")
    public WebElement insexInText3;

    @FindBy(xpath = "(//span[@class='bx-file-dialog-tab-item-link-text'])[2]")
    public WebElement MyDriveBtn;
    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(xpath = "//span[@class='wd-fa-add-file-light-title diskuf-selector-link-cloud']")
    public WebElement DownloadFromExternalDrive;

    @FindBy(xpath = "//span[@title='Office 365']")
    public WebElement office365;

    @FindBy(xpath = "//div[@class='ui-notification-balloon ui-notification-balloon-animate']")
    public WebElement AdminNotification;

    @FindBy(xpath = "//span[.='Cancel']")
    public WebElement cancelBtn;

    @FindBy(id = "bx-destination-tag")
    public WebElement addMoreBtn;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement EmployeesAndDepartmentsBtn;

    @FindBy(xpath = "(//div[.='HR'])[3]")
    public WebElement HRBtn;

    @FindBy(xpath = "//div[.='helpdesk9@cybertekschool.com']")
    public WebElement helpdesk9;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-last']")
    public WebElement Recent;

    @FindBy(xpath = "//span[@style='top: 12px; right: 15px;']")
    public WebElement xBtn;

    @FindBy(xpath = "//span[@class='feed-add-post-destination feed-add-post-destination-users']")
    public WebElement recipient;

    @FindBy(xpath = "//span[@title='Add mention']")
    public WebElement addMentionBtn;

    @FindBy(xpath = "//span[@class='bxhtmled-metion']")
    public WebElement contentHr11;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement LinkIcon;

    @FindBy(xpath = "//input[@placeholder='Link text']")
    public WebElement LinkText;

    @FindBy(xpath = "//input[@placeholder='Link URL']")
    public WebElement LinkLink;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement LinkSaveBtn;

    @FindBy(xpath = "//a[@href='https://www.youtube.com/watch?v=8An2SxNFvmU']")
    public WebElement DoNothingAdded;

    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement QuoteTextIcon;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement WriteCelebration;

    @FindBy(xpath = "//span[@title='Visual editor']")
    public WebElement VisualEditorIcon;

    @FindBy(xpath = "//div[@class='bxhtmled-toolbar']")
    public WebElement EditorTextBar;

    @FindBy(id = "lhe_button_title_blogPostForm")
    public WebElement TopicIcon;

    @FindBy(id = "POST_TITLE")
    public WebElement TopicTextBox;

    @FindBy(xpath = "//span[@class='feed-add-grat-box feed-add-grat-medal-thumbsup']")
    public WebElement existingEmoji;

    @FindBy(id = "popup-window-content-BXSocNetGratSelector")
    public WebElement AllEmojis;

    @FindBy(xpath = "//span[@title='Add tag']")
    public WebElement addTagIcon;

    @FindBy(xpath = "//input[@id='TAGS_blogPostForm67abSn']")
    public WebElement TagSpace;

    @FindBy(id = "post-tags-container-blogPostForm")
    public WebElement TagBox;










}
