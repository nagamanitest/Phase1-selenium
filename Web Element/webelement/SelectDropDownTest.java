package com.simplilearn.selenium.webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		setUp();
		
		testSelectDropdownExist();
		
		testSelectDropdownDefault();
		
		testSelectDropdownOption();
		
		testSelectDropdownOption2();
		
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
	
	public static void testSelectDropdownExist() {

		WebElement dropdown = driver.findElement(By.id("vehicle"));

		if (dropdown.isDisplayed() ) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}
	}
	
	public static void testSelectDropdownDefault() {
		// find select dropdown
		WebElement dropdown = driver.findElement(By.id("vehicle"));

		// Select for map web element to select option
		Select select = new Select(dropdown);
		
		// select bike as a selected option
		select.selectByValue("bike");
		
		// get selected option 
		WebElement selectedElm = select.getFirstSelectedOption();
		
		String expectedText = "Bike";
		String actualText = selectedElm.getText();
		
		if (expectedText.equals(actualText) ) {
			System.out.println("Default Select Test is Passed !");
		} else {
			System.out.println("Default Select Test is Failed !");
		}
	}
	
	public static void testSelectDropdownOption() {
		// find select dropdown
		WebElement dropdown = driver.findElement(By.id("vehicle"));

		// Select for map web element to select option
		Select select = new Select(dropdown);
		
		// select Airplane as a selected option
		select.selectByIndex(3);
		
		// get selected option 
		WebElement selectedElm = select.getFirstSelectedOption();
		
		String expectedText = "Airplane";
		String actualText = selectedElm.getText();
		
		if (expectedText.equals(actualText) ) {
			System.out.println("Index 3 (Airplane) Select Test is Passed !");
		} else {
			System.out.println("Index 3 (Airplane) Select Test is Failed !");
		}
	}
	
	public static void testSelectDropdownOption2() {
		// find select dropdown
		WebElement dropdown = driver.findElement(By.id("vehicle"));

		// Select for map web element to select option
		Select select = new Select(dropdown);
		
		// select Car as a selected option
		select.selectByVisibleText("Car");
		
		// get selected option 
		WebElement selectedElm = select.getFirstSelectedOption();
		
		String expectedText = "Car";
		String actualText = selectedElm.getText();
		
		if (expectedText.equals(actualText) ) {
			System.out.println("Car Select Test is Passed !");
		} else {
			System.out.println("Car Select Test is Failed !");
		}
	}

}
