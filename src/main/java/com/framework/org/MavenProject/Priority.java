package com.framework.org.MavenProject;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = -3)
	private void amazon() {
		System.out.println("chocolate");
	}

	@Test(priority = 0)
	private void flipkart() {
		System.out.println("toys");
	}

	@Test(priority = -4)
	private void freekart() {
		System.out.println("versio 2.o");
	}

	@Test(priority = 1)
	private void ultra() {
		System.out.println("ultra legend");
	}

}
