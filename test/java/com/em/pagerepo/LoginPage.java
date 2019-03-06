package com.em.pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.em.genericlib.GenericUtil;
import com.em.genericlib.GetData;

public class LoginPage {

	public WebDriver driver;// creating a WebDriver reference and not initializing it.
	@FindBy(id = "username")
	WebElement UsernameTextbox;
	@FindBy(name = "pwd")
	WebElement PasswordTextbox;
	@FindBy(id = "loginButton")
	WebElement LoginButton;

	public LoginPage(WebDriver driver) // Creating A Public Constructor With WebDriver Reference.
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);// To Initalize the WebElement
	}

	// Creating a method to confirm the webpage is loaded or not using Explicit
	// Wait(i.e. WebDriver Wait).
	public void waitForLoginPage() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("whiteBoxWithLogoTable"))));
	}

	public void LoginSuccessful(String user, String password) 
	{
       GenericUtil.enterText(UsernameTextbox, user);
       GenericUtil.enterText(PasswordTextbox, password);
       GenericUtil.ClickOnElement(LoginButton);
       Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
	}
}
