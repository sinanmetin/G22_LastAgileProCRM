package com.cydeo.agileProCrm.pages;

import com.cydeo.agileProCrm.step_definitions.Department_StepDef;
import com.cydeo.agileProCrm.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentPage {

    public DepartmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    Department_StepDef department_stepDef = new Department_StepDef();
    Faker faker = new Faker();
    String depName = faker.funnyName().name();



    @FindBy(xpath = "//a/span[contains(text(),'Employees')]")
    public WebElement employeesButton;

    @FindBy(linkText = "Add department")
    public WebElement addDepartment;

    @FindBy(id = "id=\"NAME\"")
    public WebElement departmentNameinput;

    @FindBy(id = "Add")
    public WebElement addButton;

    @FindBy(linkText = "Telephone Directory")
    public WebElement telDirButton;









}
