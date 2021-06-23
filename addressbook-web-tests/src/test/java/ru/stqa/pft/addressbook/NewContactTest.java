package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class NewContactTest {
  private WebDriver driver;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver","C:\\Windows\\System32\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    login("admin", "secret");
  }

  private void login(String username, String password) {
    driver.get("http://localhost/addressbook/edit.php");
    fillFieldByName("user", username);
    fillFieldByName("pass", password);
    driver.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testNewContact() throws Exception {
    addNewContact();
    fillFieldByName("firstname", "First name");
    fillFieldByName("middlename", "Middle name");
    fillFieldByName("lastname", "Last Name");
    fillFieldByName("nickname", "Nickname");
    fillFieldByName("title", "Title");
    fillFieldByName("company", "Company");
    fillFieldByName("address", "Address");
    fillFieldByName("home", "home");
    fillFieldByName("mobile", "Mobile");
    fillFieldByName("work", "Work");
    fillFieldByName("fax", "Fax");
    fillFieldByName("email", "E-mail");
    fillFieldByName("homepage", "Homepage");
    fillDropdownListByName("bday", "1");
    fillDropdownListByName("bmonth", "January");
    fillFieldByName("byear", "2000");
    fillDropdownListByName("new_group", "test");
    fillDropdownListByName("aday", "2");
    fillDropdownListByName("amonth", "February");
    fillFieldByName("ayear", "2001");
    clickEnterButton();
    driver.findElement(By.linkText("home")).click();
  }

  private void clickEnterButton() {
    driver.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  private void fillDropdownListByName(String locatorByName, String fillValue) {
    driver.findElement(By.name(locatorByName)).click();
    new Select(driver.findElement(By.name(locatorByName))).selectByVisibleText(fillValue);
  }

  private void fillFieldByName(String fillValue, String locatorByName) {
    driver.findElement(By.name(fillValue)).click();
    driver.findElement(By.name(fillValue)).clear();
    driver.findElement(By.name(fillValue)).sendKeys(locatorByName);
  }

  private void addNewContact() {
    driver.findElement(By.linkText("add new")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
