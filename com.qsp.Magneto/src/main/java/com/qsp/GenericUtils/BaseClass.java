package com.qsp.GenericUtils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	WebDriver driver;
	FileUtil fu = new FileUtil();
	
	@BeforeSuite
	public void connectToDB() {
		System.out.println("Connected with DB");
	}
	
	@BeforeClass
	public void launchTheBrowser() throws IOException {
		String BROWSER = fu.readDataFromPropertiesFile("browser");
		String URL=fu.readDataFromPropertiesFile("url");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		
		else if(BROWSER.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	
	@AfterClass
	public void closeTheBrowser() {
		driver.quit();
	}

}
