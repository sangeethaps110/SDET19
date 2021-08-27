package com.Testcases;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generic.AutoConstants;
import com.generic.WebDriver_Utility;
import com.objectrepo.HomePage;
import com.objectrepo.SalesOrderPage;

import junit.framework.Assert;
//@Listeners(com.generic.Listeners.class)
public class TC_43 extends Baseclass {
	@Test(groups= {"smoke test","regression test"},retryAnalyzer=com.generic.RetryAnalyzer.class)
	public void SearchInSubject() throws IOException
	{	HomePage hp=new HomePage(driver);
		WebDriver_Utility util=new WebDriver_Utility();
		util.moveToElement(driver, hp.getMoreOption());
		hp.getSalesOrderLink().click();
		SalesOrderPage sop=new SalesOrderPage(driver);
		sop.getSearchForTextfield().sendKeys(rp.readfrompropfile(AutoConstants.SalesOrderModuleTestDataPropFile, "TC_43Step4"));
		sop.selectFromListOfSearchIn(rp.readfrompropfile(AutoConstants.SalesOrderModuleTestDataPropFile, "TC_43Step5"), sop.getSearchInTextfield());	
	Assert.assertEquals(false, true);
	} 

	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
	Readfrompropfile rp = new	Readfrompropfile();
	ReadfromExcelsheets ex=new ReadfromExcelsheets();
	
	lp.LoginMethod(driver,rp.readfrompropfile(AutoConstants.PropertiesFilePath,"url"),rp.readfrompropfile(AutoConstants.PropertiesFilePath,"username") , rp.readfrompropfile(AutoConstants.PropertiesFilePath,"password"));
	HomePage hp=new HomePage(driver);
	WebDriver_Utility util=new WebDriver_Utility();
	util.moveToElement(driver, hp.getMoreOption());
	hp.getSalesOrderLink().click();
	SalesOrderPage sop=new SalesOrderPage(driver);
	sop.getSearchForTextfield().sendKeys(rp.readfrompropfile(AutoConstants.SalesOrderModuleTestDataPropFile, "TC_43Step4"));
	sop.selectFromListOfSearchIn(rp.readfrompropfile(AutoConstants.SalesOrderModuleTestDataPropFile, "TC_43Step5"), sop.getSearchInTextfield());
	hp.LogoutMethod(driver);
	} */

	}   
 

