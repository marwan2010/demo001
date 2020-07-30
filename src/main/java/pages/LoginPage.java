package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PagesBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "SubmitLogin")
	WebElement SubmitLogin;

	@FindBy(id = "email")
	WebElement email_txt;

	@FindBy(id = "passwd")
	WebElement passwd_txt;
	@FindBy(xpath="//a[contains(text(),\"Sign out\")]")
	  WebElement sign_out;
	

	public void enter_email(String value) {

		setTextElementText(email_txt, value);
	}

	public void enter_password(String value) {

		setTextElementText(passwd_txt, value);
	}

	public void click_On_SubmitLogin() {

		clickButton(SubmitLogin, 10);
	}
	
	
	
	public String get_assertion_sign_out() {
		
		waitpresenceOfElementLocated(sign_out,10);
		
		return 	sign_out.getText();	
	}
	
	
	

}
