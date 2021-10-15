package com.testNG.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGtest {
	static WebDriver driver;
@BeforeTest
	public void setUp() {

	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.prothomalo.com/");
	driver.manage().window().maximize();

	}

@Test(groups = {"mizn"},priority = 2)
	public void b() {
	
	System.out.println("this is b method");
	}
@Test(groups = {"mizn"},priority = 1)
public void c() {
	
	System.out.println("this is b method");
	}

}
