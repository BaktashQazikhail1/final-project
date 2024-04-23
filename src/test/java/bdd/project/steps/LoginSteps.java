package bdd.project.steps;

import bdd.project.pages.CommonPages;
import bdd.project.pages.CreateAccountPages;
import bdd.project.pages.LoginPages;
import bdd.project.utility.SeleniumUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.bidi.log.Log;

public class LoginSteps extends SeleniumUtility {

    @Then("clicking on Login button")
    public void clickingOnLoginButton() {

        clickOnElement(LoginPages.LOGIN_BUTTON);
    }
    @When("enter username as {string}")
    public void enterUserName(String userName) {
       enterValue(LoginPages.userName, userName);
    }
    @When("enter password as {string}")
    public void enterPassword(String password) {
        enterValue(LoginPages.password, password);
      }
    @Then("click on login button")
    public void click_On_Login_Button() throws InterruptedException {
        clickOnElement(LoginPages.LOGIN_BUTTON_2);
        Thread.sleep(3000);

      }

    @Then("validate App Title is {string}")
    public void validateAppTitle(String expectedAppTitle) {
        String actualAppTitle = getElementText(LoginPages.App_Title_Section);
        Assert.assertEquals("Validate Application Title",
                expectedAppTitle, actualAppTitle);
        }

   @Then("validate the Customer Section Title is {string}")
    public void validateLoginSection (String expectedLoginTitle) {
        String actualLoginTitle = getElementText(LoginPages.Portal_Title_Section);
        Assert.assertEquals("Validate Customer Service Portal",
                expectedLoginTitle,
               expectedLoginTitle);
      }
    @Then("validate error message {string}")
    public void validate_error_message(String expectedErrorMessage)   {
        String actualErrorMessage = getElementText(LoginPages.errorWrongUser);
        Assert.assertEquals("Validate Wrong User Name Error Message",
                expectedErrorMessage,
                actualErrorMessage);

         }
    }
