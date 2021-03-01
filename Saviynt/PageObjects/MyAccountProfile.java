package com.Saviynt.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountProfile {
	@FindBy(how = How.XPATH ,using= "//input[@placeholder='user name']")
	public static WebElement Name;
	
	@FindBy(how = How.XPATH , using = "//select[@formcontrolname='gender']")
	public static WebElement Gender;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Select date of birth']")
	public static WebElement DOB;

	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='maritalStatus']")
	public static WebElement Martialstatus;
	
//	@FindBy(how = How.ID, using = "exampleInputEmail7")
//  public static WebElement Verifymobile;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='name@example.com']")
	public static WebElement VerifyEmail;
	
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='address']")
	public static WebElement Address;
	
	@FindBy(how = How.XPATH, using = "//*[@type='text' and @placeholder='city']")
	public static WebElement City;
	
	@FindBy(how = How.XPATH, using = "//select[@formcontrolname='addressCountry']")
	public static WebElement Country;
	
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='zipCode']")
	public static WebElement Zipcode;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='aadhaar number']")
	public static WebElement Adhaarcard;
	
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='cityName']")
	public static WebElement Aadharcityname;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Select issue date']")
	public static WebElement issuedate;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn save_button']")
	public static WebElement update;


	public MyAccountProfile()
	{
		PageFactory.initElements(BrowserInvoke.driver, this);
	}
	public void test()
	{
		Name.sendKeys("Email");
	}
}
 