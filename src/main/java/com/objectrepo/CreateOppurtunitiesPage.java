package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOppurtunitiesPage {
	CreateOppurtunitiesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, CreateOppurtunitiesPage.this);
	}
	@FindBy(xpath="//input[@name='potentialname']")
	private WebElement OppurtunityName;
	public WebElement getOppurtunityName() {
		return OppurtunityName;
	}
	@FindBy(xpath="//input[@name='amount']")
	private WebElement amountTextField;
	public WebElement getAmountTextField() {
		return amountTextField;
		}
	@FindBy(xpath="//input[@nextstep']")
	private WebElement nextStepTextField;
	public WebElement getNextStepTextField() {
		return nextStepTextField;
	}
	@FindBy(xpath="//input='probability']")
	private WebElement probablityTextField;
		//probability
	public WebElement getProbablityTextField() {
		return probablityTextField;
	}
	@FindBy(xpath="//input='description']")
	private WebElement DescriptionTextField;
	public WebElement getDescriptionTextField() {
		return DescriptionTextField;
	}
	@FindBy(xpath="//input='//img[@onclick='return window.open(\"index.php?module=\"+ document.EditView.related_to_type.value +\"&action=Popup&html=Popup_picker&form=vtlibPopupView&forfield=related_to&srcmodule=Potentials&forrecord=\",\"test\",\"width=640,height=602,resizable=0,scrollbars=0,top=150,left=200\");']']")
	private WebElement relatedToLookUpImage;
	public WebElement getRelatedToLookUpImage() {
		return relatedToLookUpImage;
	}
	
}


