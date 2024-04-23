package bdd.project.steps;

import bdd.project.pages.CommonPages;
import bdd.project.pages.CreateAccountPages;
import bdd.project.utility.SeleniumUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateAccountSteps extends SeleniumUtility {

    @When("click on Create Primary Account")
    public void clickOnCreatePrimaryAccount() throws InterruptedException {
        clickOnElement(CreateAccountPages.createPrimaryAccountTitle);
        Thread.sleep(2000);
    }

    @Then("Validate form title is {string}")
    public void validateFormTitleCreatePrimaryAccountHolder(String expectedFormTitle) {
        String actualFormPageTitle = getElementText(CreateAccountPages.formPageTitle);
        Assert.assertEquals("Validate form title is Create Primary Account Holder",
                expectedFormTitle,
                actualFormPageTitle);
    }

    @When("Enter Email Address {string}")
    public void enter_email_address(String email) {
        enterValue(CreateAccountPages.EMAIL_ADDRESS, email);

    }

    @Then("Select Title {string}")
    public void select_title(String title) {
        enterValue(CreateAccountPages.SELECT_TITLE, title);
    }

    @When("Enter First Name {string}")
    public void enter_first_name(String firstName) {
        enterValue(CreateAccountPages.FIRSTNAME, firstName);

    }

    @When("Enter Last Name {string}")
    public void enter_last_name(String lastName) {
        enterValue(CreateAccountPages.LASTNAME, lastName);

    }

    @Then("Select Gender {string}")
    public void select_gender(String gender) {
        enterValue(CreateAccountPages.GENDER, gender);

    }

    @Then("Select Marital Status {string}")
    public void select_martial_status(String maritalStatus) {
        enterValue(CreateAccountPages.MARITALSTATUS, maritalStatus);

    }

    @When("Enter Employment Status {string}")
    public void enter_employment_status(String employmentStatus) {
        enterValue(CreateAccountPages.EMPLOYMENTSTATUS, employmentStatus);

    }

    @Then("Select Date Of Birth {string}")
    public void select_date_of_birth(String dateOfBirth) {
        enterValue(CreateAccountPages.DATEOFBIRTH, dateOfBirth);

    }

    //  @When("Click on Create Account")
    //  public void click_on_create_account() {

    @And("Click on Create Account button")
    public void clickOnCreateAccountButton() throws InterruptedException {
        clickOnElement(CreateAccountPages.CREATE_ACCOUNT_BUTTON);
        Thread.sleep(4000);

    }

    @Then("validate email address is {string}")
    public void validate_email_address_is(String expectedEmailAddress) {
        String actualEmailAddress = getElementText(CreateAccountPages.emailAddress);
        Assert.assertEquals("Validate Email Address", expectedEmailAddress,
                actualEmailAddress);
    }

    @Then("Validate to sign up page title is {string}")
    public void validate_to_sign_up_page_title_is(String expectedPageTitle) {
        String actualPageTitle = getElementText(CreateAccountPages.SIGNUP_YOUR_ACCOUNT);
        Assert.assertEquals("Validate Sign Up Title",
                expectedPageTitle,
                actualPageTitle);
    }

    @Then("Validate error Message {string}")
    public void validate(String expectErrorMessage) {
        String actualErrorMessage = getElementText(CreateAccountPages.ERROR_MESSAGE);
        Assert.assertEquals("Validate error Message",
                expectErrorMessage,
                actualErrorMessage);
    }

}
