package com.Saviynt.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserInvoke {
	public static WebDriver driver;
	String URL = "https://www.voyaah.com/#/";

	public void Brower() {
		String chromedrvr = "./resouser/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromedrvr);
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}

	public WebElement loginbutton() {
		return (driver.findElement(By.xpath("/html/body/app-root/ion-app/ion-router-outlet/app-homepage/ion-header/header/nav/ul/li[4]/div/p")));
	}

	public WebElement Dropdown(int gender, WebElement dropdownEle) {
		Select dropdown = new Select(dropdownEle);
		dropdown.selectByIndex(gender);
		return dropdownEle;
	}
}