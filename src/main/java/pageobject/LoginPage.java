package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void loginDetails()
	{
		WebElement user=driver.findElement(By.name("username"));
		user.sendKeys("admin");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin");
		WebElement login=driver.findElement(By.xpath("//button[@class=\"btn btn-dark btn-block\"]"));
		login.click();
	}

}
