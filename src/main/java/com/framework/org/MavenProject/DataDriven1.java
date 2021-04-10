package com.framework.org.MavenProject;

import org.openqa.selenium.By;

public class DataDriven1 extends BaseClas {
	public static void main(String[] args) {
		browserLaunch("chrome");
		getUrl("https://www.facebook.com/");
		driver.findElement(By.id("email"));
	}

}
