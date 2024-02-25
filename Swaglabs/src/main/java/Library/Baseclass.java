package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass 
{
WebDriver driver;
	
	
	 @BeforeMethod
	    public void setUp() {
	        // Set up WebDriver
	        System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
	         driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.saucedemo.com/");
	    }
	
	 @AfterMethod
	    public void tearDown() {
	        // Close the browser
	       driver.quit();
	 }
}