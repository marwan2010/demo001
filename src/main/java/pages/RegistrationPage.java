package pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends PagesBase{

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(className="login")
	  WebElement signIn_btn;
	
	@FindBy(id="SubmitCreate")
	public
	  WebElement submitCreate_btn;
	
	@FindBy(id="email_create")
	  WebElement email_txt;
	
	@FindBy(id="email")
	  WebElement email_txt2;
	
	@FindBy(id="customer_firstname")
	  WebElement fn_txt;
	
	@FindBy(id="customer_lastname")
	  WebElement ln_txt;
	
	@FindBy(id="passwd")
	  WebElement passwd_txt;
	
	
	@FindBy(id="company")
	  WebElement company_txt;
	
	@FindBy(id="address1")
	  WebElement address1_txt;
	
	@FindBy(id="address2")
	  WebElement address2_txt;
	
	@FindBy(id="city")
	  WebElement city_txt;
	
	@FindBy(id="postcode")
	  WebElement postcode_txt;
	
	@FindBy(id="phone")
	  WebElement phone_txt;
	
	@FindBy(id="phone_mobile")
	  WebElement mobile_txt;
	
	@FindBy(id="alias")
	  WebElement address_alias_txt;
	
	@FindBy(id="other")
	  WebElement other_txt;
	
	@FindBy(id="id_country")
	  WebElement sel_country;
	
	@FindBy(id="id_state")
	  WebElement sel_state;
	
	@FindBy(id="days")
	  WebElement sel_day;
	
	@FindBy(id="months")
	  WebElement sel_months;
	
	@FindBy(id="years")
	  WebElement sel_years;
	
	@FindBy(className="radio")
	List<WebElement> radio;
	
	@FindBy(id="newsletter")
	WebElement newsletter;
	
	@FindBy(id="uniform-optin")
	WebElement uniform_optin;
	
	@FindBy(id="submitAccount")
	WebElement submitAccount;
	@FindBy(xpath="/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
	  WebElement signout_btn;

	@FindBy(id="//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")
	WebElement order_history;
	
	public void click_On_signout() {
		
		clickButton(signout_btn,30);	     
	}
	

	public void enterName(String value){

		setTextElementText(fn_txt,value);
	}
	
	public void enter_lastName(String value){

		setTextElementText(ln_txt,value);
	}
	
	
	public void enter_email(String value){

		setTextElementText(email_txt,value);
	}
	
	public void enter_updated_email(String value){

		setTextElementText(email_txt2,value);
	}
	
	public void enter_password(String value){

		setTextElementText(passwd_txt,value);
	}
	
	public void enter_company(String value){

		setTextElementText(company_txt,value);
	}
	
	
	
	public void enter_address1(String value){

		setTextElementText(address1_txt,value);
	}
	
	public void enter_address2(String value){

		setTextElementText(address2_txt,value);
	}
	
	public void enter_city(String value){

		setTextElementText(city_txt,value);
	}
	
	
	public void enter_postcode(String value){

		setTextElementText(postcode_txt,value);
	}
	
	
	public void enter_Phone_number(String value){

		setTextElementText(phone_txt,value);
	}
	
	public void enter_mobile_number(String value){

		setTextElementText(mobile_txt,value);
	}
	
	
	public void enter_address_alias(String value){

		setTextElementText(address_alias_txt,value);
	}
	
	public void enter_other(String value){

		setTextElementText(other_txt,value);
	}
	
	
	
public void click_On_sex_Type() {
		
		clickButton(radio.get(0),5);
		    
	}

public void click_On_newsletter() {
	
	clickButton(newsletter,5);
	    
}

public void click_On_uniform_optin() {
	
	clickButton(uniform_optin,5);
	    
}
	

public void click_On_Order_history() {
	
	clickButton(order_history,5);
	    
}

	
public void select_country_via_Dropdown(String value)
{
	
    Select drop = new Select(sel_country);
    drop.selectByVisibleText(value); 
}
	

public void select_state_via_Dropdown(String value)
{
	
    Select drop = new Select(sel_state);
    drop.selectByVisibleText(value); 
}
	
	
public void select_days_via_Dropdown(String value)
{
	
    Select drop = new Select(sel_day);
   // drop.selectByIndex(value);
    drop.selectByValue(value);
}

public void select_months_via_Dropdown(String value)
{
	
    Select drop = new Select(sel_months);
    drop.selectByValue(value);
}

public void select_years_via_Dropdown(String value)
{
	
    Select drop = new Select(sel_years);
    drop.selectByValue(value);
}
	
public void click_On_SubmitCreate() {
		
		clickButton(submitCreate_btn,10);	     
	}
public void click_On_Rigester_Account_btn() {
	
	clickButton(submitAccount,10);	     
}
}
