package commonprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
	//	WebDriver_Utility util=new WebDriver_Utility();
		WebElement source=driver.findElement(By.xpath("//div[@id='loanamountslider']//span"));
		
 		
	
	//	WebElement dest=driver.findElement(By.xpath(""));
	//	Actions act=new Actions(driver);
	//	act.dragAndDrop(source, dest);
		Point p1=source.getLocation();
		int x=p1.getX();
//		int y=p1.getY();
		System.out.println(x);
		//act.clickAndHold()
		
		
	}

}
