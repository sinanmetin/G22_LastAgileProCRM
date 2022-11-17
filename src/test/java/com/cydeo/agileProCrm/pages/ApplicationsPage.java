package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationsPage {

    public ApplicationsPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='ui-btn ui-btn-xs ui-btn-light-border ui-btn-round']")
    public WebElement viewBtn;

    @FindBy(xpath = "//a[@href='javascript:void(0)']")
    public WebElement installBtn;

    @FindBy(id = "mp_install_confirm_popup")
    public WebElement confirmPopup;

    @FindBy(xpath = "//span[.='Send']")
    public WebElement sendButton;

    @FindBy(id = "popup-window-content-mp-detail-block")
    public WebElement popupWindow;





}
