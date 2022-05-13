package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobject.LoginPage;

public class LoginTest extends BaseClass{
	WebDriver driver;
  @Test
  public void login() {
	  LoginPage l=new LoginPage(driver);
	  l.loginDetails();
  }
}
