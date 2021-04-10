package com.framework.org.MavenProject;

import org.testng.annotations.*;

public class SimpleAnnotations {
	@BeforeSuite
	private void goog() {
		System.out.println("google chrome");
	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("chrome");
	}

	@BeforeClass
	private void login() {
		System.out.println("login");
	}

	@BeforeMethod
	private void search() {
		System.out.println("options");
	}

	@Test
	private void searchMobile() {
		System.out.println("search mobile");
	}

	@Test
	private void searchLaptop() {
		System.out.println("search laptop");
	}

	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}

	@AfterClass
	private void verification() {
		System.out.println("verification");
	}

	@AfterTest
	private void close() {
		System.out.println("browser close");
	}

	@AfterSuite
	private void delelteCookies() {
		System.out.println("cookies deleted");
	}
}
