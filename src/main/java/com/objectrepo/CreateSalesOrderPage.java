package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateSalesOrderPage {
	public CreateSalesOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, CreateSalesOrderPage.this);
	}
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjectTextField;

	public WebElement getSubjectTextField() {
		return subjectTextField;
	}
	@FindBy(xpath="return window.open(\"index.php?module=Accounts&action=Popup&popuptype=specific_account_address&form=TasksEditView&form_submit=false&fromlink=\",\"test\",\"width=640,height=602,resizable=0,scrollbars=0\");")
	private WebElement OrganizationLookupImage;

	public WebElement getOrganizationLookupImage() {
		return OrganizationLookupImage;
	}
	

	
}
