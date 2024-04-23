package bdd.project.pages;

import org.openqa.selenium.By;

public class PlanPages {

    public final static By planSection = By.xpath("/html/body/div[1]/div/div[2]/div/div/a[2]/span");
    public final static By planRows = By.xpath("//table/tbody/tr");

    public final static By createdDate = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/thead/tr/th[4]");

    public final static By dayExpiry = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/thead/tr/th[5]");
}
