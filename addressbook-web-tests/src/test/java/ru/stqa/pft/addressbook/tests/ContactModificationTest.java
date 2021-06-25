package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase{

    @Test
    public void testContactModification(){
        app.getNavigationHelper().gotHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("First name", "Middle name", "Last Name", "address", "E-mail"));
        app.getContactHelper().clickEnterButton();
        app.getNavigationHelper().gotHomePage();
    }
}
