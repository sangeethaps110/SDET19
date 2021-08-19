

package commonprograms;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.AutoConstants;
import com.generic.Readfrompropfile;
import com.objectrepo.HomePage;

public class Windowhandlingofvtiger {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Readfrompropfile prop=new Readfrompropfile();
		
		
		driver.get(prop.readfrompropfile(AutoConstants.PropertiesFilePath,"url"));
		
	//	LoginPage lp=new LoginPage(driver);
		//driver.findElement(By.name("user_name")).sendKeys(prop.readfrompropfile("../SDET19/datafiles/commonutils.properties","username"));
		//lp.LoginMethod(prop.readfrompropfile(AutoConstants.PropertiesFilePath,"username"), prop.readfrompropfile(AutoConstants.PropertiesFilePath,"password"));
		/*driver.findElement(By.name("user_password")).sendKeys(prop.readfrompropfile("../SDET19/datafiles/commonutils.properties","password"));
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Organizations'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		WebDrive_Utility util=new WebDrive_Utility();
		util.switchwindow(driver, "Accounts");
		Thread.sleep(2000);
		
		driver.findElement(By.id("search_txt")).sendKeys("aaaa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='aaaa']")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println("ALERT MESSAGE-->"+alt.getText());
		alt.accept(); */
		HomePage hp=new HomePage(driver);
		hp.LogoutMethod(driver);

		
	
	}

}
