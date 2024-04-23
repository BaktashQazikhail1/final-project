package bdd.project.pages;

import org.openqa.selenium.By;

public class CreateAccountPages {
    public final static By createPrimaryAccountTitle = By.xpath("/html/body/div[1]/div/div[2]/div/div/a");
    public final static By formPageTitle = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/h2");
    public final static By EMAIL_ADDRESS = By.id("email");
    public final static By SELECT_TITLE = By.name("title");
    public final static By FIRSTNAME = By.name("firstName");
    public final static By LASTNAME = By.name("lastName");
    public final static By GENDER = By.id("gender");
    public final static By MARITALSTATUS = By.id("maritalStatus");
    public final static By EMPLOYMENTSTATUS = By.name("employmentStatus");
    public final static By DATEOFBIRTH = By.id("dateOfBirth");
    public final static By CREATE_ACCOUNT_BUTTON = By.xpath("//div[1]/div/div[2]/div/div/div/form/div/div[2]/button");
    public final static By SIGNUP_YOUR_ACCOUNT = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/h2[1]");
    public final static By emailAddress = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/h2[3]");
    public final static By ERROR_MESSAGE = By.xpath("//div[1]/div/div[2]/div/div/div/form/div[1]");


}
