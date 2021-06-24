package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreateTest extends TestBase {

  @Test
  public void testGroupCreate() throws Exception {
    app.gotGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test", "test2", "test3"));
    app.gotGroupPage();
  }

}
