package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericMethods.Screenshot;

public class PLP {
	public WebDriver driver;
	public Actions actions;
	
	//-----------------Filter---------------//
	@FindBy(xpath = "//button[@aria-label='Show filters']")
	public WebElement filter;
	
	@FindBy(xpath = "(//span[@class='Drawer__Title Heading u-h4'])[2]")
	public WebElement filterTitle;
	
	@FindBy(xpath = "(//button[text()='Category'])[2]")
	public WebElement filterCategory;
	@FindBy(xpath = "//button[text()='Anklets']")
	public WebElement filterAnklets;
	@FindBy(xpath = "//button[text()='Bracelets and Cuffs']")
	public WebElement filterBraceletsAndCuffs;
	@FindBy(xpath = "//button[text()='Earrings']")
	public WebElement filterEarrings;
	@FindBy(xpath = "//button[text()='Jewellery Sets']")
	public WebElement filterJewellerySets;
	@FindBy(xpath = "//button[text()='Necklaces']")
	public WebElement filterNecklaces;
	@FindBy(xpath = "//button[text()='Nose Pins']")
	public WebElement filterNosePins;
	@FindBy(xpath = "//button[text()='Rings']")
	public WebElement filterRings;
	@FindBy(xpath = "//button[text()='Toe Rings']")
	public WebElement filterToeRings;
	
	@FindBy(xpath = "//button[text()='Colour']")
	public WebElement filterColour;
	@FindBy(xpath = "//button[text()='Discount']")
	public WebElement filterDiscount;
	@FindBy(xpath = "//button[text()='Material']")
	public WebElement filterMaterial;
	@FindBy(xpath = "//button[text()='New']")
	public WebElement filterNew;
	@FindBy(xpath = "//button[text()='Occasion']")
	public WebElement filterOccasion;
	@FindBy(xpath = "//button[text()='Plating']")
	public WebElement filterPlating;
	@FindBy(xpath = "//button[text()='price']")
	public WebElement filterPrice;
	@FindBy(xpath = "//button[text()='Type']")
	public WebElement filterType;

	@FindBy(xpath = "//button[text()='Apply']")
	public WebElement apply;
	@FindBy(xpath = "//button[text()='Reset']")
	public WebElement reset;
	
	//------------------------------sort-------------------------//
	@FindBy(xpath = "//button[contains(text(),'Sort')]")
	public WebElement sort;
	@FindBy(xpath = "//button[contains(text(),'Featured')]")
	public WebElement featured;
	@FindBy(xpath = "//button[contains(text(),'Best selling')]")
	public WebElement bestSelling;
	@FindBy(xpath = "//button[contains(text(),'Price, low to high')]")
	public WebElement priceLowToHigh;
	@FindBy(xpath = "//button[contains(text(),'Price, high to low')]")
	public WebElement priceHighToLow;
	@FindBy(xpath = "//button[contains(text(),'Date, new to old')]")
	public WebElement dateNewToOld;
	
	//-----------------------products-----------------------//
	@FindBy(xpath = "(//div[@class='ProductItem '])[1]")
	public WebElement product1;
	@FindBy(xpath = "(//button[@class='ProductForm__AddToCart Button Button--secondary Button--full'])[1]")
	public WebElement product1ATC;
	@FindBy(xpath = "(//div[@class='ProductItem '])[2]")
	public WebElement product2;
	@FindBy(xpath = "(//button[@class='ProductForm__AddToCart Button Button--secondary Button--full'])[2]")
	public WebElement product2ATC;
	@FindBy(xpath = "(//div[@class='ProductItem '])[3]")
	public WebElement product3;
	@FindBy(xpath = "(//div[@class='ProductItem '])[4]")
	public WebElement product4;
	
	public void selectSortLowToHigh() {
		sort.click();
		priceLowToHigh.click();
	}
	
	public void selectFilterAnklet() {
		filter.click();
		filterCategory.click();
		filterAnklets.click();
		apply.click();
	}
	
	public String addFirstAvailableProductToCart() throws InterruptedException {
		// TODO Auto-generated method stub
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
		String productTitle;
		if(product1.getText().contains("ADD TO CART")) {
			String str = product1.getText();
			String productContent[] = str.split("\n");
			productTitle = productContent[2];
			product1ATC.click();
		}else if(product2.getText().contains("ADD TO CART")){
			product2ATC.click();
			String str = product2.getText();
			String productContent[] = str.split("\n");
			productTitle = productContent[2];
			System.out.println(productTitle);
			product2ATC.click();
		}else {
			System.out.println("first two products are out of stock");
			productTitle = null;
		}
		return productTitle;
	}
	
	public String clickOnFirstAvailableProduct() throws InterruptedException {
		// TODO Auto-generated method stub
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
		String productTitle;
		if(product1.getText().contains("ADD TO CART")) {
			String str = product1.getText();
			String productContent[] = str.split("\n");
			productTitle = productContent[2];
			product1.click();
		}else if(product2.getText().contains("ADD TO CART")){
			product2ATC.click();
			String str = product2.getText();
			String productContent[] = str.split("\n");
			productTitle = productContent[2];
			product2.click();
		}else {
			System.out.println("first two products are out of stock");
			productTitle = null;
		}
		return productTitle;
	}
	
	public PLP(WebDriver driver){
		this.driver = driver;
		this.actions = new Actions(driver);
		PageFactory.initElements(driver, this);	
	}

}
