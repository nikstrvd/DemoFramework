package com.wellnessy.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	
	public List<String> getDropdownOptionsAsList(WebElement element)
	{
		Select os = new Select(element);
		List<WebElement> list_webElement_model = os.getOptions();
		List<String> actualContents = new ArrayList<String>();
		
		for (WebElement ref : list_webElement_model)
		{
			actualContents.add(ref.getText());
		}
		
		return actualContents;
	}

}
