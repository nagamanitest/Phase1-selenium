package com.simplilearn.selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class LaunchFirefoxTest2 {
	
	public static void main(String[] args) {
		 
		
		//step1: formulate the test domain Url and driver path.
		
		String url = "https:/www.google.com/";
		String driverpath = "drivers/Window/geckodriver.exe";
		
		//step2:set selenium properties for webdriver.
		
		System.setProperty("webdriver.geckodriver.driver",driverpath);
		
		//step3://instantiate selenium webdriver
		
		WebDriver driver = new FirefoxDriver();
		
		step4://launch browser
		
		driver.get(url);
		 
		//step5:close browser
		
		driver.close();
		
	}

}
