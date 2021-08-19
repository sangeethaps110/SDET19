package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OppurtunitiesPage {
OppurtunitiesPage(WebDriver driver)
{
	PageFactory.initElements(driver, OppurtunitiesPage.this);
}
@FindBy(xpath="//img[@alt='Create Opportunity...']")
private WebElement createOppurtunitiesIcon;



}
