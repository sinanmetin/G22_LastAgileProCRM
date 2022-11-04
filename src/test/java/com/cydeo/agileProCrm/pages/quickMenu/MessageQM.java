package com.cydeo.agileProCrm.pages.quickMenu;

import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageQM {

    public MessageQM() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    /////////MESSAGE////////////////
    @FindBy(xpath = "//span[.='Message']/span")
    public WebElement message;

    @FindBy (xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement textEditorIframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement textFld;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelBtn;


    ////////UPLOAD FILES/////////
    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesBtn;

    @FindBy(xpath = "//input[@class='diskuf-fileUploader wd-test-file-light-inp '][1]")
    public WebElement uploadFilesAndImagesField;

    @FindBy(xpath = "(//span[@class='f-wrap'])[1]")
    public WebElement uploadedFile1;

    @FindBy(xpath = "(//span[@class='f-wrap'])[2]")
    public WebElement uploadedFile2;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement uploadedFileDellBtn;

    @FindBy(xpath = "//span[@class='feed-add-post-loading']")
    public WebElement loadingBar;

    @FindBy(xpath = "(//a[.='My Drive / Uploaded files'])[2]")
    public WebElement myDriveLink;

    ///////////LINK///////////////
    @FindBy(id = "bx-b-link-blogPostForm")
    public WebElement linkBtn;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkInputText;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkInputLink;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement linkSaveBtn;

    @FindBy(xpath = "//input[@value='Cancel']")
    public WebElement linkCancel;

    @FindBy(xpath = "//span[@class='bx-core-adm-icon-close']")
    public WebElement linkClose;


    ////////////VIDEO///////////////
    @FindBy(id = "bx-b-video-blogPostForm")
    public WebElement insertVideoBtn;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoInputText;

    @FindBy(xpath = "(//input[@value='Save'])[2]")
    public WebElement videoSaveBtn;

    @FindBy(xpath = "(//input[@value='Cancel'])[2]")
    public WebElement videoCancel;

    @FindBy(xpath = "(//span[@class='bx-core-adm-icon-close'])[2]")
    public WebElement videoClose;


    /////////////Quote////////////////
    @FindBy(id = "bx-b-quote-blogPostForm")
    public WebElement addQuoteBtn;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteEntryFld;

    /////////ADD MENTION//////////////
    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMentionBtn;


    /////////ADD TAG////////////////
    @FindBy(id = "bx-b-tag-input-blogPostForm")
    public WebElement addTagBtn;


    //////////RECEIVER/////////////
    @FindBy(id = "bx-destination-tag")
    public WebElement toAddMoreLink;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but'][1]")
    public WebElement deleteReceiver;

    @FindBy(xpath = "//a[contains(@id,'destDepartmentTab_destination')]")
    public WebElement empAndDeptList;

    @FindBy(xpath = "//a[@href='#U590' and @class='bx-finder-company-department-employee  bx-finder-element']")
    public WebElement helpDesk100;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-text' and .='HR']")
    public WebElement HRDepartment;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-check-text' and contains(@rel,'HR')]")
    public WebElement selectAllDeptAndSubDept;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement empAndDeptListCloseBtn;

    @FindBy(xpath = "//div[.='Test Halil']")
    public WebElement testDepartment;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[1]")
    public WebElement messageReceiver1;

    //////////////SENT MESSAGES CHECK///////////////////

    @FindBy(xpath = "(//div[@class='feed-item-wrap'])[1]//a[@class='feed-post-user-name']")
    public WebElement messageSender;

    @FindBy(xpath = "(//div[@class='feed-item-wrap'])[1]//a[@bx-tooltip-user-id='590']")
    public WebElement receiverEmployee;

    @FindBy(xpath = "((//div[@class='feed-item-wrap'])[1]//a[@class='feed-add-post-destination-new'])[2]")
    public WebElement receiverDepartment;

    @FindBy(xpath = "(//div[@class='feed-item-wrap'])[1]//a[@class='feed-com-file-name']")
    public WebElement attachedData1OfLastSentMessage;

    @FindBy(xpath = "(//div[@class='feed-item-wrap'])[1]//img[@alt]")
    public WebElement attachedImgDataOfLastSentMessage;

    @FindBy(xpath = "(//div[@class='feed-item-wrap'])[1]//div[@class='feed-post-text-block-inner-inner']")
    public WebElement textOfLastSentMessage;

    @FindBy(xpath = "//table[@class='blogquote' ]//td")
    public WebElement quoteOfLastSentMessage;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement emptyMsgErrTxt;






}
