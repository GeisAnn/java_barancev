package ru.aqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.aqa.addressbook.model.ContactData;
import ru.aqa.addressbook.model.GroupData;

public class ContactModificationTests extends TestBase  {
  @Test
  public void testContactModification() {
    app.getNavigationHelper().goToHomepage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Anna", "Ivanova", "+79215555555", "SPB", "test1"), true);
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("555", "666", "+79215555666", "MSC", null), false);
    app.getContactHelper().submitContactModification();

  }
}
