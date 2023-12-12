package com.simplilearn.selenium.Flipkart;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartHomePageTitle {
	
	public static void main(String[] args) {
		
		//step1:formulate domain url and driverpath
		
		String url = "https://www.flipkart.com/";
		String driverpath = "drivers//Window//chromedriver.exe";
		
		//step2:setup selenium properties for webdriver

		System.setProperty("window.chrome.driver", driverpath);
		
		//step3:instantiate webdriver
		
		ChromeDriver driver = new ChromeDriver();
		
		//step4:launch browser
		
		driver.get(url);
		
		
		
		//step5:evaluate testcases
		
		String title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		if(title.equals(driver.getTitle())) {
			System.out.println("Testcase is passed");
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


