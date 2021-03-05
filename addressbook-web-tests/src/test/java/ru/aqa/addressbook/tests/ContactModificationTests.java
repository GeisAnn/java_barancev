package ru.aqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.aqa.addressbook.model.ContactData;
import ru.aqa.addressbook.model.GroupData;

public class ContactModificationTests extends TestBase  {
  @Test
  public void testContactModification() {

    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("555", "666", "+79215555666", "MSC"));
    app.getContactHelper().submitContactModification();


  }
}
