package tests;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

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
	@Parameters("browserName")
	public void browsersetup(@Optional("firefox")String browserName) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browserName.equalsIgnoreCase("firefox")){
			//Mention the location of GeckoDriver in localsystem
			System.setProperty("webdriver.gecko.driver", driverPath);
			// Object is created- Chrome browser is opened
			driver= new FirefoxDriver();
			
		}
		//Check if parameter passed as 'chrome'
		else if(browserName.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			// WebDriverManager.chromedriver().setup();
			//create chrome instance
			driver = new ChromeDriver();
		}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		
		// maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		
	}




	///////////// Run at Once first Time///////////
	///////The method which comes under the @BeforeTest annotation will be executed first before any test belonging to that folder

	@BeforeClass
	public void openURL() {

		
		driver.get(baseUrl);   

	}






}
