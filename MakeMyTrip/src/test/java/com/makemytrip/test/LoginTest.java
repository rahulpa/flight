package com.makemytrip.test;

import org.testng.annotations.Test;

import com.makemytrip.page.HomePage;

import generic.BaseTest;

public class LoginTest extends BaseTest
{
	@Test
	public void testLogin()
	{
		HomePage h = new HomePage(driver);
		h.myAccount();
		h.signInBTN();
		h.setUserName("1205410rahul@gmail.com");
		h.continueBTN();
		h.setPassword("Vini@1990");
		h.clickLoginBTN();
		
	}
}
