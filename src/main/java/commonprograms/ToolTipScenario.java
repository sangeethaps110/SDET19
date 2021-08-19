package commonprograms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.AutoConstants;
import com.generic.Readfrompropfile;
import com.objectrepo.LoginPage;

public class ToolTipScenario {

	
		public static void main(String[] args) throws IOException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			LoginPage lp=new LoginPage(driver);
			Readfrompropfile rp = new	Readfrompropfile();
			lp.LoginMethod(driver,rp.readfrompropfile(AutoConstants.PropertiesFilePath,"url"),rp.readfrompropfile(AutoConstants.PropertiesFilePath,"username") , rp.readfrompropfile(AutoConstants.PropertiesFilePath,"password"));
		WebElement wb=driver.findElement(By.xpath("//img[@alt='Show World Clock...']"));
		System.out.println(wb.getAttribute("title"));
	}

}
