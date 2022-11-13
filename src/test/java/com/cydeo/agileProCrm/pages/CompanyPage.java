package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(id = "bx_file_detail_picture_add")
    public WebElement addFileBtn;

    @FindBy(xpath = "//span[.='Insert file path']/.")
    public WebElement insertFilePathBtn;

    @FindBy(xpath = "//span[.='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//span[@class='adm-fileinput-item-panel-btn adm-btn-del']")
    public WebElement removeBtn;

    //    @FindBy(className = "adm-fileinput-area-input")
//    public WebElement uploadFileBtn;

    @FindBy(xpath = "//div[@class='adm-fileinput-item-preview']")
    public WebElement addedPicture;

    @FindBy(xpath = "//span[contains(., ' Drag an image')]")
    public WebElement blankPictureField;

    @FindBy(id = "bx_file_detail_picturefilePath_0_path")
    public WebElement linkField;

    @FindBy(xpath = "//span[@class='adm-fileinput-item-panel-btn adm-btn-setting']")
    public WebElement editIcon;

    @FindBy(id = "popupFM")
    public WebElement editWindow;






}
