package com.catalyst.springboot.selenium;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {
	private WebDriver driver;
	String testLocation = "file:///C:/Users/lDahlberg/Desktop/Projects/Group_Hobby_Project/CollectorMkii/target/classes/main/resources/public/collectible-index.html";

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/tools/chromedriver.exe/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	/*@Test
	public void getTitle() {
		driver.get(testLocation);
		String actualTitle = driver.getTitle();
		assertEquals("Hobbyist Collection Page", actualTitle);
	}*/
	
	@Test
	public void fillAddData() throws InterruptedException {
		driver.get(testLocation);
		List<WebElement> inputs = driver.findElements(By.cssSelector("#add input"));
		for (WebElement elem : inputs) {
			elem.sendKeys("test-case scenario");
		}
		WebElement descriptionElement = driver.findElement(By.id("description"));
		descriptionElement.sendKeys("test7");
		Select selectType= new Select (driver.findElement(By.id("type")));
		selectType.selectByVisibleText("Books");
		Select selectCondition = new Select (driver.findElement(By.id("condition")));
		selectCondition.selectByVisibleText("Poor");
		Select selectColor = new Select (driver.findElement(By.id("color")));
		selectColor.selectByVisibleText("White");
		Thread.sleep(2000);
	}
	
	@Test
	public void fillUpdateData() throws InterruptedException {
		driver.get(testLocation);
		driver.findElement(By.xpath("/html/body/div[3]/button")).click();
		Thread.sleep(1000);
		List<WebElement> inputs = driver.findElements(By.cssSelector("#update_add input"));
		for (WebElement elem : inputs) {
			elem.sendKeys("test-case scenario");
		}
		WebElement descriptionElement = driver.findElement(By.id("update_description"));
		descriptionElement.sendKeys("test7");
		Select selectType= new Select (driver.findElement(By.id("update_type")));
		selectType.selectByVisibleText("Books");
		Select selectCondition = new Select (driver.findElement(By.id("update_condition")));
		selectCondition.selectByVisibleText("Poor");
		Select selectColor = new Select (driver.findElement(By.id("update_color")));
		selectColor.selectByVisibleText("White");
		Thread.sleep(1000);
	}
	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}
}
