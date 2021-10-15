package com.alertInteface;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("Mahmud");
		TimeUnit.SECONDS.sleep(3);
		driver.findElement(By.xpath("//input[@type ='submit']")).click();
		TimeUnit.SECONDS.sleep(3);
		Alert alert = driver.switchTo().alert();
//		String value =driver.switchTo().alert().getText();
//		System.out.println(value);
		System.out.println(alert.getText());
		alert.accept();
		//Thread.sleep(3000);
		//alert.dismiss();
		driver.quit();

	}

}
