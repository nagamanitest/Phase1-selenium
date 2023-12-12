package com.simplilearn.selenium.Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomepageTest {
	
	public static void main(String[] args) {
		
		//step1: formulate the test domain Url and driver path.
		
				String url = "https://www.google.com/";
				String driverpath = "drivers/Window/chromedriver.exe";
				
				//step2:set selenium properties for webdriver.
				
				System.setProperty("webdriver.chrome.driver",driverpath);
				
				//step3://instantiate selenium webdriver
				
				WebDriver driver = new ChromeDriver();
				
				//step4:launch browser
				
				driver.get(url);
				
				//step5:Evaluate the testcase 
				
				if(url.equals(driver.getCurrentUrl())) {
					System.out.println("Testcase is passed!");
				}else
				{
					System.out.println("Testcase is failed!");
				}
				
				System.out.println("Expected url:" +url);
				System.out.println("Actual url:" +driver.getCurrentUrl());
				
				//step6:close browser
				driver.close();
	}

}
