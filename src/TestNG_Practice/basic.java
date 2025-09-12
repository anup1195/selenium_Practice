package TestNG_Practice;

import org.testng.annotations.Test;

public class basic {

	@Test(priority=1)
	void openbrowser() {

		System.out.println("first open the browser");
	}

	@Test(priority=2)
	void hiturl() {

		System.out.println("Hit url");
	}

	@Test(priority=3)
	void login() {

		System.out.println("login");
	}

	@Test(priority=4)
	void homepage() {

		System.out.println("land on homepage");
	}
}
