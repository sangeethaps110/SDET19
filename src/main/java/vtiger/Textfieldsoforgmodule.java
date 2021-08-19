package vtiger;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.Generaterandomnumber;
import com.generic.Readfrompropfile;

public class Textfieldsoforgmodule {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Readfrompropfile prop=new Readfrompropfile();
		
		
		driver.get(prop.readfrompropfile("../SDET19/datafiles/commonutils.properties","url"));
		
		driver.findElement(By.name("user_name")).sendKeys(prop.readfrompropfile("../SDET19/datafiles/commonutils.properties","username"));
		
		driver.findElement(By.name("user_password")).sendKeys(prop.readfrompropfile("../SDET19/datafiles/commonutils.properties","password"));
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
		driver.findElement(By.xpath("//input[@name='annual_revenue']")).sendKeys("16cr");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("******");
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
	}


	}


