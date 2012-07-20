/**
 * Copyright 2011 Nokia Siemens Networks 
 */
package com.example.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Page object representing github home page.
 *
 * @author mlipski
 */
public class GitHubHomePage extends GitHubPage<GitHubHomePage> {

	@Override
	protected ExpectedCondition getPageLoadCondition() {
		return ExpectedConditions.titleContains("GitHub · Social Coding");
	}

	@Override
	public String getPageUrl() {
		return "";
	}

	public GitHubLoginPage goToLoginPage() {
		return new GitHubLoginPage().openPage(GitHubLoginPage.class);
	}

	public GitHubHomePage open() {
		return new GitHubHomePage().openPage(GitHubHomePage.class);
	}

}
