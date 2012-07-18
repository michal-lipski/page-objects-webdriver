package com.example.pageobjects;

import static com.example.setup.SeleniumDriver.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page object representing github login page.
 */
public class GitHubLoginPage extends GitHubPage<GitHubLoginPage> {

	@FindBy(id = "login_field")
	WebElement loginField;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(name = "commit")
	WebElement commitButton;

	@FindBy(className = "error_box")
	WebElement errorBox;

	@Override
	public String getUrl() {
		return "/login";
	}

	public void login(String login, String password) {
		loginField.sendKeys(login);
		passwordField.sendKeys(password);
		commitButton.click();

	}

	public boolean isLoginError() {
		return errorBox.isDisplayed();
	}

	public String getErrorMessage() {
		return errorBox.getText();
	}
}