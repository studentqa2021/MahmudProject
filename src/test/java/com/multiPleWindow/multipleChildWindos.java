package com.multiPleWindow;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleChildWindos {

	public static void main(String[] args) throws InterruptedException {									
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/browser-windows");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    // Opening all the child window
	    driver.findElement(By.id("windowButton")).click();
	    driver.findElement(By.id("messageWindowButton")).click();
	    
	    String MainWindow = driver.getWindowHandle();
	    System.out.println("Main window handle is " + MainWindow);

	    // To handle all new opened window
	    Set<String> allWindows = driver.getWindowHandles();
	    System.out.println("Child window handle is" + allWindows);
	    Iterator<String> iterator = allWindows.iterator();

	    // Here we will check if child window has other child windows and when child window
	    //is the main window it will come out of loop.
	      while (iterator.hasNext()) {
	          String ChildWindow = iterator.next();
	          if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
	              driver.switchTo().window(ChildWindow);
	              driver.close();
	              System.out.println("Child window closed");
	           }
	       }
	    }
}
