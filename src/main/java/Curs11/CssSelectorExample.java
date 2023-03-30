package Curs11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;



public class CssSelectorExample extends BaseTest {

	
	//@Test
	public void cssSelectorTest() {
		
		
		WebElement loginMenu = driver.findElement(By.cssSelector("#menu_user"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", loginMenu);
		
		
		WebElement logo = driver.findElement(By.cssSelector("div.logo_slogan"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", logo);
		
	
		WebElement inspireText = driver.findElement(By.cssSelector("div.column-1_2 h3.sc_title"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", inspireText);
				
	}
	
	@Test
	public void cssSelector2() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		WebElement bookTitle = driver.findElement(By.cssSelector("h3[class*='sc_title_reg']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", bookTitle);

		WebElement bookTitle2 = driver.findElement(By.cssSelector("h3[class~='sc_title_regular']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red;')", bookTitle2);

		WebElement bookTitle3 = driver.findElement(By.cssSelector("a[href^='life']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red;')", bookTitle3);
	
		WebElement bookTitle4 = driver.findElement(By.cssSelector("a[href$='nce']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red;')", bookTitle4);
	}
	
	
	
}