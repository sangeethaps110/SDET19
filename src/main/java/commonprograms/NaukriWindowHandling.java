package commonprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		//String mainid= driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		Iterator<String> itr = allid.iterator();
		while(itr.hasNext())
		{
		String childwindow=	itr.next();
		
		
		driver.switchTo().window(childwindow);
		String title = driver.getTitle();
		System.out.println(title);	
		if(!title.contains("Tech Mahindra"))
		{
			driver.close();
			
		}
	}

}}
