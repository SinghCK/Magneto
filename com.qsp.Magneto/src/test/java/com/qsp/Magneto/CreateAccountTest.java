package com.qsp.Magneto;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qsp.GenericUtils.BaseClass;
import com.qsp.ObjectRepositories.HomePage;

public class CreateAccountTest extends BaseClass{
	
	@Test
	public void createAnAccount(WebDriver driver) {
		HomePage hp = new HomePage(driver);
		hp.createAnAccount();
	}

}
