package bdd.project.utility;

import bdd.project.base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Statement;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class SeleniumUtility extends BaseSetup {

    static String today;
    static String tomorrow;

    private WebDriverWait getWait() {

        return new WebDriverWait(getDriver(), Duration.ofMinutes(1));
    }

    private WebElement waitUntilVisibilityOfElement(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    private WebElement waitUntilWebElementClickable(By locator) {
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));

    }

    private List<WebElement> waitUntilVisibilityOfAllElement(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public String getElementText(By locator) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        return element.getText();
    }

    public void enterValue(By locator, String text) {
        WebElement element = waitUntilVisibilityOfElement(locator);
        element.sendKeys(text);

    }

    public void clickOnElement(By locator) {
        waitUntilWebElementClickable(locator).click();
    }

    public List<WebElement> getListOfElements(By locator) {

        return waitUntilVisibilityOfAllElement(locator);
    }
    public byte [] takeScreenshot(){

        // Attached Screenshot the failure
        // Step1) Take Screenshot with selenium
        TakesScreenshot screenshot = (TakesScreenshot) getDriver();
        //for cucumber reports Output Type should Byte[]
        return screenshot.getScreenshotAs(OutputType.BYTES);
}


    public static String currentDate(By locator){
        LocalDate today1 = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd, yyyy");
        today = today1.format(formatter).trim();
        return today;
      }
      public static String tomorrowDate(By locator){
          LocalDate today1 = LocalDate.now();
          LocalDate tomorrow1 = today1.plusDays(1);
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
          tomorrow = tomorrow1.format(formatter).trim();
          return tomorrow;
      }

      public void selectFromDropDown(By locator, String option){

        List<WebElement> itemPerPageOptions = getListOfElements(locator);
        for (WebElement element : itemPerPageOptions) {
         String text = element.getText();
         if(text.contains(option)){
             element.click();


                }
            }
      }
}