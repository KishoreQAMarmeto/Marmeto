package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import genericMethods.Screenshot;
import genericMethods.ScrollToElement;
import genericMethods.Setup;

public class Checkout extends Setup{

	//----------------------InformationPage--------------------//
	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement emailTextbox;
	@FindBy(xpath = "//input[@placeholder='First name (optional)']")
	public WebElement firstNameTextbox;
	@FindBy(xpath = "//input[@placeholder='Last name']")
	public WebElement lastNameTextbox;
	@FindBy(xpath = "//input[@placeholder='Address']")
	public WebElement addressTextbox;
	@FindBy(xpath = "//input[@placeholder='Apartment, suite, etc. (optional)']")
	public WebElement apartmentTextbox;
	@FindBy(xpath = "//input[@placeholder='City']")
	public WebElement cityTextbox;
	@FindBy(xpath = "//select[@placeholder='State']")
	public WebElement stateTextbox;
	@FindBy(xpath = "//input[@placeholder='PIN code']")
	public WebElement pinCodeTextbox;
	@FindBy(xpath = "//input[@placeholder='Phone']")
	public WebElement phoneTextbox;
	@FindBy(xpath = "//button[@id='continue_button']")
	public WebElement continueToPaymentMethod;
	
	//--------------------PaymentPage------------------------//
	@FindBy(xpath = "//div[@class='radio__label payment-method-wrapper ']")
	public WebElement razorPay;
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/div[2]/div[1]/div/form/div[3]/div[1]") //span[text()='Complete order'] //div[@class='shown-if-js']//button[@type='submit']
	public WebElement completeOrder;
	
	public void enterEmailAddressPassword(String email, String firstName, String lastName, String address, String appartment, String city, String state, String pincode, String phone) {
		emailTextbox.sendKeys(email);
		firstNameTextbox.sendKeys(firstName);
		lastNameTextbox.sendKeys(lastName);
		addressTextbox.sendKeys(address);
		apartmentTextbox.sendKeys(appartment);
		cityTextbox.sendKeys(city);
		Select drpState = new Select(stateTextbox);
		drpState.selectByVisibleText(state);
		pinCodeTextbox.sendKeys(pincode);
		phoneTextbox.sendKeys(phone);	
	}
	
	public void clickOnContinueToPayment() {
		continueToPaymentMethod.click();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Payment - March Jewellery by FableStreet - Checkout", "Not on Payment page. Title not matching");
	}
	
	public void selectPaymentMethod() throws Exception {
		razorPay.click();
		Screenshot.takeScreenshot(driver);
	}
	
	public String clickOnCompleteOrder() throws InterruptedException {
	    int attempts = 0;
	    while (attempts < 3) {
	        try {

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='shown-if-js']//span[text()='Complete order']")));
	            Thread.sleep(5000);
	            completeOrder.click();

	            String actualTitle = driver.getTitle();
	            System.out.println(actualTitle);
	            Assert.assertEquals(actualTitle, "Payment Page · Razorpay", "Not on razor pay page");
	           
	            return actualTitle;
	        } catch (StaleElementReferenceException | ElementClickInterceptedException e) {
	            attempts++;
	        }
	    }
	    return null;
	}
	
	public Checkout(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
}
