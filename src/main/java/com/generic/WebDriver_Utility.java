package com.generic;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utility {
/**
 * Method to select by index from a dropdown
 *@author Sangeetha
 * @param list
 * @param index
 */
	public void Select_DD(WebElement list, int index)
	{
		Select s=new Select(list);
		s.selectByIndex(index);
	}
	
	
/**
 * Method to select by value from a dropdown
 *@author Sangeetha
 * @param list
 * @param value
 */
	public void Select_DD(WebElement list, String value)
	{
		Select s=new Select(list);
		s.selectByValue(value);
	}
	
/**
 * Method to select by visibletext from a dropdown
 *@author Sangeetha
* @param text
* @param list
*/
	public void Select_DD( String text,WebElement list)
	{
		Select s=new Select(list);
		s.selectByVisibleText(text);
	}
	
	
	
/**
 * Method to switch frame by index
 * @author Sangeetha	
 * @param driver
 * @param index
 */
	
	public void switchframe(WebDriver driver, int index) 
	{
		driver.switchTo().frame(index);
	}
	/**
	 * Method to switch frame by name or id attribute
	 * @author Sangeetha	
	 * @param driver
	 * @param nameorId
	 */
	public void switchframe(WebDriver driver,String nameorId) 
	{
		driver.switchTo().frame(nameorId);
	}
	
	/**
	 * Method to switch frame by WebElement
	 * @author Sangeetha	
	 * @param driver
	 * @param element
	 */
	public void switchframe(WebDriver driver,WebElement element) 
	{
		driver.switchTo().frame(element);
	}

/**
 * Method to switch to a window of particular title
 * @author Sangeetha
 * @param driver
 * @param title
 */
	public void switchwindow(WebDriver driver,String title)
	{
		Set<String> childwindowID=driver.getWindowHandles();
		/*Iterator<String> iterator=childwindowID.iterator();

		while(iterator.hasNext()) 
		{
			String window=iterator.next();
			String currenttitle= driver.switchTo().window(window).getTitle();
			if(currenttitle.contains(title)) 
			{	
				
				break;
			}

		} */
	
		for(String ID:childwindowID)
		{
			String CurrentTitle=driver.switchTo().window(ID).getTitle();
			if(CurrentTitle.contains(title))
			{
				break;		
			}
			
		}
	
	}
	/**
	 * @author Sangeetha
	 * Method for implicit wait
	 * @param driver
	 */
	
	public void waitImplicitly(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(AutoConstants.implicitWait, TimeUnit.SECONDS);
	}
	
	/**
	 * Method for explicit wait for visibility of a WebElement 
	 * @author sangeetha
	 * @param driver
	 * @param element
	 */
	
	public void waitUntilElementisVisisible(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,AutoConstants.explicitWait);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	/**
	 * Method for explicit wait for an element to become clickable
	 * @param driver
	 * @param element
	 */
	
	public void waitUntilElementisClickable(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,AutoConstants.explicitWait);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * Wait for the entire Page to get loaded
	 * @author sangeetha
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().pageLoadTimeout(AutoConstants.pageLoadWait, TimeUnit.SECONDS);
	}
	
	/**
	 * Method to move to a particular WebElement
	 * @author sangeetha
	 * @param driver
	 * @param element
	 */
	public void moveToElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * Method to right click on a particular WebElement
	 * @author sangeetha
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * Method to double click on a particular WebElement
	 * @author sangeetha
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element);
	}
	/**
	 * Method to accept an alert message
	 * @author Sangeetha
	 * @param driver
	 */
	
	public void AcceptAlert(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	/**
	 * Method to dissmis an alert
	 * @author Sangeetha
	 * @param driver
	 */
	
	public void DismissAlert(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	/**
	 * Method to fetch the alert message
	 * @author Sangeetha
	 * @param driver
	 */
	
	public String GetTextOfAlert(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		String Alertmessage=alt.getText();
		return Alertmessage;
	}
	
}










