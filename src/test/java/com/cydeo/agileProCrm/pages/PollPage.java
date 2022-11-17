package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.Driver;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class PollPage {


    public PollPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Poll' ]/span")
    public WebElement Poll;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement toAddMoreLink;

    @FindBy(id = "destDepartmentTab_destination6268285")
    public WebElement hr101;

    @FindBy(xpath = "//a[@href='switchTab' and @class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement EmpandDeptOption;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public static WebElement toAddLink;


    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(id = "bx-b-link-blogPostForm")
    public WebElement linkBtn;

    @FindBy(id = "multi_0")
    public WebElement AllMultChoBox;

    @FindBy(xpath = "//a[@href='javascript:void(0)' and @class= 'vote-new-question-link addq' ]")
    public WebElement AddQuestionBtn;

    @FindBy(id= "bx-b-quote-blogPostForm")
    public WebElement clickmention;

}








