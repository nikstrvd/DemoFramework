package pageObjects;


import org.openqa.selenium.By;

import testBase.DriverFactory;
import testBase.TestBase;

public class LoginPageObjects extends TestBase  {

	//By User_Icon = By.xpath("//a[@href='/my-account/edit-account/']//i[@class='fal fa-user']");
	By EMAIL = By.name("text-1");
	By PASSWORD = By.name("password-1");
	By LOGIN_BTN = By.xpath("//button[normalize-space()='Login']");


	//login to App
	public void login(String email, String password) {
		//click_custom(DriverFactory.getInstance().getDriver().findElement(User_Icon), "UserIconButton");
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(EMAIL), "LoginEmailFIeld", email);
		sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(PASSWORD), "LoginPasswordFIeld", password);

		click_custom(DriverFactory.getInstance().getDriver().findElement(LOGIN_BTN), "LoginButton");

	}


}


