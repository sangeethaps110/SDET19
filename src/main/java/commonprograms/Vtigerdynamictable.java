package commonprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigerdynamictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("http://localhost:8888/");

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");

		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
		
		 
	}

}
