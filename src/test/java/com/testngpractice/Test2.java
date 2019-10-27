package com.testngpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:/seleniumJars/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		System.out.println("google.com");

		
		
	}
//	@Test
//	public void googleTitleTest() {
//		String title = driver.getTitle();
//		System.out.println(title);
//	}
//	@Test
//	public void googleLpgoTest() {
//		boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
//	}
//	@Test
//	public void mailLinkTest() {
//		boolean b = driver.findElement(By.linkText("mail")).isDisplayed();
//	}
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}

}
