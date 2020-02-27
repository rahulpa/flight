package com.makemytrip.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.BasePage;

public class HomePage extends BasePage
{
	@FindBy(xpath="//p[.=' Login or Create Account']")
	private WebElement LoginBTN;
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(xpath="//span[.='Continue']")
	private WebElement continueBTN;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoginBTN() 
	{
		LoginBTN.click();
	}
	
	public void setUserName(String un) 
	{
		unTB.sendKeys(un);
	}
	
	public void clickContinueBTN()
	{
		continueBTN.click();
	}
	
	
	
}
