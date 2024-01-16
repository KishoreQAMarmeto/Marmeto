package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import genericMethods.Screenshot;
import net.bytebuddy.asm.Advice.Return;

public class PDP {
	public WebDriver driver;
	public Actions actions;
	
	@FindBy(xpath = "//h1[@class='ProductMeta__Title Heading u-h2']")
	public WebElement pdpProductTitle;
	
	//----------------------quantity selector--------------//
	@FindBy(xpath = "//button[@data-action='decrease-quantity']")
	public WebElement pdpDecreaseQuantity;
	@FindBy(xpath = "//button[@data-action='increase-quantity']")
	public WebElement pdpIncreaseQuantity;
	
	//--------------------wishlistAndATC---------------//
	@FindBy(xpath = "//div[@id='customwishlistblock']")
	public WebElement pdpWishlist;
	@FindBy(xpath = "//button[@id='add_to_cart_kp']")
	public WebElement pdpATC;
	
	//----------------WeThinkYouWillLike---------//
	@FindBy(xpath = "(//div[@class='Carousel__Cell kjo is-selected'])[1]")
	public WebElement pdpProdcut1;
	@FindBy(xpath = "(//h2[@class='ProductItem__Title Heading'])[1]")
	public WebElement pdpProduct1Title;
	@FindBy(xpath = "(//button[@class='ProductForm__AddToCart Button Button--secondary Button--full'])[1]")
	public WebElement pdpProduct1ATC;
	@FindBy(xpath = "(//button[@data-swaction='addToWishlist'])[1]")
	public WebElement pdpProduct1Wishlist;
	
	
	public String getProdcutTitle() {
		String pdpTitle = pdpProductTitle.getText();
		return pdpTitle;
	}
	
	public void verifyProductDiscriptionPage(String expectedTitle) {
		String actualTitle = pdpProductTitle.getText();
		Assert.assertEquals(actualTitle, expectedTitle, "PDP Title is not matching");
	}
	
	public String addProductToCart() {
		String productTitle = pdpProductTitle.getText();
		pdpATC.click();
		return productTitle;
	}
	
	public String addProductToWishlist() {
		String pdpTitle = pdpProductTitle.getText();
		pdpWishlist.click();
		return pdpTitle;
	}
	
	public void increaseQuantity(int quantity) {
		for(int i = 0; i < quantity - 1; i++) {
			pdpIncreaseQuantity.click();
		}
	}
	
	public void decreaseQuantity(int quantity) {
		for(int i = 0; i < quantity; i++) {
			pdpDecreaseQuantity.click();
		}
	}

	public PDP(WebDriver driver){
		this.driver = driver;
		this.actions = new Actions(driver);
		PageFactory.initElements(driver, this);	
	}

}
