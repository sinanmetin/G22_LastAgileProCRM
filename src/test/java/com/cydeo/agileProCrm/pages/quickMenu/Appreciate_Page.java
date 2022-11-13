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

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement ifram;

    @FindBy(xpath = "//img[@style='max-width:400px;max-height:400px;']")
    public WebElement File1Confirm;

    @FindBy(xpath = "//span[contains(@style,'color: #2067B0; border-bottom:')]")
    public WebElement File2Confirm;

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









}
