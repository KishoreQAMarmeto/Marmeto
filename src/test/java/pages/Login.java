package pages;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericMethods.Screenshot;
import genericMethods.ScrollToElement;


public class Login {
	WebDriver driver;
	
	@FindBy(xpath = "//h1[@class='Form__Title Heading u-h1'][1]")
	public WebElement loginHeading;
	@FindBy(xpath = "//input[@type='email'][1]")
	public WebElement emailTb;
	@FindBy(xpath = "//input[@type='password']")
	public WebElement passwordTb;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginBtn;
	@FindBy(xpath = "//p[.='Incorrect email or password.']")
	public WebElement incorrectCredentialsErrorMessage;
	@FindBy(className = "Header__LogoLink")
	public WebElement logo;
	
	public void verifyLoginPage() throws Exception {
		Assert.assertTrue(driver.getTitle().equals("Account - March Jewellery by FableStreet"));
	}
	
	public void enterEmailPassword(String email, String password) throws Exception {
		ScrollToElement.scrollToElement(driver, loginHeading);
		
		emailTb.sendKeys(email);		
		passwordTb.sendKeys(password);
	}
	
	public void clickLoginButton() throws Exception {
		loginBtn.click();
	}
	
	public void solveCaptcha() throws Exception {
		System.out.println("Please solve captcha");
		Thread.sleep(5000);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("If done please enter [y/n]?");
		String input = scan.next();
		
		if(!input.equalsIgnoreCase("y"))
			Assert.fail("Captcha verification failed");
	}
	
	public void verifyLogin(String status) throws Exception {
		if(driver.getTitle().contains("Challenge")) {
			solveCaptcha();
		}
		if(status.equals("PASS")) {
//			solveCaptcha();
			Account myAccount = new Account(driver);
			myAccount.verifyAccountPage();
			System.out.println("Login successful");
			myAccount.clickLogout();
		}else if(status.equals("FAIL")) {
//			solveCaptcha();
			Assert.assertEquals(driver.getTitle(), "Account - March Jewellery by FableStreet");
			System.out.println("Login failed");
			ScrollToElement.scrollToElement(driver, incorrectCredentialsErrorMessage);
			Assert.assertTrue(incorrectCredentialsErrorMessage.isDisplayed());
			System.out.println("Error message is displayed");
			Screenshot.takeScreenshot(driver);
		}else if(status.equals("BLOCK")) {
			Assert.assertEquals(driver.getTitle(), "Account - March Jewellery by FableStreet");
			System.out.println("Login failed, due to missing data");
			Screenshot.takeScreenshot(driver);
		}
	}
	
	public void moveToHomePage() {
		logo.click();
	}
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
}
