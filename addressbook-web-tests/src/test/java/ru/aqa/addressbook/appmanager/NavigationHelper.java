package ru.aqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{


  public NavigationHelper(FirefoxDriver driver) {
    super(driver);
  }

  public void goToGroupPage() {

    click(By.linkText("groups"));
  }
}
