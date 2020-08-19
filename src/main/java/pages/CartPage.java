package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PagesBase {
	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(className = "product-container")
	WebElement product;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li//span[contains(text(), \"Add to cart\")]")
	WebElement add_to_cart_btn;

	@FindBy(xpath = "//span[@title=\"Continue shopping\"]")
	WebElement cont_shopping;

	@FindBy(xpath = "//*[@title=\"View my shopping cart\"]")
	WebElement view_cart;

	@FindBy(xpath = "//*[@title=\"View my shopping cart\"]")
	WebElement checkout0_btn;

	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	WebElement assertion_add_cart;

	@FindBy(xpath = "//*[@id=\"product_2_7_0_353233\"]/td[2]/p")
	WebElement product_name;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")
	WebElement checkout_btn;

	public void click_on_Add_To_Cart()

	{
		js.executeScript("window.scrollBy(0,700)");
		action.moveToElement(product).perform();
		clickButton(add_to_cart_btn, 10);
	}

	public void openShoppingcartPage()

	{
		js.executeScript("window.scrollBy(0,-700)");
		action.moveToElement(view_cart).perform();
		clickButton(checkout0_btn, 10);
	}

	
	public void click_on_Continue_shopping() {
		clickButton(cont_shopping, 10);

	}
	
	public void click_on_Proceed_checkout_btn() {
		js.executeScript("window.scrollBy(0,700)");
		clickButton(checkout_btn, 10);

	}

	public String get_assertion_add_to_cart_succfully() {

		waitpresenceOfElementLocated(assertion_add_cart, 10);

		return assertion_add_cart.getText();
	}

}
