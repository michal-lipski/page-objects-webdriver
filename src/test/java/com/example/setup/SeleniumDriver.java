/**
 * Copyright 2011 Nokia Siemens Networks 
 */
package com.example.setup;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Selenium driver wrapper
 *
 * @author mlipski
 */
public class SeleniumDriver {

	static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			driver = new FirefoxDriver();	//can be replaced with HtmlUnitDriver for better performance
		}
		return driver;
	}

}
