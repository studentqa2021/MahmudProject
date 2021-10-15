package com.multiPleWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//*[@target = '_blank']")).click();
		WebElement element= driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		element.click();
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		// for(int i =0; i<childWindow.size();i++)
		int count =childWindow.size();
		System.out.println("Total Window: "+count);
		for (String allWindow : childWindow) {

			if (!parentWindow.equalsIgnoreCase(allWindow)) {
				TimeUnit.SECONDS.sleep(2);
				
				// Switching to Child window
				driver.switchTo().window(allWindow);
				driver.findElement(By.name("emailid")).sendKeys("sarowerny@gmail.com");
				TimeUnit.SECONDS.sleep(4);
				driver.findElement(By.name("btnLogin")).click();
				TimeUnit.SECONDS.sleep(5);
			
				driver.close();
			}
		}
		//driver.switchTo().defaultContent();
		driver.switchTo().window(parentWindow);
		WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		element1 .click();
		

	}
}