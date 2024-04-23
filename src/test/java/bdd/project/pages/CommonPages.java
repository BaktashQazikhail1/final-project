package bdd.project.pages;

import org.openqa.selenium.By;
public class CommonPages {
    public final static By pageTitle = By.xpath("//div[1]/div/div[2]/div/div/a");


    public static By getLinkLocator (String linkText){
        return By.partialLinkText(linkText);

    }
}

