package bdd.project.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {
    //Encapsulation
    private static WebDriver driver;

    // The driver to be static because it should be shared
   /// private final String APP_URL = "https://dev.insurance.tekschool-students.com/";
   // private final String BROWSER_TYPE = "edge";

    public void openBrowser (){

        // Steps To read a property file

        //Step 1) the absolute file path to the property file.
        String configFilePath = System.getProperty("user.dir") + "/src/test/resources/config/qa_env_config.properties";


        // Steps 2) Create Object from Properties Class in java library
        Properties properties = new Properties();


        //Step 3) Load config file to properties object.
        //we need FileInputStream file Java

        try {

            FileInputStream configFile = new FileInputStream(configFilePath);
            properties.load(configFile);

        }catch (IOException e) {
            e.printStackTrace();

        }

        //Step 4) read a value from property file using the property key
        String baseUrl = properties.getProperty("ui.url");
        String browserType = properties.getProperty("ui.browser.type");


        if (browserType.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }else if (browserType .equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else if (browserType .equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }else {
            throw new RuntimeException("Wrong Browser Type");
        }

        //Targeting Chrome Browser
        //Creating instance of Browser and Navigate to Tek insurance app
        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(baseUrl);
    }

    public void driverQuit(){
        if (driver !=null)
            driver.close();
    }
//Read only Getter fot read Driver instance
    // Java Encapsulation Concept
    public WebDriver getDriver () {
        return driver;
    }
}

