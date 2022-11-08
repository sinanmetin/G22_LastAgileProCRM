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
}
