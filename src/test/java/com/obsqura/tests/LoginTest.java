package com.obsqura.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void MyLoginTest() {
		lp.Login();	
		hp.NavigateToManagePaymentSection();
	}

}
