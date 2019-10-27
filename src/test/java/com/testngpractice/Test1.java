package com.testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeSuite
	public void setUp() 
	{System.out.println("set up system property for chrome");}
	
	@BeforeClass
	public void LaunchBrowser() 
	{System.out.println(" Launch chrome browser");}
	
	@BeforeMethod
	public void enterURL()
	{System.out.println(" enter url");}
	
	@BeforeTest
	public void Login()
	{System.out.println("login to app");}
	
	@Test
	public void googleTittle()
	{System.out.println("google tittle test");}
	
	@AfterMethod
	public void logOut()
	{System.out.println("logout from app");} 
	
	@AfterTest
	public void deleteAllCookies()
	{System.out.println("delete all cookies");}
	
	@AfterClass
	public void closeBrowser()
	{System.out.println("close Browser");}

}
