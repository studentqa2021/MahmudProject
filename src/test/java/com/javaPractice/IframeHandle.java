package com.javaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

public class IframeHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(3);
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID
	       TimeUnit.SECONDS.sleep(3);
			System.out.println("********We are switch to the iframe*******");
  		driver.findElement(By.xpath("html/body/a/img")).click();
	}

}
