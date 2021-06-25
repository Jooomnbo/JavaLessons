package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeleteTest extends TestBase {



  @Test
  public void testGroupDelete() throws Exception {
    app.getNavigationHelper().gotGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupDeletion();
    app.getNavigationHelper().gotGroupPage();
  }


}
