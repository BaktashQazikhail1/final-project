package bdd.project.steps;

import bdd.project.pages.UserProfilePage;
import bdd.project.utility.SeleniumUtility;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class UserProfileSteps extends SeleniumUtility {

    @Then("click on profile button")
    public void clickOnProfileButton() throws InterruptedException {
        clickOnElement(UserProfilePage.profileButton);
        Thread.sleep(3000);
    }

    @Then("validate user Active {string}")
    public void validate_status_is(String expectedStatus) {
   String actualStatus = getElementText(UserProfilePage.userStatus);
        Assert.assertEquals("Validate User Status",
                expectedStatus,
                actualStatus);
    }

    @Then("validate CSR as a {string}")
    public void validateUserType(String expectedUserType) {
String actualUserType = getElementText(UserProfilePage.userType);
Assert.assertEquals("Validate User Type",
        expectedUserType,
        actualUserType);

    }

    @Then("validate Supervisor as a {string}")
    public void validateName(String expectedName) {
        String actualUserName = getElementText(UserProfilePage.Name);
        Assert.assertEquals("Validate User Name", expectedName, actualUserName);

    }

    @Then("validate supervisor as a {string}")
    public void validateUsername(String expectedUser) {
        String actualUser = getElementText(UserProfilePage.profileUserName);
        Assert.assertEquals("Validate User Name", expectedUser, actualUser);

    }

    @Then("validate admin as an {string}")
    public void validateAuthorities(String expectedAuthorities) {
        String actualAuthorities = getElementText(UserProfilePage.authorities);
        Assert.assertEquals("Validate User Name",
                expectedAuthorities,
                actualAuthorities);
    }

    @Then("validate Logout as a {string}")
    public void validateLogoutButton(String expectedLogoutButton) {
        String actualLogoutButton = getElementText(UserProfilePage.profileLogoutButton);
        Assert.assertEquals("Validate Profile Logout Button",
                expectedLogoutButton,
                actualLogoutButton);
    }

    @Then("click on color mode")
    public void clickOnColorMode() {
        clickOnElement(UserProfilePage.colorModeButton);
    }

    @Then("click on Logout Button")
    public void clickOnLogoutButton(){
        clickOnElement(UserProfilePage.logoutFromProfile);
    }
}
