package com.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generic.AutoConstants;	
import com.objectrepo.SalesOrderPage;

public class TC_42 extends Baseclass {
@Test
public void SearchinSalesOrderNo() throws IOException
{
	SalesOrderPage sop=new SalesOrderPage(driver);
	sop.SearchSalesOrder(driver,AutoConstants.SalesOrderModuleTestDataPropFile, "TC_42Step4", "TC_42Step5" );
}
	/* 
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
	Readfrompropfile rp = new	Readfrompropfile();

	
	lp.LoginMethod(driver,rp.readfrompropfile(AutoConstants.PropertiesFilePath,"url"),rp.readfrompropfile(AutoConstants.PropertiesFilePath,"username") , rp.readfrompropfile(AutoConstants.PropertiesFilePath,"password"));
	HomePage hp=new HomePage(driver);	
	SalesOrderPage sop=new SalesOrderPage(driver);
	sop.SearchSalesOrder(driver,AutoConstants.SalesOrderModuleTestDataPropFile, "TC_42Step4", "TC_42Step5" );
	hp.LogoutMethod(driver);
	}
	*/

}
