package com.simplilearn.selenium.webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {
	
	static WebDriver driver;

	public static void main(String[] args) {

		setUp();

		testRadioButtonExist();
		
		testRadioButton1Selected();
		
		testRadioButton2Selected();
		
		testRadioButton3Selected();
	}

	public static void setUp() {

		// step1: formulate a test domain url & driver path
		String siteUrl = "file:///C://Users//sham2//eclipse-workspace//Phase1-selenium//static//web-elements.html";
		String driverpath = "drivers//Window//chromedriver.exe";

		// step2: set system properties for selenium dirver
		System.setProperty("webdriver.chrome.driver", driverpath);

		// step3: instantiate selenium webdriver
		driver = new ChromeDriver();

		// step4: add implicit wait (Unconditional Delay)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		// step5: launch browser
		driver.get(siteUrl);
	}

	public static void testRadioButtonExist() {

		WebElement radioBt1 = driver.findElement(By.id("male"));
		WebElement radioBt2 = driver.findElement(By.id("female"));
		WebElement radioBt3 = driver.findElement(By.id("other"));

		if (radioBt1.isDisplayed() && radioBt2.isDisplayed() && radioBt3.isDisplayed()) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}
	}

	public static void testRadioButton1Selected() {

		WebElement radioBt1 = driver.findElement(By.id("male"));
	
		// select radio button 1
		 radioBt1.click();
		
		if (radioBt1.isSelected()) {
			System.out.println("Test selected 1 is Passed !");
		} else {
			System.out.println("Test selected 1 is Failed !");
		}
	}
	
	public static void testRadioButton2Selected() {

		WebElement radioBt2 = driver.findElement(By.id("female"));
	
		// select radio button 2
		 radioBt2.click();
		
		if (radioBt2.isSelected()) {
			System.out.println("Test selected 2 is Passed !");
		} else {
			System.out.println("Test selected 2 is Failed !");
		}
	}
	
	public static void testRadioButton3Selected() {

		WebElement radioBt3 = driver.findElement(By.id("other"));
	
		// select radio button 2
		 radioBt3.click();
		
		if (radioBt3.isSelected()) {
			System.out.println("Test selected 3 is Passed !");
		} else {
			System.out.println("Test selected 3 is Failed !");
		}
	}

}