package com.makemytrip.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.BasePage;

public class HomePage extends BasePage
{
	@FindBy(xpath="//a[@class='dropdown-toggle'][.='My Account']")
	private WebElement myAccount;
	
	@FindBy(id="signInBtn")
	private WebElement signinBTN;
	
	@FindBy(id="login-input")
	private WebElement unTB;
	
	@FindBy(id="login-continue-btn")
	private WebElement continueBTN;
	
	@FindBy(id="login-password")
	private WebElement pwTB;
	
	@FindBy(id="login-submit-btn")
	private WebElement loginBTN;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void myAccount() 
	{
		myAccount.click();
	}
	
	public void signInBTN() 
	{
		signinBTN.click();
	}
	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void continueBTN() 
	{
		continueBTN.click();
	}
	public void setPassword(String pw) 
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLoginBTN() 
	{
		loginBTN.click();
	}
	
}
