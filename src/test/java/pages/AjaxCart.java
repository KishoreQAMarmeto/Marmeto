package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericMethods.Screenshot;

public class AjaxCart {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@href='/cart']")
	public WebElement cartIcn;
	@FindBy(xpath = "//h2[@class='CartItem__Title Heading']")
	public WebElement product1Title;
	@FindBy(xpath = "//span[@class='CartItem__Price Price Price--highlight']")
	public WebElement product1Price;
	@FindBy(xpath = "(//button[@class='Drawer__Close Icon-Wrapper--clickable'])[2]")
	public WebElement closeAjaxCart;
	@FindBy(xpath = "//button[@onclick='onCheckoutClick(this)']")
	public WebElement upiCardCod;
	@FindBy(xpath = "//button[@class='Cart__Checkout Button Button--primary Button--full']")
	public WebElement netBankingOthers;
	
	public String getProdcutTitle() {
		String productTitle = product1Title.getText();
		return productTitle;
	}
	
	public void closeAjaxCart() {
		closeAjaxCart.click();
	}
	
	public void clickOnUpiCashCod() throws Exception {
		upiCardCod.click();
		Screenshot.takeScreenshot(driver);
	}
	
	public void clickOnNetbankingOthers() throws Exception {
		netBankingOthers.click();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Information - March Jewellery by FableStreet - Checkout", "Title not matching. Not info page");
	}
	
	public AjaxCart(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}

}
