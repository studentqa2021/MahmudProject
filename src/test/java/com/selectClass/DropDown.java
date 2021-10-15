package com.selectClass;

import java.util.List;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	static String baseUrl = "https://demoqa.com/select-menu";
	static String baseUrl1 = "http://demo.guru99.com/test/newtours/register.php";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl1);
		driver.manage().window().maximize();
//		Select objSelect= new Select(driver.findElement(By.id("oldSelectMenu")));
//		objSelect.selectByIndex(2);
		WebElement element = driver.findElement(By.name("country"));
		Select select = new Select(element);
		//String value =element.getText();
		//System.out.println(value);
//		select.selectByVisibleText("BANGLADESH");
//	    select.selectByIndex(1);
//	    select.selectByValue("BRAZIL");
		List <WebElement> list = select.getOptions();
	    System.out.println("total countries: "+list.size());
	    System.out.println("****************************");
	    System.out.println("******Country list****** ");
	  //for(WebElement e:list)
		for (WebElement ele: list) {
			
			String value= ele.getText();
		   System.out.println(value);
			
			if(value.equals("UNITED STATES")) {
				//select.selectByValue(value);
				break;
			
			}
			
		}System.out.println("*******Value is Selected******");
		System.out.println("UNITED STATES");
		driver.quit();
	}

}
