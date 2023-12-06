package com.simplilearn.selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeTest {
	
	public static void main(String[] args) {
		 
		
		//step1: formulate the test domain Url and driver path.
		
		String url = "https:/www.google.com/";
		String driverpath = "drivers/Window/geckodriver.exe";
		
		//step2:set selenium properties for webdriver.
		
		System.setProperty("webdriver.firefox.driver",driverpath);
		
		//step3://instantiate selenium webdriver
		
		WebDriver driver = new FirefoxDriver();
		
		//launch browser
		
		driver.get(url);
		
	}

}
