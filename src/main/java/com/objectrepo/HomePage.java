 package com.objectrepo;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.WebDriver_Utility;

public class HomePage 
{
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, HomePage.this);
	}
	
	WebDriver_Utility util=new WebDriver_Utility();
	
	@FindBy(xpath="//input[@class='searchBox']")
	private WebElement searchTextField;

	public WebElement getSearchTextField()
	{
		return searchTextField;
	}
	
	
	
	
	@FindBy(xpath="//input[@class='searchBtn']")
	private WebElement searchButton;

	public WebElement getSearchButton()
	{
		return searchButton;
	}
	
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement organizationLink;

	public WebElement getOrganizationLink()
	{
		return organizationLink;
	}
	
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorSignoutIcon;

	public WebElement getAdministratorSignoutIcon()
	{
		return administratorSignoutIcon;
	}
	
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutLink;

	public WebElement getSignoutLink()
	{
		return signoutLink;
	}
	@FindBy(xpath="//a[text()='More']")
	private WebElement moreOption;
	
	
	public WebElement getMoreOption() {
		return moreOption;
	}
	@FindBy(xpath="//a[text()='Opportunities']")
	private WebElement OppurtunitiesLink;


	public WebElement getOppurtunitiesLink() {
		return OppurtunitiesLink;
	}

	public void LogoutMethod(WebDriver driver)
	{
	util.moveToElement(driver, getAdministratorSignoutIcon());	
	//util.waitUntilElementisClickable(driver, getSignoutLink());
	getSignoutLink().click();
	}

	@FindBy(xpath="//a[text()='Sales Order']")
	private WebElement salesOrderLink;

	public WebElement getSalesOrderLink() {
		return salesOrderLink;
	}
	
	
	
}
