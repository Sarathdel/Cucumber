package com.framework.org.MavenProject;

import org.testng.annotations.Test;

public class Timeout {
	@Test
	private void amazon() {
		System.out.println("chocolate");
	}

	@Test(timeOut = 3000)
	private void flipkart() throws InterruptedException {
		Thread.sleep(5000);
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
