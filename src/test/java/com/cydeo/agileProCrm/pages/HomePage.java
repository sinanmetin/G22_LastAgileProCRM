package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;

//mustafa
public class HomePage {

    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(id = "logo_24_text")
    public WebElement crmHomeLogo;

    @FindBy(id = "sitemap-menu")
    public WebElement siteMapMenu;

    @FindBy(css = "li#bx_left_menu_menu_tasks")
    public WebElement taskMenu;

    @FindBy(id = "user-block")
    public WebElement userBlock;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logout;

    @FindBy(css = "span#feed-add-post-form-link-text")
    public WebElement quickMenuMore;




    /**
     * This method click on Quick Menu Web Elements
     * with using Text Name
     * for hidden menu it clicks first more button than menu item
     * @param linkText
     * */
    public void quickMenuClick(String linkText) {
        String locator = "";
        if (linkText.equals("File") || linkText.equals("Appreciation") || linkText.equals("Announcement") || linkText.equals("Workflow")) {
            BrowserUtils.waitForClickablility(quickMenuMore, 10).click();
            locator = "//span[.='" + linkText + "']";
            BrowserUtils.waitForClickablility(By.xpath(locator), 10).click();
        } else if (linkText.equals("Message") || linkText.equals("Task") || linkText.equals("Event") || linkText.equals("Poll")) {
            locator = "//span[.='" + linkText + "']/span";
            BrowserUtils.waitForClickablility(By.xpath(locator), 10).click();
        } else {
            throw new NoSuchElementException("There is no such element in this menu");
        }

    }







   /* @FindBy (xpath = "")
    public WebElement ;

    @FindBy (xpath = "")
    public WebElement ;

    @FindBy (xpath = "")
    public WebElement ;

    @FindBy (xpath = "")
    public WebElement ;

    @FindBy (xpath = "")
    public WebElement ;

    @FindBy (xpath = "")
    public WebElement ; */


}
