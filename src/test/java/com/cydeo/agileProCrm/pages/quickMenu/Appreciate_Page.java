package com.cydeo.agileProCrm.pages.quickMenu;

import com.cydeo.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Appreciate_Page {

    public Appreciate_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesBtn;

    @FindBy(name = "bxu_files[]")
    public WebElement uploadFilesAndImagesBtn;

    @FindBy(xpath = "(//span[@class='f-wrap'])[1]")
    public WebElement uploadedFile1;

    @FindBy(xpath = "(//span[@class='f-wrap'])[2]")
    public WebElement uploadedFile2;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(xpath = "//span[@class='insert-btn-text']")
    public WebElement insertInText1;

    @FindBy(xpath = "(//span[@class='insert-btn-text'])[2]")
    public WebElement insertInText2;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement imageUploadedConfirm;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement ifram;

    @FindBy(xpath = "(//span[@class='insert-btn-text'])[2]")
    public WebElement insertIext2;

    @FindBy(xpath = "(//span[@class='insert-btn-text'])[2]")
    public WebElement insext2;

    @FindBy(xpath = "(//span[@class='insert-btn-text'])[2]")
    public WebElement iText2;

    @FindBy(xpath = "(//span[@class='insert-btn-text'])[2]")
    public WebElement insertInTt2;





}
