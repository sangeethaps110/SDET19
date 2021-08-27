package com.Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.generic.AutoConstants;
import com.generic.Readfrompropfile;
import com.generic.WebDriver_Utility;
import com.objectrepo.HomePage;
import com.objectrepo.LoginPage;

/*import com.generic.AutoConstants;
import com.generic.Readfrompropfile;
import com.generic.WebDriver_Utility;
import com.objectrepo.HomePage;
import com.objectrepo.LoginPage; */

public class Baseclass {
	protected  WebDriver driver;
public	static WebDriver staticdriver;
	Readfrompropfile rp = new	Readfrompropfile();
	WebDriver_Utility util=new WebDriver_Utility();
	
	//@Parameters("BROWSER")
	@BeforeClass(groups= {"smoke test","regression test","practice"})
	public void LaunchBrowser() throws IOException
//	public void LaunchBrowser(String BROWSER) throws IOException
	{
	if((rp.readfrompropfile(AutoConstants.PropertiesFilePath,"browser").equalsIgnoreCase("chrome")))
	//	String browser=System.getProperty("browser");
		// (browser.equalsIgnoreCase("chrome"))
		
		{
			driver=new ChromeDriver();
		}
	//kk 
		//if(BROWSER.equalsIgnoreCase("chrome"))
		else if(rp.readfrompropfile(AutoConstants.PropertiesFilePath,"browser").equalsIgnoreCase("chrome"))
		//else if(browser.equalsIgnoreCase("firefox"))
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
		staticdriver=driver;

	}
	@BeforeMethod(groups= {"smoke test","regression test","practice"})
	public void Login() throws IOException 
	{
		LoginPage lp=new LoginPage(driver);
		lp.LoginMethod(driver, rp.readfrompropfile(AutoConstants.PropertiesFilePath, "url"), rp.readfrompropfile(AutoConstants.PropertiesFilePath, "username") ,  rp.readfrompropfile(AutoConstants.PropertiesFilePath, "password"));

	}
	@AfterMethod(groups= {"smoke test","regression test","practice"})
	public void Logout()
	{
		HomePage hp=new HomePage(driver);
		hp.LogoutMethod(driver);
	}
	@AfterClass(groups= {"smoke test","regression test","practice"})
	public void CloseBrowser()
	{
		driver.quit();
	}
	public static String getScreenshot(String name) throws IOException
	{
		File srcfile=((TakesScreenshot)staticdriver).getScreenshotAs(OutputType.FILE);
		String destfile=System.getProperty("user.dir")+"/Screenshots/"+ name +" .png";
		File finaldest=new File(destfile);
		FileUtils.copyFile(srcfile, finaldest);
		return destfile;
	}
	
}
