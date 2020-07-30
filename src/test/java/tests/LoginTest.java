package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	HomePage homeObject;
	LoginPage loginObject;

	@Test(priority = 0)
	public void Verify_User_Can_Login_Sucssfully() {

		homeObject = new HomePage(driver);
		loginObject = new LoginPage(driver);
		homeObject.click_On_signIn();
		loginObject.enter_email("email@email.com");
		loginObject.enter_password("password");
		loginObject.click_On_SubmitLogin();

	}
	
	@AfterClass
	public void close() {

		// driver.manage().deleteAllCookies();
		 driver.close();

	}

}
