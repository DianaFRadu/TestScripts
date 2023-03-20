package Curs9;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumLocator {
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
	public void linkTextLocator() {
		
		WebElement booksLink = driver.findElement(By.linkText("BOOKS"));
			booksLink.click();
			assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
	}
	@Test(priority = 2)
	public void partialLinkTextLocator() {
		WebElement cookingBook = driver.findElement(By.partialLinkText("Cooking"));
		cookingBook.click();
	}
	
	@Test(priority = 3)
	public void classNameLocator() {
		WebElement searchIcon = driver.findElement(By.className("icon-search"));
	}
	@Test(priority = 4)
	public void nameLocator() {
		WebElement searchField = driver.findElement(By.name("s"));
		searchField.sendKeys("TEST");
	}
	
	}
