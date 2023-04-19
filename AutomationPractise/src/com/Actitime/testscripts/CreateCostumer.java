package com.Actitime.testscripts;

import java.io.IOException;


import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Actitime.generic.BaseClass;
import com.Actitime.generic.FileLib;
import com.Acttitime.pom.HomePage;
import com.Acttitime.pom.TaskListPage;

public class CreateCostumer extends BaseClass{
	@Test
	public void CerCostumer() throws IOException  {
		FileLib f=new FileLib();
		Reporter.log("create customer",true);
		HomePage Lo=new HomePage(driver);
		Lo.getTsklst().click();
		TaskListPage Tlp=new TaskListPage(driver);
		Tlp.setAddNew();
		Tlp.setNewCustomer();
		Tlp.getAddcustname().sendKeys(f.getPropertyData("custname"));
		Tlp.getECustDesp().sendKeys(f.getPropertyData("custdesp"));
		Tlp.getDrdwbt().click();
		Tlp.setGlcorp();
		Tlp.setCrcust();
		Tlp.setNewProject();
		Tlp.setEntProjectName();
		
		
				
		
		
		
	}
	

}
