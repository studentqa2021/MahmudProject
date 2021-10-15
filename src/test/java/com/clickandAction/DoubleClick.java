package com.clickandAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.driverManager.SuperClass;

public class DoubleClick {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		WebElement acceptCockies = driver.findElement(By.xpath("//*[contains(text(), 'Accept All ')]"));
		action.click(acceptCockies).build().perform();
		Thread.sleep(3000);
		//Double click on element
		WebElement doubleClick = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));
		action.doubleClick(doubleClick).build().perform();
		
	}
}
