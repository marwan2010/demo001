package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PagesBase{
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(className="login")
	  WebElement signIn_btn;
	

	
	@FindBy(linkText="WOMEN")
	public WebElement  woman_category;
	
	
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]//a[contains(text(), \"Blouses\")]")
	public
	  WebElement sub_category;
	

	
	
	
public void Open_Rigester_Page() {
		
		clickButton(signIn_btn,30);	     
	}

public void Open_Login_Page() {
	
	clickButton(signIn_btn,30);	     
}


	

public void click_on_Woman_category()

{           
	
	waitVisibility(woman_category,50);
	
     action.moveToElement(woman_category).perform();
	


	
	
}

public void click_on_Blouses_sub_catogry()

{
	
	String jQuerySelector = ".sf-menu > li:nth-child(1) > ul:nth-child(2) " ;
	js.executeScript("$(\"" + jQuerySelector + "\").show();");
	action.moveToElement(woman_category).moveToElement(sub_category).click().build().perform();
	
		
}
	

	
	
}
