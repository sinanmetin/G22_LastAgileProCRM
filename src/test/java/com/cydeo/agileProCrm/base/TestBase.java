package com.cydeo.agileProCrm.base;

import com.cydeo.agileProCrm.pages.*;
import com.cydeo.agileProCrm.pages.quickMenu.MessageQM;
import com.cydeo.agileProCrm.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;

public abstract class TestBase {



    public WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    public Faker faker = new Faker();

    public Actions actions = new Actions(Driver.getDriver());

    public MessageQM message = new MessageQM();
    public ActivityStreamMenu ASM = new ActivityStreamMenu();

    public ServicesPage servicesPage = new ServicesPage();

    public ApplicationsPage applicationsPage = new ApplicationsPage();

    public PollPage pollPage = new PollPage();


    public HomePage homePage = new HomePage();
    public LoginPage loginPage = new LoginPage();
    public TaskPage task = new TaskPage();


}
