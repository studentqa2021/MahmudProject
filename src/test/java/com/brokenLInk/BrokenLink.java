package com.brokenLInk;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize();
		// Implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// To launch softwaretestingmaterial.com
		driver.get("https://demoqa.com/broken");
		//used tagName method to collect the list of items with tagName "a"
		// findElements >>> to find all the element with the current page. It returns 
		// a list of all webElements or an empty list if nothing match
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("*********************");
		System.out.println("Total links are: "+links.size());
		for (int i =0; i<links.size(); i++) {
			WebElement element =links.get(i);
			// by using "href" attribute, we could the url of the required link
			String url=element.getAttribute("href");
			// calling verifyLink() method here . passing the parameter as url 
			verifyLink(url);
		}
		//driver.quit();
		
	}
	public static void verifyLink(String urlLink) {
		// Sometimes we may face exception "java.net.MalformedURLException".
		//Set the timeout for 2 seconds
		URL link;
		try {
			link = new URL(urlLink);
		
		HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
		httpConn.setConnectTimeout(2000);
		httpConn.connect();
		if (httpConn.getResponseCode()==200) {
			System.out.println(urlLink + " - " + httpConn.getResponseMessage()+ "   Responce code = "+httpConn.getResponseCode());
		}else {
			System.out.println(urlLink + " - " + httpConn.getResponseMessage()+ "   Responce code = "+httpConn.getResponseCode());
		}
		}
		catch(Exception e){
			
		}
	}
	
	}	


