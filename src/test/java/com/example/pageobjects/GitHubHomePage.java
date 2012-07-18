/**
 * Copyright 2011 Nokia Siemens Networks 
 */
package com.example.pageobjects;

/**
 * Page object representing github home page.
 *
 * @author mlipski
 */
public class GitHubHomePage extends GitHubPage<GitHubHomePage> {

	@Override
	public String getUrl() {
		return "";
	}

	public GitHubLoginPage goToLoginPage() {
		return new GitHubLoginPage().openPage(GitHubLoginPage.class);
	}

	public GitHubHomePage open() {
		return new GitHubHomePage().openPage(GitHubHomePage.class);
	}


}
