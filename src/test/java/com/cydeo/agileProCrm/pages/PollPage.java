package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PollPage {


    public PollPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Poll']/span")
    public WebElement Poll;

    @FindBy(id="feed-post-more-1072")
    public WebElement MoreBtn;



    @FindBy(xpath = "//div[class='bx-vote-answer-list'and .='0']")
    public WebElement selectoption;

    @FindBy(xpath = "//a[href='javascript:void(0)' and @class='vote-new-question-link addq']")
    public WebElement AddQuestionBtn;


    @FindBy(id = "bx-destination-tag")
    public WebElement toAddMoreLink;


    @FindBy(xpath = "//div[@class='bx-finder-company-department-text' and .='HR']")
    public WebElement HRDepartment;

    @FindBy(xpath = "//a[@href='switchTab' and @class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement EmpandDeptOption;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;


    @FindBy(id = "bx-b-link-blogPostForm")
    public WebElement linkBtn;

    @FindBy(xpath = "//div[@class='vote-checkbox']")
    public WebElement checkbox;


    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMentionBtn;

    @FindBy(id = "feed-post-more-1042")
    public WebElement clickMoreBtn;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public WebElement clickDeleteBtn;
}









