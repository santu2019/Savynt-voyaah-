package com.Saviynt.TestScripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Saviynt.PageObjects.BrowserInvoke;

public class ValidLogin {

	@BeforeTest
	public void mainscript() {
		BrowserInvoke invoke=new BrowserInvoke();
		invoke.Brower();
	}
	@Test
	public void Profile() {
		 
	}
	
}
