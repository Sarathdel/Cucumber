package com.framework.org.MavenProject;

import org.testng.annotations.Test;

public class Multiple {
	@Test
	private void amazon() {
		System.out.println("chocolate");
	}

	@Test(invocationCount = 5)
	private void flipkart() {
		System.out.println("toys");
	}

	@Test
	private void freekart() {
		System.out.println("versio 2.o");
	}

	@Test
	private void ultra() {
		System.out.println("ultra legend");
	}

}
