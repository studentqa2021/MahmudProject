package com.selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassPractice {
	static String baseUrl = "https://demoqa.com/select-menu";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		// create object of the select class
		Select select = new Select(driver.findElement(By.xpath("//*[@id='cars']")));
				if(select.isMultiple()){
					
					//Selecting multiple values by index
					select.selectByIndex(1);
					select.selectByIndex(2);

					//Or selecting by values
					select.selectByValue("volvo");
					select.selectByValue("audi");

					//Or selecting by visible text
					select.selectByVisibleText("Volvo");
					select.selectByVisibleText("Opel");
				}
				System.out.println();
				//driver.quit();
	}

}
