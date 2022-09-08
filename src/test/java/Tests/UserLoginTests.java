package Tests;

import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import testBase.TestBase;

@Test
public class UserLoginTests extends TestBase{
	LoginPageObjects loginPage = new LoginPageObjects();
	

	public void ManagerLoginTest() throws Throwable {
		
		loginPage.login("nikhil123@mailinator.com", "123456");
		Thread.sleep(2000); ////// not required, adding just to see tests are running in parallel
		assertEqualsString_custom("My Account – Wellnessy Official", "My Account – Wellnessy Official", "LoginPageHomePage");
	}

}
