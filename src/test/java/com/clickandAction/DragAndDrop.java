package com.clickandAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement dragItem = driver.findElement(By.xpath("(//*[@class = 'button button-orange'])[5]"));
		Thread.sleep(3000);
		WebElement dropItem = driver.findElement(By.xpath("(//*[@class ='placeholder'])[1]"));
		Actions action = new Actions(driver);
		//action.dragAndDrop(dragItem, dropItem).build().perform();
		action.clickAndHold(dragItem).moveToElement(dropItem).release().build().perform();

	}

}
