package ru.aqa.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.aqa.addressbook.model.GroupData;

import java.util.List;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreationTests() throws Exception {


    app.getNavigationHelper().goToGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();

    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();

    Assert.assertEquals(after.size(), before.size() +1);
  }
}

