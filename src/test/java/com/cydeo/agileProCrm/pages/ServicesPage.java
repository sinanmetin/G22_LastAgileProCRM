package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage {
    public ServicesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[11]")
    public WebElement serviceBtn;

    @FindBy(xpath = "//*[@id=\"workarea-content\"]/div/p[3]/a")
    public WebElement meetingBtn;

    @FindBy(xpath = "//a[@class='bx-reserve-meeting-link']")
    public WebElement bookRoomBtn;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement newEvent;

    @FindBy(xpath = "(//img[@class='bxec-iconkit'])[4]")
    public WebElement unchecktBtn;

    @FindBy(xpath = "//span[.='Ideas']")
    public WebElement ideaBtn;

    @FindBy(xpath = "//span[.='New idea']")
    public WebElement newIdeaBtn;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement title;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement bodyText;

    @FindBy(xpath = "//select[@name='UF_CATEGORY_CODE']")
    public WebElement dropDown;

    @FindBy(xpath = "//span[@class='t']")
    public WebElement suggestBtn;

    @FindBy(xpath = "//a[@title='MY_TEST_IDEA']")
    public WebElement titleIdea;


    @FindBy(xpath = "(//a[@title='Unlike'])[1]")
    public WebElement unlikeBox;



   @FindBy(xpath = "(//a[@title='Like'])[1]")
    public WebElement likeButton;

   @FindBy(xpath = "(//span[.='Themes'])[1]")
    public WebElement themesBtn;

   @FindBy(xpath = "(//div[@class='theme-dialog-item'])[1]")
    public WebElement photoBtn;

   @FindBy(xpath = "//span[.='Print']")
    public WebElement printBtn;
}
