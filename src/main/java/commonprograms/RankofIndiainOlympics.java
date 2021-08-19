package commonprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RankofIndiainOlympics {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://olympics.com/tokyo-2020/olympic-games/en/results/all-sports/medal-standings.htm");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='onetrust-pc-btn-handler']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reject All']")).click();
	}

}
