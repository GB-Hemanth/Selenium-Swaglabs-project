package Library;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
 public static WebDriver driver;
	
	
	 @SuppressWarnings("deprecation")
	@BeforeMethod
	    public void setUp() throws IOException {
	        // Set up WebDriver
	        System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
	         driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get(utility.readEXdata("URL"));
	    }
	
	 @AfterMethod
	    public void tearDown() {
	        // Close the browser
	       driver.quit();
	 }
}