package com.simplilearn.selenium.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartHomePageTest2 {

    static WebDriver driver;  // Declare the driver as a class variable

    public static void main(String[] args) {
        // step1: formulate domain URL and driver path
        String url = "https://www.flipkart.com/";
        String driverPath = "drivers/Window/chromedriver.exe";

        // step2: setup Selenium properties for WebDriver
        System.setProperty("webdriver.chrome.driver", driverPath);

        // step3: instantiate Selenium WebDriver
        driver = new ChromeDriver();

        // step4: launch browser
        driver.get(url);

        // step5: evaluate test cases
        if (url.equals(driver.getCurrentUrl())) {
            System.out.println("Testcase is passed!");
        } else {
            System.out.println("Testcase is failed!");
        }

        System.out.println("Expected url:" + url);
        System.out.println("Actual url:" + driver.getCurrentUrl());

        
        typeSearch();
        
     // step6: Close browser
         driver.close();

    }

    private static void typeSearch() {
        WebElement searchBox = driver.findElement(By.name("q"));  // Corrected method name and WebElement variable name
        searchBox.sendKeys("iphone12");
        searchBox.sendKeys(Keys.RETURN);  // Using Keys.RETURN to submit the form

        // add delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String expectedTitle = "Iphone12- Buy Products Online at Best Price in India - All Categories | Flipkart.com";  // Corrected expected title
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Test is Passed !");
        } else {
            System.out.println("Test is Failed !");
        }

        System.out.println("Expected Title : " + expectedTitle);
        System.out.println("Actual Title : " + actualTitle);
    }
}
