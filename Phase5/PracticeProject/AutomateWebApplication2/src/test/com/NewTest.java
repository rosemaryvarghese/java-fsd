package com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver chrome;
  @Test
  public void register() {
	  
	  chrome.get("http://automationpractice.com/index.php");
	  WebElement register= chrome.findElement(By.className("login"))
			  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\95\\chromedriver.exe");
	  chrome = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
