package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamMenu {

    public ActivityStreamMenu(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@title='Activity Stream']")
    public WebElement activityStream;


    ///////////////--CONFIGURE MENU--/////////////////////////////

    @FindBy (id = "left-menu-settings")
    public WebElement configureMenuLink;

    @FindBy (xpath = "(//span[.='Collapse menu'])[2]")
    public WebElement collapseMenu;

    @FindBy (xpath = "//table[contains(@class,'menu-collapsed-mode')]")
    public WebElement menuCollapsedMode;

    @FindBy(css = "span.menu-resize-btn")
    public WebElement menuResizeBtn;



    /////--Custom Menu Item
    @FindBy (xpath = "(//span[.='Add custom menu item'])[2]")
    public WebElement addCustomMenuItem;

    @FindBy (name = "menuPageToFavoriteName")
    public WebElement linkNameInput;

    @FindBy (name = "menuPageToFavoriteLink")
    public WebElement linkURLInput;

    @FindBy (xpath = "//span[@class='popup-window-button popup-window-button-create']")
    public WebElement saveCustomMenuItemBtn;

    @FindBy (xpath = "//span[@class='popup-window-button popup-window-button-link popup-window-button-link-cancel']")
    public WebElement cancelCustomMenuItemBtn;

    @FindBy (xpath = "(//span[@class='popup-window-close-icon popup-window-titlebar-close-icon'])[2]")
    public WebElement addCustomMenuItemCloseBtn;




    @FindBy (id = "menuOpenInNewPage")
    public WebElement menuOpenInNewPageCheckBox;

    @FindBy (xpath = "(//span[.='Reset menu'])[2]")
    public WebElement resetMenu;

    public WebElement activityStreamMenuLocator(String linkText){

        String locator="//a[@title='"+linkText+"']";
       return Driver.getDriver().findElement(By.xpath(locator));

       ///
    }












}
