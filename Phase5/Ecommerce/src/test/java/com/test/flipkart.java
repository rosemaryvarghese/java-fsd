package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.awt.Toolkit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class flipkart {
	
	WebDriver chrome;
	String url;
	
  @Test(priority = 1)
  public void loadTime() {
	  
	  JavascriptExecutor js=(JavascriptExecutor)chrome;
	  chrome.get("https://www.flipkart.com/");
	  long navstart=(Long) js.executeScript("return window.performance.timing.navigationStart");
	  long respstart=(Long) js.executeScript("return window.performance.timing.responseStart");
	  long domcomp=(Long) js.executeScript("return window.performance.timing.domComplete");
	  long backendper=respstart-navstart;
	  long frontendper=domcomp-respstart;
	 System.out.println("backend performance : "+ backendper);
	 System.out.println("frontend performance : "+frontendper);
	  
  }
  
  @Test(priority = 2)
  public void search()
  {
	  chrome.get("https://www.flipkart.com");
	  WebElement cancle= chrome.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']"));
	  cancle.click();
	  WebElement searchbar= chrome.findElement(By.name("q"));
	  searchbar.sendKeys("iphone 13");
	  chrome.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  WebElement searchbuton= chrome.findElement(By.cssSelector("button[class='L0Z3Pu']"));
	  searchbuton.click();
	  this.url=chrome.getCurrentUrl();
	  
	  
  }
  
  @Test(priority = 3)
  public void scroll()
  {
	  	chrome.get(this.url);
	  
		JavascriptExecutor scrollBarPresent = (JavascriptExecutor) chrome;
		Boolean test = (Boolean) (scrollBarPresent.executeScript("return document.documentElement.scrollHeight>document.documentElement.clientHeight;"));
		if (test == true) {
			System.out.println("Scrollbar is present.");
		} else if (test == false){
			System.out.println("Scrollbar is not present.");
		}
	
  }
  @Test(priority=4)
  public void contentRefresh() 
  {
	  chrome.get(this.url);
	  //chrome.get("https://www.flipkart.com");
	  long startTime = System.currentTimeMillis();
	  JavascriptExecutor refresh = (JavascriptExecutor) chrome;
	  refresh.executeScript("window.scrollBy(0,1000)", "");
	  new WebDriverWait(chrome, Duration.ofMinutes(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='CXW8mj']")));
	  long endTime = System.currentTimeMillis();
	  long totalTime = endTime - startTime;
	  System.out.println(" Load Time after scrolling " + totalTime);
	 
	  
  }
  
  @Test(priority=5)
  public void imageDisplay() throws Exception
  {
	  chrome.get(this.url);
	  WebElement image = chrome.findElement(By.xpath("//div[@class='CXW8mj']"));     
      if (image.isDisplayed()) 
      {
          System.out.println("before scrolling the image in not present"); 
          
      }
      	System.out.println("scrolling");
    	  Thread.sleep(2000);
    	  JavascriptExecutor scroll = (JavascriptExecutor) chrome;
    	  scroll.executeScript("window.scrollBy(0,710)");
          WebElement img1 = chrome.findElement(By.xpath("//div[@class='CXW8mj']")); 
          if(img1.isDisplayed()) {
        	  System.out.println("after scrolling the image is present"); 
  
          }  
  }
  
  @Test(priority = 6)
  public void bottomScroll()
  {
	  chrome.get(this.url);
	  chrome.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	  try {
		((JavascriptExecutor) chrome).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("scrolled to bottom");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("did not scroll to bottom");
	}
//      System.out.println(s);
  }
  
  
  @Test(priority = 8)
  public void diffBrowChrome()
  {
	 
	  chrome.get("https://www.flipkart.com");
	  System.out.println("***********chrome************");
	  Dimension d= chrome.manage().window().getSize();
	  System.out.println( "height : "+d.getHeight() +"\n width : "+d.getWidth());
	  chrome.manage().window().setSize(new Dimension(702, 613));
	  d= chrome.manage().window().getSize();
	  System.out.println("after changing resoulution");
	  System.out.println( "height : "+d.getHeight() +"\n width : "+d.getWidth());
  }
  
  @Test(priority = 7)
  public void imgHeight()
  {
	  chrome.get("https://www.flipkart.com");
	 // WebElement cancle= chrome.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']"));
	  //cancle.click();
	  java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	  int width = (int) screenSize.getWidth();
	  int height = (int) screenSize.getHeight();
	  System.out.println("Resoultion of the device :  Screen  width "+ width+" Screen Height "+height );
	  chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  int wid=chrome.findElement(By.cssSelector("img[class='_396cs4 _3exPp9']")).getSize().getWidth();
      int h=chrome.findElement(By.cssSelector("img[class='_396cs4 _3exPp9']")).getSize().getHeight();
      System.out.println("Resoultion of the image :  Image  width "+ wid+" Image Height "+h );
	  WebElement img = chrome.findElement(By.cssSelector("img[class='_396cs4 _3exPp9']"));     
	  if(img.isDisplayed()){
		  if (h<height)
      		{
          		System.out.println("Image is visible till the screen height itself"); 
      		}
	  }
  }
  
  
  
  
  @Test(priority = 9)
  public void diffBrowEdge()
  {
	  System.setProperty("webdriver.edge.driver", "C:\\\\edgedriver_win64\\\\msedgedriver.exe");
	  WebDriver edge= new EdgeDriver();
	  edge.get("https://www.flipkart.com");
	  System.out.println("***********edge************");
	  Dimension d= edge.manage().window().getSize();
	  System.out.println( "height : "+d.getHeight() +"\n width : "+d.getWidth());
	  edge.manage().window().setSize(new Dimension(702, 613));
	  d= edge.manage().window().getSize();
	  System.out.println("after changing resoulution");
	  System.out.println( "height : "+d.getHeight() +"\n width : "+d.getWidth());
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  chrome.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\\\\\\\95\\\\\\\\chromedriver.exe");
	  chrome= new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
  }

}
