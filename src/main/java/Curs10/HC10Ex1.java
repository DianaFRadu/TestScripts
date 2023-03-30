package Curs10;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class HC10Ex1 extends BaseTest{
	
	
	@Test(priority = 1)
	public void Login() {
	
		driver.findElement(By.linkText("Login")).click();
	
	}

	@Test(priority = 2)
	public void elementsDisplayed() {
		driver.findElement(By.id("log"));
		driver.findElement(By.id("password"));

		
	}
}
