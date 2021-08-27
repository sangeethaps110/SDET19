package vtiger;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.generic.AutoConstants;
import com.generic.Generaterandomnumber;
import com.generic.Readfrompropfile;
import com.objectrepo.HomePage;

public class Textfieldsoforgmodule {
	@Test
public void Textfieldsoforgmodule() throws IOException, InterruptedException {
//	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Readfrompropfile prop=new Readfrompropfile();
		
		
		driver.get(prop.readfrompropfile(AutoConstants.PropertiesFilePath,"url"));
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Organizations'][1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@style='width:74%;']")).sendKeys("www.vikramhospital.com");
		
		Generaterandomnumber r= new Generaterandomnumber();
		int randomnum=r.generaterandomnum();
		String name="Vikramhospital"+ randomnum;
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(name);
		driver.findElement(By.id("phone")).sendKeys("0487-2335566");
		driver.findElement(By.xpath("//input[@name='tickersymbol']")).sendKeys("VH");
		driver.findElement(By.xpath("//input[@id='fax']")).sendKeys("0552-534325");
		driver.findElement(By.xpath("//input[@style='border:1px solid #bababa;']")).sendKeys("multiples");
		driver.findElement(By.id("otherphone")).sendKeys("0552-534325");
		driver.findElement(By.id("employees")).sendKeys("55");
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("vikram_hospital1@gmail.com");
		driver.findElement(By.xpath("//input[@id='email2']")).sendKeys("vikram_hospital2@gmail.com");
		driver.findElement(By.id("ownership")).sendKeys("multiples");
		driver.findElement(By.id("siccode")).sendKeys("0552");
		//driver.findElement(By.xpath("//input[@name='annual_revenue']")).sendKeys("16cr");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("******");
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		Thread.sleep(2000);
		String actualname=driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
	Assert.assertEquals(actualname, "jedjkb","'test is failed!!!!!!'");
		//SoftAssert s=new SoftAssert();
		//s.assertEquals(actualname, "vvv", "'testcase is fail'");
		
		//s.assertEquals(actualname, "jsbjs","failed");
		HomePage hp=new HomePage(driver);
		hp.LogoutMethod(driver);
		//s.assertAll();
}
	} 


	


