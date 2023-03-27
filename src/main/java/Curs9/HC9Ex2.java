package Curs9;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HC9Ex2 {

	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
	driver = new EdgeDriver();
	driver.get("https://keybooks.ro/");
	}
	
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	@Test(priority = 1)
	public void Login() {
	
		//WebElement login = driver.findElement(By.linkText("Login"));
		//login.click();
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("log")).sendKeys("TestUser");
		driver.findElement(By.id("password")).sendKeys(" 12345@67890");
		driver.findElement(By.className("submit_button")).click();
		
}
}
		
		