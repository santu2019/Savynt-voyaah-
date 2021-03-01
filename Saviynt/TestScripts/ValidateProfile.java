package com.Saviynt.TestScripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Saviynt.PageObjects.BrowserInvoke;
import com.Saviynt.PageObjects.LoginPage;
import com.Saviynt.PageObjects.MyAccountProfile;

public class ValidateProfile {

	@Test
	public void TestProj() {
		
		BrowserInvoke in=new BrowserInvoke();
		in.Brower();
		
		WebElement loginbutton = in.loginbutton();
		System.out.println(loginbutton);
		loginbutton.click();
		LoginPage Myprofile=new LoginPage();
		Myprofile.usernameentry();
	}
	
	
}
