package com.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.generic.AutoConstants;
import com.generic.Readfrompropfile;
import com.generic.WebDriver_Utility;
import com.objectrepo.HomePage;
import com.objectrepo.LoginPage;

public class Baseclass {
	protected WebDriver driver;
	Readfrompropfile rp = new	Readfrompropfile();
	WebDriver_Utility util=new WebDriver_Utility();
	
	@Parameters("BROWSER")
	@BeforeClass
	//public void LaunchBrowser() throws IOException
	public void LaunchBrowser(String BROWSER) throws IOException
	{
		//if((rp.readfrompropfile(AutoConstants.PropertiesFilePath,"browser").equalsIgnoreCase("chrome")))
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		} 
		if(BROWSER.equalsIgnoreCase("chrome"))
		//else if(rp.readfrompropfile(AutoConstants.PropertiesFilePath,"browser").equalsIgnoreCase("chrome"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("launching failed");
		}

		driver.manage().window().maximize();
		util.waitImplicitly(driver);
		util.waitForPageLoad(driver);

	}
	@BeforeMethod
	public void Login() throws IOException 
	{
		LoginPage lp=new LoginPage(driver);
		lp.LoginMethod(driver, rp.readfrompropfile(AutoConstants.PropertiesFilePath, "url"), rp.readfrompropfile(AutoConstants.PropertiesFilePath, "username") ,  rp.readfrompropfile(AutoConstants.PropertiesFilePath, "password"));

	}
	@AfterMethod
	public void Logout()
	{
		HomePage hp=new HomePage(driver);
		hp.LogoutMethod(driver);
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}
}
