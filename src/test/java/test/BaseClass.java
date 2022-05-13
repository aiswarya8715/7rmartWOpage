package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	public WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\src\\test\\resources\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(" https://groceryapp.uniqassosiates.com/admin/login");
		 driver.manage().window().maximize();
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
