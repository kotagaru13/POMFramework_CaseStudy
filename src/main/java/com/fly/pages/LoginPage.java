package com.fly.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// PageFactory Pattern
	@FindBy(xpath = "//a[text()='Login']")
	WebElement clickLogin;
	
	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement pwd;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void login(String strUser, String strPwd) {
		clickLogin.click();
		email.sendKeys(strUser);
		pwd.sendKeys(strPwd);
		loginBtn.click();

	}
}
