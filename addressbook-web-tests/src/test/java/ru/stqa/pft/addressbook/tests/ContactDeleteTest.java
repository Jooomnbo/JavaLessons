package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeleteTest extends TestBase{

    @Test
    public void testContactDelete(){
        app.getNavigationHelper().gotHomePage();
        app.getContactHelper().chooseContact();
        app.getContactHelper().initContactDelete();
        app.getNavigationHelper().gotHomePage();
    }
}
