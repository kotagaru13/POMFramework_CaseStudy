package com.fly.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fly.pages.HomePage;
import com.fly.pages.LoginPage;
import com.fly.pages.NewArticlePage;
import com.fly.util.TestBase;

public class ArticleTest {
	
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	NewArticlePage newArticlePage;
	
	public ArticleTest() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		newArticlePage = new NewArticlePage(driver);
	}
	
	@BeforeTest
	public void setup() {
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/");
		 loginPage.login("kotachandu13@gmail.com", "Kotirathnam_13");
	}
	
	@Test
	public void validEditArticle() throws InterruptedException {
		Thread.sleep(3000);
		homePage.clickNewArticle();
		newArticlePage.enterTitle();
		
		Thread.sleep(3000);
		newArticlePage.enterDescription();
		
		Thread.sleep(3000);
		newArticlePage.enterTextArea();
		
		Thread.sleep(3000);
		newArticlePage.buttonPublishArticle();
		
		Thread.sleep(3000);
		newArticlePage.clickEditArticle();
		
		Thread.sleep(3000);
		newArticlePage.editTextArea();
		
		Thread.sleep(3000);
		newArticlePage.clickUpdateArt();
		
		Thread.sleep(3000);
		newArticlePage.clickDeleteArt(driver);
	}
	
	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
