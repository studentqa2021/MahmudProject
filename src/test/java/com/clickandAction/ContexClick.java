package com.clickandAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContexClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement acceptCockies = driver.findElement(By.xpath("//*[contains(text(), 'Accept All ')]"));
		action.click(acceptCockies).build().perform();
		Thread.sleep(3000);
		WebElement rightClick = driver.findElement(By.xpath("(//*[@id ='primary-menu']//li//a)[3]"));
		//rightClick.click();
		action.contextClick(rightClick).build().perform();
	}
}
