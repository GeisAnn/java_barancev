package ru.aqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{


  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  public void goToGroupPage() {
if (isElementPresent(By.tagName("h1"))
        &&driver.findElement(By.tagName("h1")).getText().equals("Groups")
        &&isElementPresent(By.name("new"))){
return;
}
  click(By.linkText("groups"));
}


  public void goToHomepage() {
    if (isElementPresent(By.id("maintable"))) {
      return;
    }
    click(By.linkText("home"));
  }
}
