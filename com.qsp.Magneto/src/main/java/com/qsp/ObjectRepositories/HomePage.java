package com.qsp.ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qsp.GenericUtils.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@aria-label='store logo']/ancestor::header[@class='page-header']/descendant::a[contains(text(),'Sign In')]")
	private WebElement siginLink;
	
	@FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Create an Account')]")
	private WebElement createAnAccountText;

	public WebElement getSiginLink() {
		return siginLink;
	}

	public WebElement getCreateAnAccountText() {
		return createAnAccountText;
	}
	
	public void createAnAccount() {
		createAnAccountText.click();
	}

}
