package com.simplilearn.selenium.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	public static void main(String[] args) {
		 
		
		//step1: formulate the test domain Url and driver path.
		
		String url = "https:/www.google.com/";
		String driverpath = "drivers/Window/chromedriver.exe";
		
		//step2:set selenium properties for webdriver.
		
		System.setProperty("webdriver.chrome.driver",driverpath);
		
		//step3://instantiate selenium webdriver
		
		WebDriver driver = new ChromeDriver();
		
		//step4:launch browser
		
		driver.get(url);
		
		//step5:Evaluate Test case(locate search browser)
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("selenium socumentation");
		searchbox.submit();
		
		//@SuppressWarnings("unused")
		String expectedTitle = "selenium socumentation - Google Search";
		//@SuppressWarnings("unused")
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}
		
		System.out.println("Expected Title : " + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);
		
		// step5: close driver
		driver.close();
		
		
		
		
		
		
	}

}
