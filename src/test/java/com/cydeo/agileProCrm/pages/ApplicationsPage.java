package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ApplicationsPage {

    public ApplicationsPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

//    @FindBy(xpath = "//div[@class='mp-item-title']/span")
//    public WebElement appName;

    @FindBy(xpath = "//a[.='Install']")
    public WebElement installBtn;

    @FindBy(id = "mp_install_confirm_popup")
    public WebElement confirmPopup;

    @FindBy(xpath = "//span[.='Send']")
    public WebElement sendButton;

    @FindBy(id = "popup-window-content-mp-detail-block")
    public WebElement popupWindow;

    public static void clickAndVerifyContentDetails(String typeName ){

        List<WebElement> allContentTypes = Driver.getDriver().findElements(By.xpath("//div[.='"+typeName+"']"));

        for (WebElement eachType : allContentTypes) {
            String eachName = eachType.getText();


            if (eachName.equals(typeName)){

                BrowserUtils.waitForClickablility(eachType,3);
                eachType.click();
                WebElement classValue = Driver.getDriver().findElement(By.xpath("//div[contains(@id,'mp-detail-content-wrapper')]"));
                Assert.assertTrue(classValue.isEnabled());
                break;
            }
        }
    }





}
