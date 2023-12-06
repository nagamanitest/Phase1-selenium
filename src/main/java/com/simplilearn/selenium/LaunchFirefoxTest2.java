package com.simplilearn.selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFirefoxTest2 {
	
	public static void main(String[] args) {
		 
		
		//step1: formulate the test domain Url and driver path.
		
		String url = "https:/www.google.com/";
		String driverpath = "drivers/Window/chromedriver.exe";
		
		//step2:set selenium properties for webdriver.
		
		System.setProperty("webdriver.chrome.driver",driverpath);
		
		//step3://instantiate selenium webdriver
		
		WebDriver driver = new ChromeDriver();
		
		step4://launch browser
		
		driver.get(url);
		 
		//step5:close browser
		
		driver.close();
		
	}

}
