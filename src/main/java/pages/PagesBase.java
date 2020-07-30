 	package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class PagesBase {

	protected WebDriver driver;
	public   Actions action;
    public static WebDriverWait wait;
    JavascriptExecutor js ;	
    



	public PagesBase(WebDriver driver) {

		PageFactory.initElements(driver, this);
		action= new Actions(driver);
        wait = new WebDriverWait(driver,15);
        js=(JavascriptExecutor)driver;	
		
	}
	
	
	
	
	protected static void clickButton (WebElement button,int waitInterval) {
		 wait.until(ExpectedConditions.elementToBeClickable(button));
 
		button.click();
	}
	
	

	
	
	
	protected static void setTextElementText (WebElement textElement,String Value) {
		  wait.until(ExpectedConditions.visibilityOf(textElement));
		  textElement.clear();
		  textElement.sendKeys(Value);
}
	

	
	
	
    public void waitVisibility(WebElement elementBy,int waitInterval) {
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }
    
    
    
    public void waitpresenceOfElementLocated(WebElement element,int waitInterval) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void Select_The_Checkbox(WebElement element ,int waitInterval) {
       // wait.until(ExpectedConditions.visibilityOf(element));
        
    	try {
            if (element.isSelected()) {
               System.out.println("Checkbox: " + element + "is already selected");
            } else {
            	// Select the checkbox
                element.click();
            }
        } catch (Exception e) {
        	System.out.println("Unable to select the checkbox: " + element);
        }
     
        
    }
    
    
    
    
   	


 
	
	
	
	

}
