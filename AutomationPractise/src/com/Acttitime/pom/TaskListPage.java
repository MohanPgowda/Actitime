package com.Acttitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newCustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement addcustname;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement ECustDesp;
	
	@FindBy(xpath="(//div[@class='dropdownButton'])[15]")
	private WebElement drdwbt;
	
	@FindBy(xpath="(//div[text()='Big Bang Company'])[22]")
	private WebElement Glcorp;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement crcust;
	
	//creating project
		@FindBy(xpath="(//div[text()='+ New Project'])")
		private WebElement newProject;
		public void setNewProject() {
			newProject.click();
		}


		public void setEntProjectName() {
			newProject.click();
		}
		@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
		private WebElement entProjectName;
	

	
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void setAddNew() {
		addNew.click();
	}
	public void setNewCustomer() {
		newCustomer.click();
		
	}
	public WebElement getAddcustname() {
		return addcustname;
	}
	public WebElement getECustDesp() {
		return ECustDesp;
	}
	public WebElement getDrdwbt() {
		return drdwbt;
	}
	public void setGlcorp() {
		Glcorp.click();
	}
	public void setCrcust() {
		crcust.click();
	}
	
	

}
