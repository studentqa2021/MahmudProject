package com.radioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://www.example.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("/html/body/div/p[2]/a")).click();
	        //If u want to know the number of radio buttons then use List
	        List<WebElement>radioButton = driver.findElements(By.tagName("example"));
	        System.out.println("Radio Button total: " +radioButton.size());
	        
	}

}
