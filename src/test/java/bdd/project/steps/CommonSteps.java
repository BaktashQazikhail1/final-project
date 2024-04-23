package bdd.project.steps;

import bdd.project.pages.CommonPages;
import bdd.project.pages.CreateAccountPages;
import bdd.project.pages.LoginPages;
import bdd.project.utility.SeleniumUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.TreeMap;

public class CommonSteps extends SeleniumUtility {

    @Given("Open browser and navigate")
    public void openBrowserAndNavigate() {
        openBrowser();
    }

    @Then("Validate application title should be {string}")
    public void validateApplicationTitle(String expectedAppTitle) {

        //To validate we can use Junit Assert Method
        String actualAppTitle = getDriver().getTitle();
        Assert.assertEquals("Application Page Title Validation",
                expectedAppTitle,
                actualAppTitle);
    }

    @Then("Close browser")
    public void closeBrowser() {

        driverQuit();
    }

    @Then("Validate the create account button is {string}")
    public void validateCreateAccountButton(String expectedPageTitle) {
        String actualPageTitle = getElementText(CommonPages.pageTitle);
        //We created getElementText Method in Selenium and then apply it here

        Assert.assertEquals("validate Create Account Page Title",
                expectedPageTitle,
                actualPageTitle);
          }

    @When("wait {int} Seconds")
    public void wait_seconds(Integer seconds) {

     try {
         Thread.sleep(seconds * 1000);

     } catch (InterruptedException e) {

         Assert.fail("Interrupted Exception happened on wait time");
            }
        }
    }