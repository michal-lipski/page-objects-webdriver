
package com.example.pageobjects;

import static com.example.setup.SeleniumDriver.getDriver;

import org.openqa.selenium.support.PageFactory;

/**
 * TODO mlip; javadoc
 *
 * @author mlipski
 */
public abstract class GitHubPage<T> {
	
	private static final String BASE_URL = "https://github.com";
	
	public T openPage(Class<T> clazz) {
		T page = PageFactory.initElements(getDriver(), clazz);
		getDriver().get(BASE_URL + getUrl());
		return page;
	}
	
	public abstract String getUrl();
}
