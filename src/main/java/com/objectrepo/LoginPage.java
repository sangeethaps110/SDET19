 package com.objectrepo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, LoginPage.this);
	}
	@FindBy(name="user_name")
	private WebElement userNameTextField;
	
	
	public WebElement getUserNameTextField()
	{
		return userNameTextField;
	}
	
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	

	public WebElement getPasswordTextField()
	{
		return passwordTextField;
	}
	
	@FindBy(id="submitButton")
	private WebElement loginButton;


	public WebElement getLoginButton()
	{
		return loginButton;
	}
	
	
	
	public void LoginMethod(WebDriver driver,String url,String username,String password) throws IOException
	{
		driver.get(url);
		getUserNameTextField().sendKeys(username);
		getPasswordTextField().sendKeys(password);
		getLoginButton().click();
	}
}
