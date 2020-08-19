package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class LoginTest extends BaseTest {
	HomePage homeObject;
	LoginPage loginObject;
	Create_new_user_Test emailobject;
	
	@Test(priority = 0)
	public void UserCanLogInSuccees() {
		
		emailobject=new Create_new_user_Test();
		homeObject = new HomePage(driver);
		loginObject = new LoginPage(driver);
		homeObject.Open_Login_Page();
		//System.out.print("xxxxxxxx"+emailobject.emails);
		loginObject.enter_email("m1@m.com");
		loginObject.enter_password("password");
		loginObject.click_On_SubmitLogin();
		//AssertJUnit.assertTrue(loginObject.get_assertion_sign_out().equalsIgnoreCase("Sign out"));

	}
	
	
	
	
	@AfterClass
	public void close() {
		
		// driver.manage().deleteAllCookies();
		 driver.close();

	}

}
