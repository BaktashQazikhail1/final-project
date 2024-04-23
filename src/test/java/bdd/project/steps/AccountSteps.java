package bdd.project.steps;

import bdd.project.pages.AccountPages;
import bdd.project.pages.CommonPages;
import bdd.project.utility.SeleniumUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSteps extends SeleniumUtility {


    @Then("click on {string} link")
    public void click_on_link(String linkText) {
        By linkLocator = By.partialLinkText(linkText);
        By locator = CommonPages.getLinkLocator(linkText);
        clickOnElement(locator);

    }

    @Then("validate accounts table have {int} rows")
    public void validate_accounts_table_have_rows(int expectedRows) {
        List<WebElement> tableRowsElement = getListOfElements(AccountPages.tableRows);
        Assert.assertEquals("Validate Table rows",
                expectedRows,
                tableRowsElement.size());
    }

    @When("change item per page to {string}")
    public void change_item_per_page_to(String itemPerPage) {
        clickOnElement(AccountPages.ITEM_PER_PAGE_SELECT);
        selectFromDropDown(AccountPages.ITEM_PER_PAGE_OPTION, itemPerPage);
    }

}


