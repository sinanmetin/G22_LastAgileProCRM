package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyPage {

    public CompanyPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[.='Add News']")
    public WebElement addNewsBtn;

    @FindBy(xpath = "//span[.='Preview text']")
    public WebElement previewText;

    @FindBy(name = "PROP[3][]")
    public WebElement typeDropdown;

    @FindBy(className = "adm-calendar-icon")
    public WebElement calendarIcon;

    @FindBy(className = "bx-calendar-top-year")
    public WebElement yearDropdown;

    @FindBy(className = "bx-calendar-top-month")
    public WebElement monthDropdown;

    @FindBy(xpath = "//span[.='Select']")
    public WebElement selectButton;

    @FindBy(xpath = "//input[@name='ACTIVE_FROM']")
    public WebElement dateField;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement detailsMenu;
    @FindBy(id = "bx_file_detail_picture_input")
    public WebElement pictureInput;

    @FindBy(xpath = "//span[@class='adm-fileinput-item-panel-btn adm-btn-del']")
    public WebElement removeBtn;

    @FindBy(xpath = "//div[@class='adm-fileinput-item-preview']")
    public WebElement addedPicture;

    @FindBy(xpath = "//span[contains(., ' Drag an image')]")
    public WebElement blankPictureField;

    @FindBy(xpath = "//span[@class='adm-fileinput-item-panel-btn adm-btn-setting']")
    public WebElement editIcon;

    @FindBy(id = "popupFM")
    public WebElement editWindow;

    @FindBy(name = "TAGS")
    public WebElement tagsField;

    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        //Loop through the List of WebElement and select matching result "hockey"
        for (WebElement each : radioButtons) {
            String eachId = each.getAttribute("id");

            if (eachId.equals(idValue)){

                each.click();
                Assert.assertTrue(each.isSelected());
                break;
            }
        }

    }

    @FindBy(xpath = "//input[@name='NAME']")
    public WebElement titleField;

    @FindBy(id = "savebtn")
    public WebElement saveBtn;




}
