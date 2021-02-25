package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTextUserName() {
		return textUserName;
	}

	public WebElement getTextPassword() {
		return TextPassword;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	@FindBy(id="username")
	private WebElement textUserName;
	
	@FindBy(id="password")
	private WebElement TextPassword;
	
	@FindBy(id="login")
	private WebElement loginBtn;
}
