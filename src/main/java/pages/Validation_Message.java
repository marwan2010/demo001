package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Validation_Message extends PagesBase{

	public Validation_Message(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(id="create_account_error")
			  WebElement email_error;
	
	@FindBy(xpath="//li[contains(text(),\"An account using this email\")]")
	  WebElement email_error2;
	
	@FindBy(tagName="h1")
	  WebElement my_account_title;
	
	@FindBy(className="page-subheading")
	  WebElement sub_heading;
	
	@FindBy(xpath="//b[contains(text(), \"firstname\")]")
	  WebElement error_fname;
	@FindBy(xpath="//b[contains(text(),\"lastname\")]")
	  WebElement error_lname;
	
	@FindBy(xpath="//b[contains(text(),\"email\")]")
	  WebElement error_email;
	
	@FindBy(xpath="//b[contains(text(),\"passwd\")]")
	  WebElement error_passwd;
	@FindBy(xpath="//b[contains(text(),\"address1\")]")
	  WebElement error_address1;
	@FindBy(xpath="//b[contains(text(),\"city\")]")
	  WebElement error_city;
	@FindBy(xpath="//li[contains(text(),\"The Zip/Postal code you've entered is invalid. It must follow this format: 00000\")]")
	  WebElement error_Zip_Postal;
	@FindBy(xpath="//li[contains(text(),\"country\")]")
	  WebElement error_country;
	
	@FindBy(xpath="//li[contains(text(),\"You must register at least one phone number\")]")
	  WebElement error_mobile;
	@FindBy(xpath="//li[contains(text(),\"is invalid\")]")
	  WebElement invalid_mobile;

	public boolean getEmailErrorMessage() {
	
		waitpresenceOfElementLocated(email_error,5);
		///System.out.println("xxxxxxxx"+email_error.getText());
		return 
				
				email_error.isDisplayed();	
	}
	
	public boolean getEmailRegistredMessage() {
		
		waitpresenceOfElementLocated(email_error2,5);
		
		return 	email_error2.isDisplayed();	
	}
	
public boolean get_title_heading() {
		
		waitpresenceOfElementLocated(sub_heading,5);
		
		return 	sub_heading.isDisplayed();	
	}
	
public boolean get_require_message_fname() {
	
	waitpresenceOfElementLocated(error_fname,10);
	
	return 	error_fname.isDisplayed();	
}

public boolean get_require_message_lname() {
	
	waitpresenceOfElementLocated(error_lname,10);
	
	return 	error_lname.isDisplayed();	
}

public boolean get_invalid_message_email() {
	
	waitpresenceOfElementLocated(error_email,10);
	System.out.println("xxxxxxxx"+error_email.getText());
	return 	error_email.isDisplayed();	
}


public boolean get_require_message_password() {
	
	waitpresenceOfElementLocated(error_passwd,10);
	System.out.println("xxxxxxxx"+error_passwd.getText());
	return 	error_passwd.isDisplayed();	
}


public boolean get_invalid_message_address1() {
	
	waitpresenceOfElementLocated(error_address1,10);
	System.out.println("xxxxxxxx"+error_address1.getText());
	return 	error_address1.isDisplayed();	
}

public boolean get_invalid_message_city() {
	
	waitpresenceOfElementLocated(error_city,10);
	System.out.println("xxxxxxxx"+error_city.getText());
	return 	error_city.isDisplayed();	
}
	
public boolean get_invalid_message_country() {
	
	waitpresenceOfElementLocated(error_country,5);
	System.out.println("xxxxxxxx"+error_country.getText());
	return 	error_country.isDisplayed();	
}

public boolean get_invalid_message_zipcode() {
	
	waitpresenceOfElementLocated(error_Zip_Postal,10);
	System.out.println("xxxxxxxx"+error_Zip_Postal.getText());
	return 	error_Zip_Postal.isDisplayed();	
}	


public boolean get_require_message_mobile() {
	
	waitpresenceOfElementLocated(error_mobile,10);
	System.out.println("xxxxxxxx"+error_mobile.getText());
	return 	error_mobile.isDisplayed();	
}

public boolean get_invalid_message_mobile() {
	
	waitpresenceOfElementLocated(invalid_mobile,10);
	System.out.println("xxxxxxxx"+invalid_mobile.getText());
	return 	invalid_mobile.isDisplayed();	
}

public String get_heading_assertion_title() {
	
	waitpresenceOfElementLocated(my_account_title,10);
	System.out.println("xxxxxxxx"+my_account_title.getText());
	return 	my_account_title.getText();	
}



}
