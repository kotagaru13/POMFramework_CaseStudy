package com.fly.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fly.util.TestBase;

public class NewArticlePage {
	
	@FindBy(name = "title")
	WebElement articleTitle;
	
	@FindBy(xpath = "//input[@class='form-control ']")
	WebElement description;
	
	@FindBy(name = "body")
	WebElement textArea;
	
	@FindBy(xpath = "//button[text()='Publish Article']")
	WebElement clickPublishArticle;
	
	@FindBy(xpath = "//a[text()=' Edit Article']")
	WebElement clickEditArt;
	
	@FindBy(xpath = "//button[text()='Update Article']")
	WebElement clickUpdateArticle;
	
	@FindBy(xpath = "//button[text()=' Delete Article']")
	WebElement clickDeleteArticle;
	
	@FindBy(xpath = "//h1[text() = 'conduit']")
	WebElement HomePage;
	
	public NewArticlePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isOnHomePage() {
		return HomePage.isDisplayed();
	}
	public void enterTitle() {
		String title="Case Study Test";
		articleTitle.sendKeys(title); 
		System.out.println("Entered Article Title = "+title);
	}
	
	public void enterDescription() {
		String disc="About Selenium";
		description.sendKeys(disc);
		System.out.println("Entered Description = "+disc);
	}
	
	public void enterTextArea() {
		String textA="Selenium Training...";
		textArea.sendKeys(textA);
		System.out.println("Enter Text Area = "+textA);
	}
	
	public void buttonPublishArticle() {
		clickPublishArticle.click();
		System.out.println("Publish Article button is clicked");
	}
	public void clickEditArticle() {
		clickEditArt.click();
		System.out.println("Edit Article button is clicked");
	}
	
	public void editTextArea() {
		String editText = "Selenium Training Course Page Edited..";
		textArea.sendKeys(editText);
		System.out.println("Updated Article = "+editText);
	}
	
	public void clickUpdateArt() {
		clickUpdateArticle.click();
		System.out.println("Update Article button is clicked");
	}
	
	public void clickDeleteArt(WebDriver driver) {
		clickDeleteArticle.click();
		TestBase.acceptAlerts();
		System.out.println("Article is deleted successfully..");
	}
	
	
 }
