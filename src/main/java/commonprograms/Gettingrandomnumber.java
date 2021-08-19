package commonprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.Generaterandomnumber;

public class Gettingrandomnumber extends Generaterandomnumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.TAB,Keys.ENTER);

		driver.findElement(By.xpath("//a[text()='Organizations'][1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Generaterandomnumber r= new Generaterandomnumber();
		int randomnum=r.generaterandomnum();
		String name="Vikramhospital"+ randomnum;
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(name);
	}

}
