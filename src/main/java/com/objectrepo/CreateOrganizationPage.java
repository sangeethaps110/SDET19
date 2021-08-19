package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {

	public CreateOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, CreateOrganizationPage.this);
	}
	@FindBy(xpath="//input[@style='width:74%;']")
	private WebElement websiteTextField;
	
	public WebElement getWebsiteTextField()
	{
		return websiteTextField;
	}
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement OrganizationNameTextField;

	public WebElement getOrganizationNameTextField() {
		return OrganizationNameTextField;
	}
		@FindBy(id="phone")
		private WebElement phoneTextField;

		public WebElement getPhoneTextField()
		{
			return phoneTextField;
		}
		
		@FindBy(xpath="//input[@name='tickersymbol']")
		private WebElement tickerSymbolTextField;

		public WebElement getTickerSymbolTextField() 
		{
			return tickerSymbolTextField;
		}
		@FindBy(xpath="//input[@name='fax']")
		private WebElement faxTextField;

		public WebElement getFaxTextField() {
			return faxTextField;
		}
		
		@FindBy(xpath="//img[@alt='Select']")
		private WebElement plusIconofMemberOfField;

		public WebElement getPlusIconofMemberOfField() {
			return plusIconofMemberOfField;
		}

		@FindBy(xpath="//input[@alt='Clear']")
		private WebElement clearIconofMemberOfField;

		public WebElement getClearIconofMemberOfField() {
			return clearIconofMemberOfField;
		}

		@FindBy(xpath="//input[@id='otherphone']")
		private WebElement otherPhoneTextField;

		public WebElement getOtherPhoneTextField() {
			return otherPhoneTextField;
		}
		@FindBy(xpath="//input[@id='employees']")
		private WebElement employeesTextField;

		public WebElement getEmployeesTextField()
	{
			return employeesTextField;
		}

		@FindBy(xpath="//input[@id='email1']")
		private WebElement emailTextField;

		public WebElement getEmailTextField()
		{
			return emailTextField;
		}
		@FindBy(xpath="//input[@id='email2']")
		private WebElement otherEmailTextField;

		public WebElement getOtherEmailTextField() {
			return otherEmailTextField;
		}
		
		@FindBy(xpath="//input[@id='ownership']")
		private WebElement ownershipTextField;

		public WebElement getOwnershipTextField() {
			return ownershipTextField;
		}

		@FindBy(xpath="//input[@id='siccode']")
		private WebElement siccodeTextField;

		public WebElement getSiccodeTextField() {
			return siccodeTextField;
		}
		@FindBy(xpath="//input[@name='annual_revenue']")
		private WebElement annualRevenueTextField;

		public WebElement getAnnualRevenueTextField() {
			return annualRevenueTextField;
		}

		@FindBy(xpath="//input[@name='notify_owner']")
		private WebElement notifyOwnerCheckBox;

		public WebElement getNotifyOwnerCheckBox() {
			return notifyOwnerCheckBox;
		}
		@FindBy(xpath="//input[@onclick='return copyAddressRight(EditView)']")
		private WebElement copyBillingAddressCheckBox;

		public WebElement getCopyBillingAddressCheckBox() {
			return copyBillingAddressCheckBox;
		}
		@FindBy(xpath="//textarea[@name='description']")
		private WebElement descriptionTextField;

		public WebElement getDescriptionTextField() {
			return descriptionTextField;
		}
		@FindBy(xpath=" //input[@title='Save [Alt+S]']")
		private WebElement saveButton;

		public WebElement getSaveButton() {
			return saveButton;
		}
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement cancelButton;
		
	
		
}

		
	
		
		
		
	
		
	

	

