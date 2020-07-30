package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends PagesBase {
	public OrderPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[@title=\"Continue shopping\"]")
	WebElement cont_shopping;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")
	WebElement checkout_btn;

	@FindBy(name = "/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")
	WebElement checkout_btn2;

	@FindBy(name = "processAddress")
	WebElement processAddress_btn;

	@FindBy(xpath = "//*[@id=\"cgv\"]")
	WebElement cgv_chk;

	@FindBy(xpath = "//*[@title=\"View my shopping cart\"]")
	WebElement view_cart;

	@FindBy(xpath = "//*[@title=\"View my shopping cart\"]")
	WebElement checkout0_btn;

	@FindBy(name = "processCarrier")
	WebElement processCarrier_btn;

	@FindBy(className = "bankwire")
	WebElement bankwire_tab;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button")
	WebElement confirm_btn;

	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	WebElement assertion_add_cart;

	@FindBy(xpath = "//*[@id=\"product_2_7_0_353233\"]/td[2]/p")
	WebElement product_name;

	@FindBy(xpath = "//*[@id=\"center_column\"]/h1")
	WebElement heading_address;

	@FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a/span")
	WebElement fname_lname;

	@FindBy(xpath = "//*[@id=\"address_invoice\"]/li[2]")
	WebElement account_fname_lname;

	@FindBy(xpath = "//*[@id=\"carrier_area\"]/h1")
	WebElement heading_shipping;
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1")
	WebElement heading_payment;

	@FindBy(xpath = "//*[@id=\"center_column\"]/div/p/strong")
	WebElement heading_order_confirm;

	@FindBy(xpath = "//*[@id=\"center_column\"]/form/div/h3")
	WebElement bank_ware;
//	

	@FindBy(xpath = "//*[@id=\"order\"]/div[3]/div/div/div/div/p")
	WebElement fancybox_error;

	@FindBy(className = "fancybox-overlay-fixed")
	WebElement fancybox_close;

	@FindBy(xpath = "//p[contains(text(),\"You must agree to the terms of service before continuing.\")])")
	WebElement iframe;

	public void click_on_view_Cart()

	{
		js.executeScript("window.scrollBy(0,-700)");
		action.moveToElement(view_cart).perform();
		clickButton(checkout0_btn, 10);
	}

	public void click_on_Proceed_checkout_btn() {
		js.executeScript("window.scrollBy(0,700)");
		clickButton(checkout_btn, 10);

	}

	public void click_on_Continue_shopping() {
		clickButton(cont_shopping, 10);

	}

	public void click_on_processAddress_btn() {

		clickButton(processAddress_btn, 10);

	}

	public void click_on_TermCondition_chk() {

		Select_The_Checkbox(cgv_chk, 10);

	}

	public void click_on_processCarrier_btn() {
		clickButton(processCarrier_btn, 10);

	}

	public void click_on_bank_wire_tab() {
		clickButton(bankwire_tab, 10);

	}

	public void click_on_confirm_order_btn() {
		clickButton(confirm_btn, 10);

	}

	public String get_assertion_product_name() {

		return product_name.getText();
	}

	public String get_assertion_address_page() {

		return heading_address.getText();
	}

	public String get_assertion_billing_address_name() {
		return fname_lname.getText();

	}

	public String get_account_fullname() {

		return account_fname_lname.getText();
	}

	public String get_assertion_shipping_page() {

		return heading_shipping.getText();
	}

	public String get_assertion_payment_page() {

		return heading_payment.getText();
	}

	public String get_assertion_banke_ware() {

		return bank_ware.getText();
	}

	public String get_assertion_Order_Confirmation() {

		return heading_order_confirm.getText();
	}

	public void click_fancybox_close() {

		String jQuerySelector = ".fancybox-overlay-fixed";
		js.executeScript("$(\"" + jQuerySelector + "\").click()");

	}
}
