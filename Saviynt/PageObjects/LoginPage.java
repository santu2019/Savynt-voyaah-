package com.Saviynt.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Saviynt.FunctionalLibrary.GenericMethods;



public class LoginPage extends GenericMethods {

	// Page Elements section
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Email or Mobile Number']")
	public static WebElement userName;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	public static WebElement passWord;

	@FindBy(how = How.XPATH, using = "//button[@class='text-white save-button-styles mt-2']")
	public static WebElement submitButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\\\"dropdownMenuButton\\\"]/ion-text")
	public static WebElement ProfileClick;
	

	// Page Commands section
	public void userLogin() throws Throwable {

		GenericMethods.implicitWait();
		userName.sendKeys("Admin");
		GenericMethods.implicitWait();
		passWord.sendKeys("$aviynT1");
		GenericMethods.implicitWait();
		submitButton.click();
		ProfileClick.click();
		
	}
public LoginPage()
{
	PageFactory.initElements(BrowserInvoke.driver, this);
}
	public void usernameentry() {
		
		userName.sendKeys("test");
	}

	}


