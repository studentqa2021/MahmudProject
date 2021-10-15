package com.clickandAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterKey {
	// how to enter or use non text key in selenium
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		boolean bool = driver.findElement(By.name("q")).isDisplayed();

		System.out.println(bool);
		driver.quit();
	}

}
