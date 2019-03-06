package com.em.genericlib;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtil {
	
	public WebDriver driver;
	
	public static void SelectValueByInt(WebElement element, int index)
	{
		Select sct = new Select(element);
		sct.selectByIndex(index);
	}
	
	public static void ClickOnElement(WebElement element)
	{
		Logger.getLogger("Click on Element");
		element.click();
	}
	
	public static void enterText(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	

}
