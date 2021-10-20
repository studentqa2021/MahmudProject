package com.clickandAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.driverManager.SuperClass;

import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

public class DragAndDrop {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new SuperClass().driverManager();
		dragDrop();
		
	}
	public static void dragDrop() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement dragItem = driver.findElement(By.xpath("(//*[@class = 'button button-orange'])[5]"));
		WebElement dropItem = driver.findElement(By.xpath("(//*[@class ='placeholder'])[1]"));
		TimeUnit.SECONDS.sleep(3);
		// action.dragAndDrop(dragItem, dropItem).build().perform();
		action.clickAndHold(dragItem).moveToElement(dropItem).release().build().perform();
		System.out.println("Drag and drop is successfull");
		String actual=driver.getTitle();
		String expected = "Drag and Drop Action";
		System.out.println(actual);
		Assert.assertEquals(actual,expected);
        driver.quit();
	}

}
