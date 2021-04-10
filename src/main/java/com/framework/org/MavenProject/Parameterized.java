package com.framework.org.MavenProject;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized {
	@Test
	@Parameters({ "username", "password" })
	private void credential(@Optional("ram") String username, String password) {
		System.out.println("username=" + username + "password=" + password);
	}
}