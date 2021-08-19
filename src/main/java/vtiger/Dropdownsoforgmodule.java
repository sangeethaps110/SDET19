package vtiger;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.AutoConstants;
import com.generic.Generaterandomnumber;
import com.generic.ReadfromXmlfile;
import com.generic.WebDriver_Utility;

public class Dropdownsoforgmodule {

	public static void main(String[] args) throws DocumentException {
		
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			WebDriver_Utility util=new WebDriver_Utility();
			util.waitImplicitly(driver);
			
			ReadfromXmlfile xml=new ReadfromXmlfile();
			driver.get((xml.readfromxml(AutoConstants.XMLfilePath, "//login/url")));
			
			//driver.get("http://localhost:8888/");
			//driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.TAB,Keys.ENTER);
			driver.findElement(By.name("user_name")).sendKeys((xml.readfromxml(AutoConstants.XMLfilePath, "//login/username")));
			driver.findElement(By.name("user_password")).sendKeys((xml.readfromxml(AutoConstants.XMLfilePath, "//login/password")));
			driver.findElement(By.id("submitButton")).click();
			driver.findElement(By.xpath("//a[text()='Organizations'][1]")).click();
			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			
			Generaterandomnumber r= new Generaterandomnumber();
			int randomnum=r.generaterandomnum();
			String name="Vikramhospital"+ randomnum;
			
			driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(name);
			
			WebElement wb1=driver.findElement(By.xpath("//select[@name='industry']"));
			
			util.Select_DD(wb1, "Healthcare");
			
			/*Select s1=new Select(wb1);
			s1.selectByValue("Healthcare");
			*/
			WebElement wb2=driver.findElement(By.xpath("//select[@name='rating']"));
			util.Select_DD(wb2, "Active");
			/*Select s2=new Select(wb2);
			s2.selectByValue("Active");
			*/
			WebElement wb3=driver.findElement(By.xpath("//select[@name='accounttype']"));
			util.Select_DD(wb3, "Customer");
			/*
			Select s3=new Select(wb3);
			s3.selectByValue("Customer"); */
			
			driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
			
			WebElement logoutIcon=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			util.moveToElement(driver, logoutIcon);
		//	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		}


	}


