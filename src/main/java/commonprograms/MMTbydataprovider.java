package commonprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MMTbydataprovider {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test(dataProvider="getvalue")
	public void chooseCities(String Source,String Destination)
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions action = new Actions(driver);
		action.moveByOffset(10, 10).click().perform();
		driver.findElement(By.id("fromCity")).sendKeys(Source);
		driver.findElement(By.xpath("//div[text()='"+Source+"']")).click();

		driver.findElement(By.id("toCity")).sendKeys(Destination);
		driver.findElement(By.xpath("//div[text()='"+Destination+"']")).click();
		
		driver.close();
	}
	@DataProvider
	public Object[][] getvalue()
	{
		Object[][] arr=new Object[3][2];
		arr[0][0]="BLR";
		arr[0][1]="GOI";
		arr[1][0]="HYD";
		arr[1][1]="CCU";
		arr[2][0]="MAA";
		arr[2][1]="BLR";
		return arr;
	}

}
