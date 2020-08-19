package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PagesBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")
	WebElement order_history_btn;

	@FindBy(xpath = "//*[@id=\"center_column\"]/h1")
	WebElement heading_myaccount;

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement view_myaccount;

	@FindBy(xpath = "//h1[contains(text(),\"Order history\")]")
	WebElement heading_history;
	@FindBy(xpath = "//table[@id='order-list']/tbody/tr/td[7]/a/span")
	WebElement details;

	@FindBy(xpath ="//*[@id=\"order-detail-content\"]/table/tbody/tr/td[2]")
	WebElement product_name;
	
	
	public void open_My_Account_Page() {

		clickButton(view_myaccount, 10);

	}

	public void open_Order_history_Page() {

		clickButton(order_history_btn, 10);

	}

	public void click_on_order_details_btn() {

		clickButton(details, 10);

	}

	public String get_assert_myaccount_page() {

		return heading_myaccount.getText();
	}

	public String get_assert_history_page() {

		return heading_history.getText();
	}
	
	
	public String get_assert_product_details() {
		
		return product_name.getText();
	}

}
