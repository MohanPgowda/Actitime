package com.Acttitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement lgot;
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement Tsklst;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getLgot() {
		
		return lgot;
	}

	public WebElement getTsklst() {
		return Tsklst;
	}
	
	

}
