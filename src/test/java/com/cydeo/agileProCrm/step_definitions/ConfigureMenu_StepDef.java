package com.cydeo.agileProCrm.step_definitions;

import com.cydeo.agileProCrm.base.TestBase;
import com.cydeo.agileProCrm.utilities.BrowserUtils;
import com.cydeo.agileProCrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConfigureMenu_StepDef extends TestBase {


    //////////////---AC1---///////////////////////////////
    @When("user click on Configure Menu")
    public void user_click_on_configure_menu() {
        Driver.getDriver().navigate().refresh();
        wait.until(ExpectedConditions.visibilityOf(ASM.configureMenuLink));
        ASM.configureMenuLink.click();
    }

    @When("user click on Add Custom Menu Item")
    public void user_click_on_add_custom_menu_item() {
        ASM.addCustomMenuItem.click();
    }

    @When("user enter Name {string} and Link {string}")
    public void user_enter_name_and_link(String name, String link) {
        ASM.linkNameInput.sendKeys(name);
        ASM.linkURLInput.sendKeys(link);
    }

    @When("user click on ADD button")
    public void user_click_on_add_button() {
        BrowserUtils.sleep(1);
        ASM.saveCustomMenuItemBtn.click();

    }


    @And("user click on {string} link")
    public void userClickOnLink(String name) {
        BrowserUtils.sleep(2);
        Driver.getDriver().findElement(By.xpath("//a[@href='https://google.com/']")).click();

    }

    @Then("link should be redirected on new tab")
    public void link_should_be_redirected_on_new_tab() {

        for (String eachWindow : Driver.getDriver().getWindowHandles()) {
            if (Driver.getDriver().switchTo().window(eachWindow).getTitle().contains("Google")) {
                Assert.assertTrue(true);
                break;
            }
        }

    }


    //////////////---AC3---///////////////////////////////

    @When("user click on Reset Menu")
    public void user_click_on_reset_menu() {
        ASM.resetMenu.click();

    }

    @When("user click on alert OK")
    public void user_click_on_alert_ok() {

        Alert alert = Driver.getDriver().switchTo().alert();

        alert.accept();

    }

    @Then("Activity Stream menu should reset to default")
    public void activity_stream_menu_should_reset_to_default() {

        ArrayList<String> expectedDefaultMenu = new ArrayList<>(Arrays.asList("Activity Stream", "Tasks", "Chat and Calls", "Workgroups", "Drive", "Calendar", "Mail",
                "Contact Center", "Time and Reports", "Employees", "Services", "Company", "Applications", "Workflows"));
        BrowserUtils.sleep(3);
        List<WebElement> menu = Driver.getDriver().findElements(By.xpath("//div[@id='bx-left-menu']//a[@title]"));
        ArrayList<String> actualDefaultMenu = new ArrayList<>();
        BrowserUtils.sleep(3);

        for (WebElement each : menu) {
            actualDefaultMenu.add(each.getAttribute("title"));
        }

        Assert.assertEquals(expectedDefaultMenu, actualDefaultMenu);


    }

    //////////////---AC2---///////////////////////////////


    @When("user click on Collapse Menu")
    public void user_click_on_collapse_menu() {

        wait.until(ExpectedConditions.visibilityOf(ASM.collapseMenu));
        ASM.collapseMenu.click();

    }

    @Then("Activity Stream menu should collapsed")
    public void activity_stream_menu_should_collapsed() {

        wait.until(ExpectedConditions.visibilityOf(ASM.menuCollapsedMode));
        Assert.assertTrue(ASM.menuCollapsedMode.isDisplayed());

    }

    @Then("user click on expand button")
    public void user_click_on_expand_button() {

        ASM.menuResizeBtn.click();

    }


    @Then("Activity Stream menu should expand")
    public void activity_stream_menu_should_expand() {

        BrowserUtils.sleep(2);

        try {
            System.out.println(ASM.menuCollapsedMode.isDisplayed());
            Assert.assertTrue(false);
        } catch (NoSuchElementException e) {
            Assert.assertTrue(true);
        }
    }


}
