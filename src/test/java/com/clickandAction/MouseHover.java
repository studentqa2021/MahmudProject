package com.clickandAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// up casting
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement acceptCockies = driver.findElement(By.xpath("//*[contains(text(), 'Accept All ')]"));
		action.click(acceptCockies).build().perform();
		WebElement element = driver.findElement(By.xpath("//*[@class='nav_item_name']"));
		action.moveToElement(element).build().perform();
		Thread.sleep(4000);
		WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Events')]"));
		action.click(element1).build().perform();// action click
		driver.quit();
	}

}
