package com.seleniumlogin;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	 public static void main(String[] args)
	    {
	        System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\95\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY0MzY3NDQ2LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
	        
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("email"))
	        .sendKeys("rose@gmail.com");
	        
	        driver.findElement(By.id("pass"))
	        .sendKeys("rose@123");
	        
	        driver.findElement(By.id("loginbutton"))
            .click();
	        
	    }
}
