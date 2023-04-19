package com.Acttitime.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class loginPage {
	 
	@FindBy(xpath="//input[@id='username']")
	private WebElement untbx;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement pwtbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgn;
	
	public WebElement setUntbx() {
		return untbx;
	}
	public WebElement setPwtbx() {
		return pwtbx;
	}
	public WebElement setLgn() {
		return lgn;
	}
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	
	
	}
	
}
