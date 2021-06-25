package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class NewContactTest extends TestBase{

  @Test
  public void testNewContact() throws Exception {
    app.getContactHelper().addNewContact();
    app.getContactHelper().fillContactForm(new ContactData("First name", "Middle name", "Last Name", "address", "E-mail"));
    app.getContactHelper().clickEnterButton();
    app.getNavigationHelper().gotHomePage();
  }


}


