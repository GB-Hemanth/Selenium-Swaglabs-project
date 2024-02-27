package PagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
 WebDriver driver;
    
    // Locators
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement usernameField;
    
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;
    
    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;
    
    @FindBy(xpath = "//div[@class='login_logo']")
    private WebElement Loginlogo;
    
 // Constructor
    public void LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, driver);
    }
    
 // Methods to interact with elements
    public void setUsername(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }
    
    public void setPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    
    public void clickLoginButton() {
        loginButton.click();
    }
    public boolean verifylogo()
    {
    	boolean LOGO = Loginlogo.isDisplayed();
		return LOGO;
    }
    
    
    // Method to perform login action
    public void login(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }
}
