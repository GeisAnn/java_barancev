package ru.aqa.addressbook.tests;

import org.testng.annotations.*;
import ru.aqa.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreationTests() throws Exception {

    app.getNavigationHelper().goToHomepage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Anna", "Ivanova", "+79215555555", "SPB", "test1"), true);
    app.getContactHelper().submitContactCreation();

  }
}
 
 

