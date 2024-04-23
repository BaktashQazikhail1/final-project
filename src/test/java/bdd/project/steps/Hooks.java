package bdd.project.steps;

import bdd.project.utility.SeleniumUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends SeleniumUtility {

@Before
public void setupTest(){
    openBrowser();
   }

@After
   public void cleanupTest(Scenario scenario){

    if (scenario.isFailed()) {
        byte[] picture = takeScreenshot();

        //Step 2) Attached Screenshot to Scenario
        scenario.attach(picture, "image/png", "failedScreenShot");

            }

        driverQuit();

        }
    }
