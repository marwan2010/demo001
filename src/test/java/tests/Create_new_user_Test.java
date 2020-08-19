package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import pages.HomePage;
import pages.RegistrationPage;
import pages.Validation_Message;
import utility.JavaFakerAPI;

public class Create_new_user_Test extends BaseTest {
	HomePage homeObject;
	RegistrationPage registerObject;
	Validation_Message validtionObject;
	JavaFakerAPI jf;
	String emails=null;

	@BeforeMethod
	public void setup() {
	//	driver.manage().deleteAllCookies();
		homeObject = new HomePage(driver);
		registerObject = new RegistrationPage(driver);
		validtionObject = new Validation_Message(driver);
		jf = new JavaFakerAPI();

	}

	@Test(priority = 0)
	public void Verify_authentication_Page() {
		homeObject.Open_Rigester_Page();
		AssertJUnit.assertTrue(registerObject.submitCreate_btn.isDisplayed());
	}

	@Test(priority = 1)
	public void invalidEmailTest() {
		homeObject = new HomePage(driver);
		homeObject.Open_Rigester_Page();
		// without entering email
		registerObject.click_On_SubmitCreate();
		AssertJUnit.assertTrue(validtionObject.getEmailErrorMessage());

		// entering wrong email format
		registerObject.enter_email("test@email");
		registerObject.click_On_SubmitCreate();
		AssertJUnit.assertTrue(validtionObject.getEmailErrorMessage());

		// Registered email before
		registerObject.enter_email("email@email.com");
		registerObject.click_On_SubmitCreate();
		AssertJUnit.assertTrue(validtionObject.getEmailRegistredMessage());

		

	}
	
	@Test(priority = 2)
	
	public void Register_as_Correct_Emails()
	{
		// entring Correct email
				registerObject.enter_email(jf.getEmailID());
				registerObject.click_On_SubmitCreate();
				AssertJUnit.assertTrue(validtionObject.get_title_heading());
	}

	@Test(priority = 3)
	public void Verify_mandatory_personal_info_fields() {
		// submit without data
		registerObject.enterName("");
		registerObject.enter_lastName("");
		registerObject.enter_password("");
		registerObject.enter_address1("");
		registerObject.enter_city("");
		registerObject.enter_postcode("");
		registerObject.enter_Phone_number("");

		// registerObject.select_state_via_Dropdown("-");
		registerObject.click_On_Rigester_Account_btn();
		AssertJUnit.assertTrue(validtionObject.get_require_message_fname());
		AssertJUnit.assertTrue(validtionObject.get_require_message_lname());
		AssertJUnit.assertTrue(validtionObject.get_require_message_password());
		AssertJUnit.assertTrue(validtionObject.get_invalid_message_address1());
		AssertJUnit.assertTrue(validtionObject.get_invalid_message_city());
		AssertJUnit.assertTrue(validtionObject.get_invalid_message_country());
		AssertJUnit.assertTrue(validtionObject.get_require_message_mobile());
		AssertJUnit.assertTrue(validtionObject.get_invalid_message_zipcode());

		

	}

	@Test(priority = 4)
	public void Verify_personal_info_invalid_fields() {

		// submit wrong format data
		registerObject.enter_updated_email("email.com");
		registerObject.enter_mobile_number("mobile0100");
		registerObject.enter_postcode("abccds");
		registerObject.click_On_Rigester_Account_btn();
		AssertJUnit.assertTrue(validtionObject.get_invalid_message_email());
		AssertJUnit.assertTrue(validtionObject.get_invalid_message_mobile());
		AssertJUnit.assertTrue(validtionObject.get_invalid_message_zipcode());

	}

	@Test(priority = 5)
	public void Verify_Personal_info_valid_fields( ) {
		 // Registration with all valid data
          emails="m4@m.com";
		registerObject.enterName(jf.getFirstName());
		registerObject.enter_lastName(jf.getLastName());
		registerObject.enter_updated_email(emails);
		registerObject.enter_password(jf.getPassword());
		registerObject.enter_address1(jf.getaddress());
		registerObject.enter_city(jf.getCityName());
		registerObject.select_country_via_Dropdown("United States");
		registerObject.select_state_via_Dropdown("Florida");
		registerObject.enter_postcode("12345");
		registerObject.enter_mobile_number("01008898020");
		registerObject.enter_Phone_number("022526040");
		registerObject.click_On_sex_Type();
		registerObject.select_days_via_Dropdown("4");
		registerObject.select_months_via_Dropdown("4");
		registerObject.select_years_via_Dropdown("1988");
		registerObject.enter_company(jf.getCompanyName());
		registerObject.enter_address_alias(jf.getaddress());
		registerObject.enter_other(jf.getdescription());
		registerObject.click_On_Rigester_Account_btn();
		AssertJUnit.assertTrue(validtionObject.get_heading_assertion_title().equalsIgnoreCase("My account"));
		//registerObject.click_On_signout();
	}

}
