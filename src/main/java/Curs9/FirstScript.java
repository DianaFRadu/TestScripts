package Curs9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstScript {

	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
	driver = new EdgeDriver();
	driver.get("https://keybooks.ro/");
	}
	@Test
	public void openBrowser() {
		
		WebDriver driver = new EdgeDriver();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("CONTACTS")).click();
		
		
		
	}
	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
}
