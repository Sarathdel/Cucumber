package com.framework.org.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Parallel {
	@Test
	private void amazon() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\sarath kafir\\eclipse-workspace\\Seleniumtestexp\\Don\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.instagram.com/");
	}

	@Test
	private void flipkart() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\sarath kafir\\eclipse-workspace\\Seleniumtestexp\\Don\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.flipkart.com/");
	}

	@Test
	private void tnpsc() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\sarath kafir\\eclipse-workspace\\Seleniumtestexp\\Don\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.tnpsc.gov.in/");

	}

	@Test
	private void upsc() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\sarath kafir\\eclipse-workspace\\Seleniumtestexp\\Don\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.upsc.gov.in/");

	}
}
