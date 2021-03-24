package ru.aqa.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.aqa.addressbook.model.ContactData;
import ru.aqa.addressbook.model.GroupData;

public class ContactDeletionTests extends TestBase{

  @Test
  public void testContactDeletion() throws Exception {
    app.getNavigationHelper().goToHomepage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Anna", "Ivanova", "+79215555555", "SPB", "test1"), true);
    }

    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();

  }
}
