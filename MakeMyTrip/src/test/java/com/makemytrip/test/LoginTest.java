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
		h.clickLoginBTN();
		h.setUserName("admin");
		h.clickContinueBTN();
		
	}
}
