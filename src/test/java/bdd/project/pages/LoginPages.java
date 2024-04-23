package bdd.project.pages;

import org.openqa.selenium.By;

public class LoginPages {
    public final static By App_Title_Section = By.xpath("/html/body/div[1]/div/div[1]/div/h2");
    public final static By LOGIN_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/div/a[2]");
    public final static By userName = By.name("username");
    public final static By password = By.id("password");
    public final static By LOGIN_BUTTON_2 = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]");

    public final static By Portal_Title_Section = By.xpath("/html/body/div[1]/div/div[1]/div/h2");

    public final static By errorWrongUser = By.xpath("//div/div/div/div/div/div/div/div/div");
}


