package com.framework.org.MavenProject;

import org.testng.annotations.Test;

public class Assert {
	@Test
	private void test() {
		String actual = "Sarath";
		String expected = "sarath";
		//org.testng.Assert.assertEquals(actual, expected);
		org.testng.Assert.assertNotEquals(actual, expected);
	}

}
