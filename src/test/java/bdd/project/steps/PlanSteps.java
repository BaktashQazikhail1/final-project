package bdd.project.steps;

import bdd.project.pages.PlanPages;
import bdd.project.utility.SeleniumUtility;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class PlanSteps extends SeleniumUtility {

    @Then("click on Plans")
    public void clickOnPlan() throws InterruptedException {
        clickOnElement(PlanPages.planSection);

        Thread.sleep(3000);
    }

    @Then("validate {int} row of data is present")
    public void validateRowOfDataPresent(int expectedRows) throws InterruptedException {
        int actualRowsSize = getListOfElements(PlanPages.planRows).size();
        Assert.assertEquals("validate Table Rows",
                expectedRows,
                actualRowsSize);
        Thread.sleep(2000);

    }

    @Then("validate Create Date is todays date in EST Time zone")
    public void validateCreateDateIsTodayIsDateEastTimeZone() {

        currentDate(PlanPages.createdDate);

      }

    @Then("validate Date Expire is a day after EST Time Zone")
      public void validateDateExpireIsDayAfterEastTimezone() {
        tomorrowDate(PlanPages.dayExpiry);

      }
   }


