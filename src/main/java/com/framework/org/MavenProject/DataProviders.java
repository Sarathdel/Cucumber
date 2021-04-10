package com.framework.org.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProviders {
//	@Test(dataProvider = "test")
//	private void credential(String name, String company) {
//		System.out.println("name = " + name + " " + "company = " + company);
//
//	}

	@DataProvider
	private Object[][] test() {
		return new Object[][] { { "sarth", "Google" }, { "prakash", "facebook" }, { "narain", "Google" },
				{ "aniruth", "wunderbar" }, { "modi", "jiogroup" }, { "vinoth", "GreensTech" }

		};

	}

	@Test(dataProvider = "test")
	private void browserLaunch(String name, String company) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sarath kafir\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement use = driver.findElement(By.xpath("//input[@id='email']"));
		use.sendKeys(name);
		WebElement pas = driver.findElement(By.xpath("//input[@id='pass']"));
		pas.sendKeys(company);

		driver.quit();
	}
}
