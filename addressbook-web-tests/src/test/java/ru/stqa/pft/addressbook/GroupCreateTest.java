package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreateTest extends TestBase {

  @Test
  public void testGroupCreate() throws Exception {
    gotGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test", "test2", "test3"));
    gotGroupPage();
  }

}
