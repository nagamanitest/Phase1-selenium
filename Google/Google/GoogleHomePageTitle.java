package com.simplilearn.selenium.Google;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePageTitle {
	
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
		
		//Step5:Evaluate testcases
		
		String title = "Google";
		
		if(title.equals(driver.getTitle())) {
			System.out.println("Testcase is passed!");
		}else
		{
			System.out.println("Testcase is failed!");
			
		}
		
		System.out.println("Expected title:" + title);
		System.out.println("Actual title:" +driver.getTitle());
		
		//step6:close browser
		
		driver.close();
		
	}


}
