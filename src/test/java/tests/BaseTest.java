package tests;

import java.util.Locale;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.github.javafaker.Faker;

public class BaseTest {

	public static WebDriver driver ;
	public static  Actions action; 
	  JavascriptExecutor js ;	
	 protected Faker faker = new Faker(new Locale("en-US"));
	
	

	String baseUrl="http://automationpractice.com/index.php";
	//Store current project workspace location in a string variable ‘path’
	String workingDir = System.getProperty("user.dir");
	String driverPath=workingDir+"\\drivers\\geckodriver.exe"; 
	String autoIt=workingDir+"\\drivers\\"; 
	
	public String imagePath=workingDir+"\\Uploads\\";
	

	
	@BeforeSuite
	public void setupDriver() {
		//Mention the location of GeckoDriver in localsystem
		System.setProperty("webdriver.gecko.driver", driverPath);
		// Object is created- Chrome browser is opened
	   	driver= new FirefoxDriver();
	   
	}
	
	
	
	///////////// Run at Once first Time///////////
	///////The method which comes under the @BeforeTest annotation will be executed first before any test belonging to that folder
	   
	    @BeforeTest
		public void openURL() {
	    	
	    	// maximize browser
			driver.manage().window().maximize();
			// Open webpage
		     driver.get(baseUrl);
	    	
		}
	    
	      
	
}
