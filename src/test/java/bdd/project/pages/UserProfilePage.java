package bdd.project.pages;

import org.openqa.selenium.By;

public class UserProfilePage {

   public final static By profileButton = By.xpath("/html/body/div[1]/div/div[1]/div/button");
  public final static By userStatus = By.xpath("//div[3]/div[3]/div/div/div/div/div/div[1]/p[1]");

  public final static By userType = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[2]/p[1]");

  public final static By Name = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[3]/p[1]");

  public final static By profileUserName = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[4]/p[1]");

  public final static By authorities = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[5]/p");

  public final static By profileLogoutButton = By.xpath("/html/body/div[3]/div[3]/div/div/footer/div/button[1]");

  public final static By colorModeButton = By.xpath("/html/body/div[3]/div[3]/div/div/footer/div/button[2]");

  public final static By logoutFromProfile = By.xpath("/html/body/div[3]/div[3]/div/div/footer/div/button[1]");
}
