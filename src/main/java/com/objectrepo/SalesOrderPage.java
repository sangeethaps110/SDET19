package com.objectrepo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.Readfrompropfile;
import com.generic.WebDriver_Utility;

public class SalesOrderPage {
	public SalesOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, SalesOrderPage.this);
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement CreateSalesOrderIcon; 

	public WebElement getCreateSalesOrderIcon() {
		return CreateSalesOrderIcon;
	}
		@FindBy(xpath="//input[@name='search_text']")
		private WebElement searchForTextfield;

		public WebElement getSearchForTextfield() {
			return searchForTextfield;
		}	

		@FindBy(xpath="//select[@id='bas_searchfield']")
		private WebElement searchInTextfield;

		public WebElement getSearchInTextfield() {
			return searchInTextfield;
		}
		@FindBy(xpath="//select[@id='bas_searchfield']")
		private WebElement searchInTextfie;
		
		public void selectFromListOfSearchIn(String text,WebElement list)
		{
			WebDriver_Utility util=new WebDriver_Utility();
			util.Select_DD(text, list);
		}
		
		@FindBy(xpath="//input[@name='submit']")
		private WebElement searchNowButton;

		public WebElement getSearchNowButton() {
			return searchNowButton;
		}
		public void SearchSalesOrder(WebDriver driver,String SalesOrderTestDataPropFilePath,String Key1,String Key2) throws IOException
		{
			Readfrompropfile rp = new	Readfrompropfile();
		HomePage hp=new HomePage(driver);
		WebDriver_Utility util=new WebDriver_Utility();
		util.moveToElement(driver, hp.getMoreOption());
		hp.getSalesOrderLink().click();
		SalesOrderPage sop=new SalesOrderPage(driver);
		sop.getSearchForTextfield().sendKeys(rp.readfrompropfile(SalesOrderTestDataPropFilePath, Key1));
		sop.selectFromListOfSearchIn(rp.readfrompropfile(SalesOrderTestDataPropFilePath, Key2), sop.getSearchInTextfield());
		}
		}
	

