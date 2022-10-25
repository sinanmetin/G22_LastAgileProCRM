package com.cydeo.agileProCrm.pages.quickMenu;

import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageQM {

    public MessageQM(){

        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(xpath = "//span[.='Message']/span")
    public WebElement message;

    @FindBy (xpath = "//body[@data-lt-tmp-id='lt-424614']")
    public WebElement textFld;

    @FindBy (id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesBtn;

    @FindBy (id = "bx-b-link-blogPostForm")
    public WebElement linkBtn;

    @FindBy (id = "bx-b-video-blogPostForm")
    public WebElement insertVideoBtn;

    @FindBy (id = "bx-b-quote-blogPostForm")
    public WebElement addQuoteBtn;

    @FindBy (id = "bx-b-mention-blogPostForm")
    public WebElement addMentionBtn;

    @FindBy (id = "bx-b-tag-input-blogPostForm")
    public WebElement addTagBtn;

    @FindBy (id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy (id = "blog-submit-button-cancel")
    public WebElement cancelBtn;

    @FindBy (id = "bx-destination-tag")
    public WebElement toAddMoreLink;

    @FindBy (xpath = "//span[@class='feed-add-post-del-but'][1]")
    public WebElement deleteReceiver;

    @FindBy (xpath = "//input[@class='diskuf-fileUploader wd-test-file-light-inp '][1]")
    public WebElement uploadFilesAndImagesField;

    @FindBy (id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkInputText;

    @FindBy (id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkInputLink;

    @FindBy (xpath = "//input[@value='Save']")
    public WebElement linkSaveBtn;

    @FindBy (xpath = "//input[@value='Cancel']")
    public WebElement linkCancel;

    @FindBy (xpath = "//span[@class='bx-core-adm-icon-close']")
    public WebElement linkClose;

    @FindBy (id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoInputText;

    @FindBy (xpath = "(//input[@value='Save'])[2]")
    public WebElement videoSaveBtn;

    @FindBy (xpath = "(//input[@value='Cancel'])[2]")
    public WebElement videoCancel;

    @FindBy (xpath = "(//span[@class='bx-core-adm-icon-close'])[2]")
    public WebElement videoClose;

    @FindBy (id = "destDepartmentTab_mention50026642")
    public WebElement addEmpAndDepart;

    @FindBy (xpath = "//div[.='HR']")
    public WebElement HRDepartment;

    @FindBy (xpath = "//div[.='Test Halil']")
    public WebElement testDepartment;

    @FindBy (xpath = "(//span[@class='feed-add-post-destination-text'])[1]")
    public WebElement messageReceiver1;







}
