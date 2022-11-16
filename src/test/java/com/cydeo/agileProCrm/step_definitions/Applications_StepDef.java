package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Applications_StepDef {

    @Then("user land on the All applications page")
    public void userLandOnTheAllApplicationsPage() {
        String expectedTitle = "All applications";
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }
}
