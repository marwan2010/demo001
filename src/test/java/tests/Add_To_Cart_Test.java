package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.AccountPage;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.OrderPage;

public class Add_To_Cart_Test extends BaseTest {
	HomePage homeObject;
	CartPage cartObject;
	LoginPage loginObject;
	OrderPage myorderObject;
	AccountPage accountObject;

	@BeforeClass
	public void Verify_User_Can_Login_Sucssfully() {
		homeObject.click_On_signIn();
		loginObject.enter_email("xxxxxxxddxxx@xxxxxxxx.com");
		loginObject.enter_password("123456");
		loginObject.click_On_SubmitLogin();
		AssertJUnit.assertTrue(loginObject.get_assertion_sign_out().equalsIgnoreCase("Sign out"));
	}

	@BeforeTest
	public void driversetup()

	{
		homeObject = new HomePage(driver);
		loginObject = new LoginPage(driver);

	}

	@BeforeMethod
	public void setup() {

		cartObject = new CartPage(driver);
		myorderObject = new OrderPage(driver);
		accountObject = new AccountPage(driver);
	}

	@AfterClass
	public void close() {

		// driver.manage().deleteAllCookies();
		// driver.close();

	}

	@Test(priority = 0)
	public void select_product() throws InterruptedException {

		homeObject.click_on_Woman_category();

		AssertJUnit.assertTrue(homeObject.woman_category.isDisplayed());

		Thread.sleep(3000);
		homeObject.click_on_Blouses_sub_catogry();
		AssertJUnit.assertTrue(homeObject.sub_category.isDisplayed());
		Thread.sleep(4000);
	}

	@Test(priority = 1)
	public void Verify_Add_product_To_Cart_and_Contine_shopping() throws InterruptedException {

		cartObject.click_on_Add_To_Cart();
		Thread.sleep(3000);
		AssertJUnit.assertTrue(cartObject.get_assertion_add_to_cart_succfully().contains("Product successfully added"));
		cartObject.click_on_Continue_shopping();

	}

	@Test(priority = 2, dependsOnMethods = { "Verify_Add_product_To_Cart_and_Contine_shopping" })
	public void Verify_Order_Summary_details() {

		cartObject.click_on_view_Cart();
		AssertJUnit.assertTrue(myorderObject.get_assertion_product_name().contains("Blouse"));
		myorderObject.click_on_Proceed_checkout_btn();
		AssertJUnit.assertTrue(myorderObject.get_assertion_address_page().equalsIgnoreCase("ADDRESSES"));

	}

	@Test(priority = 3, dependsOnMethods = { "Verify_Order_Summary_details" })
	public void Verify_billingAndDeliveryAddress() {

		AssertJUnit.assertTrue(myorderObject.get_assertion_billing_address_name()
				.equalsIgnoreCase(myorderObject.get_account_fullname()));
		myorderObject.click_on_processAddress_btn();
		AssertJUnit.assertTrue(myorderObject.get_assertion_shipping_page().equalsIgnoreCase("SHIPPING"));

	}

	@Test(priority = 4, dependsOnMethods = { "Verify_billingAndDeliveryAddress" })
	public void Verify_Order_shipping() {
		myorderObject.click_on_TermCondition_chk();
		myorderObject.click_on_processCarrier_btn();
		AssertJUnit.assertTrue(myorderObject.get_assertion_payment_page().contains("PAYMENT METHOD"));
	}

	@Test(priority = 5, dependsOnMethods = { "Verify_Order_shipping" })
	public void Verify_Order_payment_method() {
		myorderObject.click_on_bank_wire_tab();
		AssertJUnit.assertTrue(myorderObject.get_assertion_banke_ware().contains("BANK-WIRE PAYMENT"));

	}

	@Test(priority = 6, dependsOnMethods = { "Verify_Order_payment_method" })
	public void Verify_Order_Confirmation() {

		myorderObject.click_on_confirm_order_btn();
		AssertJUnit.assertTrue(
				myorderObject.get_assertion_Order_Confirmation().contains("Your order on My Store is complete"));

	}

	@Test(priority = 7)
	public void Verify_Order_history() throws InterruptedException {
		accountObject.click_on_View_myaccount();
		AssertJUnit.assertTrue(accountObject.get_assert_myaccount_page().equalsIgnoreCase("My account"));
		accountObject.click_On_Account_Order_history_btn();
		AssertJUnit.assertTrue(accountObject.get_assert_history_page().equalsIgnoreCase("ORDER HISTORY"));
		accountObject.click_on_order_details_btn();
		Thread.sleep(3000);
		AssertJUnit.assertTrue(accountObject.get_assert_product_details().contains("Blouse"));

	}

}
