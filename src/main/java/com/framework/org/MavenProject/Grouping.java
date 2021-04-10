package com.framework.org.MavenProject;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = "Mobile")
	private void mobileName() {
System.out.println("lenovo");
	}
	@Test(groups = "Mobile")
	private void mobileModel() {
System.out.println("A3150");
	}
@Test(groups = "Laptop")
private void laptopName() {
System.out.println("acwre");
}
@Test(groups = "Laptop")
private void laptopProcessor() {
System.out.println("i4");
}
@Test(groups = "Desktop")
private void desktopName() {
System.out.println("Dell");
}
@Test(groups = "Desktop")
private void desktopPrice() {
System.out.println("20000");
}


}
