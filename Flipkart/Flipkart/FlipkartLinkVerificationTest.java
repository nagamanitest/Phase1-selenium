package com.simplilearn.selenium.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLinkVerificationTest {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		String url = "https://www.flipkart.com/";
		String driverpath = "drivers\\Window\\chromedriver.exe";
		
		System.setProperty("window.driver.chrome", driverpath);
		
		driver = new ChromeDriver();
		
		driver.get(url);
		
		//testVerificationLink();
		
		testBeautyLink();
		
		
		Thread thread = new Thread();
		thread.wait(2000);
		
		driver.close();
	}
	
	private static void testVerificationLink() {
		
	WebElement Searchbox = driver.findElement(By.name("q"));
	Searchbox.sendKeys("Fashion");
	Searchbox.submit();
	
	String expecetedTitle = "Fashion- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
	String actualtitle =  driver.getTitle();
	
	if(expecetedTitle.equals(actualtitle)) {
		System.out.println("Testcase is passed!");
	}else
	{
		System.out.println("Testcase is failed!");
	}
	}
	
	private static void testBeautyLink() {
		
		WebElement beautylink = driver.findElement(By.linkText("Beauty"));
		beautylink.click();
				
	}
}
