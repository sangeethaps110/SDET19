package commonprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScenario {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	//	WebDriver_Utility util=new WebDriver_Utility();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles under 15000");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//div[@id='brandsRefinements']/descendant::li[@aria-label='Redmi']//a//div")).click();
		driver.findElement(By.id("a-autoid-0-announce")).click();
		
		List<WebElement> listSortBy=driver.findElements(By.xpath("//li[@role='option']"));
		for(WebElement wb:listSortBy)
		{
			if(wb.getText().contains("High to Low"))
			{
				wb.click();
				break;
			}
		} 
	String price=driver.findElement(By.xpath("//div[@data-index='0']/descendant::span[@class='a-price-whole']")).getText();
	System.out.println("price of 1st product -"+ price);
	

	 
	String charToBeRemoved=","+"";
	String priceamount=price.replace(charToBeRemoved,"");
	

	int priceint =Integer.parseInt(priceamount);
	if(priceint<15000)
	{
		System.out.println("testcase passed");
	}
	else
	{
		System.out.println("Testcase failed");
	} 
	/*StringBuffer sb=new StringBuffer(price);
	sb.delete(2, 3);
	System.out.println(sb);  */
	
	}

}