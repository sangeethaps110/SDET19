package vtiger;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.Generaterandomnumber;
import com.generic.Readfrompropfile;
import com.generic.WebDriver_Utility;

public class Windowpopupofmemberfieldoforgmodule {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Readfrompropfile prop=new Readfrompropfile();
		WebDriver_Utility util=new WebDriver_Utility();
		
		driver.get(prop.readfrompropfile("../SDET19/datafiles/commonutils.properties","url"));
		
		driver.findElement(By.name("user_name")).sendKeys(prop.readfrompropfile("../SDET19/datafiles/commonutils.properties","username"));
		
		driver.findElement(By.name("user_password")).sendKeys(prop.readfrompropfile("../SDET19/datafiles/commonutils.properties","password"));
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Organizations'][1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		Generaterandomnumber r= new Generaterandomnumber();
		int randomnum=r.generaterandomnum();
		String name="Vikramhospital"+ randomnum;
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(name);
		driver.findElement(By.xpath("//img[@title='Select']")).click();
	//	Set<String> allids=driver.getWindowHandles();
	//	String mainid=driver.getWindowHandle();
		util.switchwindow(driver, "Accounts");
		
		
		driver.findElement(By.id("search_txt")).sendKeys("aaaa");
		
		driver.findElement(By.xpath("//input[@name='search']")).click();
		
		driver.findElement(By.xpath("//a[text()='aaaa']")).click();
		
			util.AcceptAlert(driver);
			
		util.switchwindow(driver, "Administrator");
		
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
	}

}
