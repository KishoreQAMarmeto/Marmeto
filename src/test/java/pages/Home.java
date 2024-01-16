package pages;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import genericMethods.Screenshot;
import genericMethods.ScrollToElement;


public class Home {
	public WebDriver driver;
	public Actions actions;
	
	//------------------Header---------------------//
	@FindBy(className = "Header__LogoLink")
	public WebElement logo;	
	
	//-------------------HeaderCollection--------------------//
	//--------------------ShopBy-----------------------------//
	@FindBy(xpath = "//a[text()='Shop By']")
	public WebElement shopBy;
	
	@FindBy(xpath = "//a[text()='Category ']")
	public WebElement category;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Rings']")
	public WebElement rings;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Bracelets and Bangles']")
	public WebElement bracletsAndBangles;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Earrings']")
	public WebElement earrings;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Anklets']")
	public WebElement anklets;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Toe Rings']")
	public WebElement toeRings;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Necklaces']")
	public WebElement necklaces;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Mangalsutras']")
	public WebElement mangalsutras;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Couple Rings ']")
	public WebElement coupleRings ;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Nose Pins']")
	public WebElement nosePins;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Jewellery Sets']")
	public WebElement jewellerySets;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='All Jewellery']")
	public WebElement allJewellery;
	
	@FindBy(xpath = "//a[text()='Collection ']")
	public WebElement collection;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Shine in Solitaire']")
	public WebElement shineInSolitaire;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Eternal Pearls']")
	public WebElement eternalPearls;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Colourful Gemstones']")
	public WebElement colourfulGemstones;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Office Essentials']")
	public WebElement officeEssentials;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Everyday Silverly ']")
	public WebElement everydaySilverly ;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='Party Essentials ']")
	public WebElement partyEssentials ;
	@FindBy(xpath = "//ul[@class='Linklist']/li/a[text()='March Signatures ']")
	public WebElement marchSignatures ;
	
	//---------------------------Gifts----------------------------//
	@FindBy(xpath = "//a[text()='Gifts']")
	public WebElement gifts;
	
	@FindBy(xpath = "//a[text()='By Price ']")
	public WebElement byPrice;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Under 999']")
	public WebElement under999;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Under 1999']")
	public WebElement under1999;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Between 1999-3499']")
	public WebElement between1999to3499;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Above 3499']")
	public WebElement above3499;
	
	@FindBy(xpath = "//a[text()='By Occasion ']")
	public WebElement byOccasion;
//	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Christmas & Secret Santa ']")
//	public WebElement christmasSecretSanta ;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Wedding']")
	public WebElement wedding;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Birthday']")
	public WebElement birthday;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Anniversary']")
	public WebElement anniversary;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Milestone']")
	public WebElement milestone;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Festivals']")
	public WebElement festivals;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Just like that']")
	public WebElement justLikeThat;
	
	@FindBy(xpath = "//a[text()='By Relation ']")
	public WebElement byRelation;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Mother']")
	public WebElement mother;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Partner']")
	public WebElement partner;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Him & Her']")
	public WebElement himHer;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Sister']")
	public WebElement sister;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Friend']")
	public WebElement friend;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Yourself']")
	public WebElement yourself;
	
	@FindBy(xpath = "//a[text()='All Gifts ']")
	public WebElement allGifts;
	
	@FindBy(xpath = "(//a[text()='New Arrivals'])[2]")
	public WebElement headerNewArrivals;
	
	@FindBy(xpath = "//a[text()='All Gifts ']")
	public WebElement headerBestSellers;
	
	//-----------------------ValueDeals------------------//	
	@FindBy(xpath = "//a[text()='Value Deals']")
	public WebElement ValueDeals;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Lowest Price Deals ']")
	public WebElement lowestPriceDeals ;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Silver Clearance: Up to 70% off  ']")
	public WebElement silverClearanceUpTo70Off  ;
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Brass Clearance: Under 999 ']")
	public WebElement brassClearanceUnder999 ;
	
	@FindBy(xpath = "//a[text()='More']")
	public WebElement more;	
		
	//--------------------Search--------------------------//
	@FindBy(xpath = "//div/a[@data-action = 'toggle-search']")
	public WebElement searchIcn;	
	@FindBy(xpath = "//input[@class='Search__Input Heading']")
	public WebElement searchTb;	
	@FindBy(xpath = "//span[@class='Heading Text--subdued u-h7']")
	public WebElement result;
	
	@FindBy(xpath = "//a[@class='Header__Icon Icon-Wrapper Icon-Wrapper--clickable hidden-phone']")
	public WebElement accountIcn;
	
	//-------------------Wishlist---------------------//
	@FindBy(xpath = "//a[@class='swym-wishlist']")
	public WebElement wishlistIcn;	
	@FindBy(xpath = "//h3[@class='swym-title swym-title-1']")
	public WebElement wishlistProduct1;
	
	@FindBy(xpath = "//a[@href='/cart']")
	public WebElement cartIcn;	
	
	//-------------------------Banners-----------------------------//	
	@FindBy(id = "shopify-section-slideshow")
	public WebElement banner;	
	@FindBy(xpath = "(//button[@aria-label='previous'])[1]")
	public WebElement previousBanner;	
	@FindBy(xpath = "(//button[@aria-label='next'])[1]")
	public WebElement nextBanner;
	
	//-----------------Small Banner Images---------------------//	
	@FindBy(xpath = "//div[@id='shopify-section-1655278990c80b7079']//a[@href='/collections/rings']")
	public WebElement ringsImg;	
	@FindBy(xpath = "//div[@id='shopify-section-1655278990c80b7079']//a[@href='/collections/bracelets-cuffs']")
	public WebElement braceletsImg;	
	@FindBy(xpath = "//div[@id='shopify-section-1655278990c80b7079']//a[@href='/collections/couple-rings']")
	public WebElement coupleRingsImg;	
	@FindBy(xpath = "//div[@id='shopify-section-1655278990c80b7079']//a[@href='/collections/necklaces']")
	public WebElement necklacesImg;	
	@FindBy(xpath = "//div[@id='shopify-section-1655278990c80b7079']//a[@href='/collections/earrings']")
	public WebElement earringsImg;	
	@FindBy(xpath = "//div[@id='shopify-section-1655278990c80b7079']//a[@href='/collections/jewellery-sets']")
	public WebElement jewellerySetsImg;	
	@FindBy(xpath = "//div[@id='shopify-section-1655278990c80b7079']//a[@href='/collections/nose-pins']")
	public WebElement nosePinsImg;	
	@FindBy(xpath = "//div[@id='shopify-section-1655278990c80b7079']//a[@href='/collections/mangalsutras']")
	public WebElement mangalsutrasImg;	
	@FindBy(xpath = "//div[@id='shopify-section-1655278990c80b7079']//a[@href='/collections/toe-rings']")
	public WebElement toeRingsImg;	
	@FindBy(xpath = "//div[@id='shopify-section-1655278990c80b7079']//a[@href='/collections/anklets']")
	public WebElement ankeltsImg;
	
	//---------------------Sections--------------------------//
	//--------------------NewArrivals------------------------//
	@FindBy(xpath = "//div[@id='shopify-section-162642984527f0e277']//div[@class='ProductItem ']")
	public List<WebElement> newArrivalsProducts;
	@FindBy(xpath = "//div[@id='shopify-section-162642984527f0e277']//a[@class='ProductItem__name']")
	public List<WebElement> newArrivalsName;
	@FindBy(xpath = "//div[@id='shopify-section-162642984527f0e277']//span[@class='ProductItem__Price Price']")
	public List<WebElement> newArrivalsPrice;
	@FindBy(xpath = "//div[@id='shopify-section-162642984527f0e277']//button[@class='ProductForm__AddToCart Button Button--secondary Button--full']")
	public List<WebElement> newArrivalsATC;
	@FindBy(xpath = "//div[@id='shopify-section-162642984527f0e277']//button[@aria-label='Add to Wishlist']")
	public List<WebElement> newArrivalsWishlist;
	@FindBy(xpath = "//div[@id='shopify-section-162642984527f0e277']//a[@class='Button Button--primary']")
	public WebElement newArrivalsShopAll;
	
	//-------------------Bestsellers-----------------------//
	@FindBy(xpath = "//div[@id='shopify-section-24004b5e-e378-4cb8-863a-e4b662ac259b']//div[@class='ProductItem ']")
	public List<WebElement> bestsellersProducts;
	@FindBy(xpath = "//div[@id='shopify-section-24004b5e-e378-4cb8-863a-e4b662ac259b']//a[@class='ProductItem__name']")
	public List<WebElement> bestsellersName;
	@FindBy(xpath = "//div[@id='shopify-section-24004b5e-e378-4cb8-863a-e4b662ac259b']//span[@class='ProductItem__Price Price']")
	public List<WebElement> bestsellersPrice;
	@FindBy(xpath = "//div[@id='shopify-section-24004b5e-e378-4cb8-863a-e4b662ac259b']//button[@class='ProductForm__AddToCart Button Button--secondary Button--full']")
	public List<WebElement> bestsellersATC;
	@FindBy(xpath = "//div[@id='shopify-section-24004b5e-e378-4cb8-863a-e4b662ac259b']//button[@aria-label='Add to Wishlist']")
	public List<WebElement> bestsellersWishlist;
	@FindBy(xpath = "//div[@id='shopify-section-24004b5e-e378-4cb8-863a-e4b662ac259b']//a[@href='/collections/best-sellers']")
	public WebElement bestsellersShopAll;
	
	//------------------------Shop Gifts By Price---------------------//
	@FindBy(xpath = "(//a[@href='/collections/gifts-under-999'])[3]")
	public WebElement shopByPriceUnder999;
	@FindBy(xpath = "(//a[@href='/collections/gifts-under-1999'])[3]")
	public WebElement shopByPriceUnder1999;
	@FindBy(xpath = "(//a[@href='/collections/gifts-between-1999-3499'])[3]")
	public WebElement shopByPriceBetween1999to3499;
	@FindBy(xpath = "(//a[@href='/collections/gifts-above-3499'])[3]")
	public WebElement shopByPriceAbove3499;
	
	//------------------------Gift your loved ones----------------------//
	@FindBy(xpath = "(//a[@href='/collections/gifts-for-partner'])[3]")
	public WebElement giftYourLovedOnesPartner;
	@FindBy(xpath = "(//a[@href='/collections/gifts-for-mother'])[3]")
	public WebElement giftYourLovedOnesMother;
	@FindBy(xpath = "(//a[@href='/collections/gifts-for-sister'])[3]")
	public WebElement giftYourLovedOnesSister;
	@FindBy(xpath = "(//a[@href='/collections/gifts-for-friend'])[3]")
	public WebElement giftYourLovedOnesFriend;
	@FindBy(xpath = "(//a[@href='/collections/gifts-for-him-her'])[3]")
	public WebElement giftYourLovedOnesHimHer;
	@FindBy(xpath = "(//a[@href='/collections/gifts-for-yourself'])[3]")
	public WebElement giftYourLovedOnesYourself;
	
	//--------------------Review--------------------------------//
	@FindBy(xpath = "//iframe[@title='Carousel cards reviews widget']")
	public WebElement reviewFrame;
	@FindBy(xpath = "(//div[@class='loox-carousel-item loox-carousel-card-item loox-slide-shadow-none'])[1]")
	public WebElement review1;
	@FindBy(xpath = "")
	public WebElement reviewNext;
	@FindBy(xpath = "")
	public WebElement reviewPrevious;
	@FindBy(xpath = "//div[@class='normal-text title']")
	public WebElement reviewPopupTitle;
	@FindBy(xpath = "close-button-icon")
	public WebElement closeReview;
	
	//------------------------Footer-----------------------//	
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Our Story']")
	public WebElement ourStory;	
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Jewellery Care']")
	public WebElement jwelleryCare;	
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Warranty']")
	public WebElement warrenty;	
	@FindBy(xpath = "//ul[@class='Linklist']//a[contains(text(), \"Product FAQ's\")]")
	public WebElement productFAQs;	
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Sitemap']")
	public WebElement sitemap;	
	@FindBy(xpath = "//ul[@class='Linklist']//a[contains(text(), \"Order FAQ's\")]")
	public WebElement orderFAQ;	
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Shipping & Delivery Policy']")
	public WebElement shippingDeliveryPolicy;	
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Returns & Exchange Policy']")
	public WebElement returnsExchangePolicy;	
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Terms & Conditions']")
	public WebElement termsConditions;	
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Privacy Policy']")
	public WebElement privacyPolicy;	
	@FindBy(xpath = "//ul[@class='Linklist']//a[text()='Return/Exchange']")
	public WebElement returnExchange;

	
	public void hoverOver(WebElement element) {
		actions.moveToElement(element).perform();	
	}
	
	public void moveToShopByCategory(WebElement plp) {
		hoverOver(shopBy);
		hoverOver(category);
		String text = plp.getText();
		plp.click();
		switch(text){
			case "Rings":Assert.assertTrue(driver.getTitle().contains("Buy Silver Rings Online"));
			break;
			case "Bracelets and Bangles":Assert.assertTrue(driver.getTitle().contains("Buy Bracelets For Women "));
			break;
			case "Earrings":Assert.assertTrue(driver.getTitle().contains("Buy Silver Earrings Online "));
			break;
			case "Anklets":Assert.assertTrue(driver.getTitle().contains("Anklets"));
			break;
			case "Toe Rings":Assert.assertTrue(driver.getTitle().contains("Toe Rings"));
			break;
			case "Necklaces":Assert.assertTrue(driver.getTitle().contains("Buy Fine Silver Necklaces "));	
			break;
			case "Mangalsutras":Assert.assertTrue(driver.getTitle().contains("Mangalsutras"));
			break;
			case "Couple Rings":Assert.assertTrue(driver.getTitle().contains("Silver Couple Rings"));
			break;
			case "Nose Pins":Assert.assertTrue(driver.getTitle().contains("Buy Silver Nose Pins "));
			break;
			case "Jewellery Sets":Assert.assertTrue(driver.getTitle().contains("Shop Sparkling Jewellery Sets"));
			break;
			case "All Jewellery":Assert.assertTrue(driver.getTitle().contains("Buy Silver Jewellery Online"));
			break;
			default:Assert.assertTrue(false, "collection removed");			
		}	
	}
	
	public void moveToShopByCollection(WebElement plp) {
		hoverOver(shopBy);
		hoverOver(collection);
		String text = plp.getText();
		plp.click();
		switch(text){
			case "Shine in Solitaire":Assert.assertTrue(driver.getTitle().contains("Solitaire Jewellery "));
			break;
			case "Eternal Pearls":Assert.assertTrue(driver.getTitle().contains("Buy Original Pearl Jewellery Online in India "));
			break;
			case "Colourful Gemstones":Assert.assertTrue(driver.getTitle().contains("Buy Gemstone Jewellery Online in India "));
			break;
			case "Office Essentials":Assert.assertTrue(driver.getTitle().contains("Buy Office Wear Jewellery Online in India "));
			break;
			case "Everyday Silverly":Assert.assertTrue(driver.getTitle().contains("Daily Essentials "));
			break;
			case "Party Essentials":Assert.assertTrue(driver.getTitle().contains("Party Wear "));	
			break;
			case "March Signatures":Assert.assertTrue(driver.getTitle().contains("March Exclusive "));
			break;
			default:Assert.assertTrue(false, "collection removed");			
		}	
	}
	
	public void moveToGiftsByPrice(WebElement plp) {
		hoverOver(gifts);
		hoverOver(byPrice);
		String text = plp.getText();
		plp.click();
		switch(text){
			case "Under 999":Assert.assertTrue(driver.getTitle().contains("Gifts Under 999 "));
			break;
			case "Under 1999":Assert.assertTrue(driver.getTitle().contains("Gifts Under 1999 "));
			break;
			case "Between 1999-3499":Assert.assertTrue(driver.getTitle().contains("Gifts Between 1999-3499 "));
			break;
			case "Above 3499":Assert.assertTrue(driver.getTitle().contains("Gifts Above 3499 "));
			break;
			default:Assert.assertTrue(false, "collection removed");			
		}	
	}
	
	public void moveToGiftsByOccasion(WebElement plp) {
		hoverOver(gifts);
		hoverOver(byOccasion);
		String text = plp.getText();
		plp.click();
		switch(text){
			case "Christmas & Secret Santa":Assert.assertTrue(driver.getTitle().contains("Secret Santa Gifts "));
			break;
			case "Wedding":Assert.assertTrue(driver.getTitle().contains("Wedding Gifts "));
			break;
			case "Birthday":Assert.assertTrue(driver.getTitle().contains("Birthday Gifts "));
			break;
			case "Anniversary":Assert.assertTrue(driver.getTitle().contains("Anniversary Gifts "));
			break;
			case "Milestone":Assert.assertTrue(driver.getTitle().contains("Milestone Gifts "));
			break;
			case "Festivals":Assert.assertTrue(driver.getTitle().contains("Festive Gifts "));	
			break;
			case "Just like that":Assert.assertTrue(driver.getTitle().contains("Gifts Just Like That "));
			break;
			default:Assert.assertTrue(false, "collection removed");			
		}	
	}
	
	public void moveToGiftsByRelation(WebElement plp) {
		hoverOver(gifts);
		hoverOver(byRelation);
		String text = plp.getText();
		plp.click();
		switch(text){
			case "Mother":Assert.assertTrue(driver.getTitle().contains("Gifts for Mother "));
			break;
			case "Partner":Assert.assertTrue(driver.getTitle().contains("Gifts for Partner "));
			break;
			case "Him & Her":Assert.assertTrue(driver.getTitle().contains("Gifts for Him & Her "));
			break;
			case "Sister":Assert.assertTrue(driver.getTitle().contains("Gifts for Sister "));
			break;
			case "Friend":Assert.assertTrue(driver.getTitle().contains("Gifts for Friend "));
			break;
			case "Yourself":Assert.assertTrue(driver.getTitle().contains("Gifts for Yourself "));	
			break;
			default:Assert.assertTrue(false, "collection reomoved");			
		}	
	}
	
	public void moveToValueDeals(WebElement plp) {
		hoverOver(ValueDeals);
		String text = plp.getText();
		plp.click();
		switch(text){
			case "Lowest Price Deals":Assert.assertTrue(driver.getTitle().contains("Lowest Price Deals "));
			break;
			case "Silver Clearance: Up to 70% off":Assert.assertTrue(driver.getTitle().contains("Special Price "));
			break;
			case "Brass Clearance: Under 999":Assert.assertTrue(driver.getTitle().contains("Sale | Silver Jewellery For Women "));
			break;
			default:Assert.assertTrue(false, "collection removed");			
		}	
	}
		
	public void clickVerifyAndMoveOut(WebElement element) {
		element.click();
        logo.click(); 
	}
	
	public void clickNextBannerMultipleTimes(int numClicks) {
	    for (int i = 0; i < numClicks; i++) {
	        nextBanner.click();
	    }
	}
	
	public void clickSearchIcon() throws Exception{
		searchIcn.click();
	}
	
	public void clickWishlistIcon() throws Exception{
		wishlistIcn.click();
	}
	
	public void clickCartIcon() throws Exception{
		cartIcn.click();
	}
	
	public void clickAccountIcon() throws Exception{
		accountIcn.click();
	}
	
	public void clickOnLogo() throws Exception{
		logo.click();
	}
	
	public void verifySearchResult()throws Exception{
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(result.isDisplayed());
	    soft.assertAll();
		Screenshot.takeScreenshot(driver);
	}
	
	public String getProductTitleInHome(WebElement product) {
		String productTitle = product.getText();
		return productTitle;
	}
	
	public void clickOnCartIcon() {
		cartIcn.click(); 
	}
	
	public String getPoductTitleOfProdcutInAjaxCart(WebElement product) {
		String productTitle = product.getText();
		return productTitle;
	}
	
    public void clickBannerAndVerify(String expectedTitle, int numClicks) throws Exception {
		banner.click();
		assertTrue(driver.getTitle().contains(expectedTitle), "Page title contains: " + driver.getTitle());
		clickOnLogo();
        clickNextBannerMultipleTimes(numClicks);
        Thread.sleep(1000);
    }
    
    public void homeCollection(WebElement collection, String title) {
    	collection.click();
    	String collectionTitle = driver.getTitle();
    	Assert.assertTrue(collectionTitle.contains(title), "Not moved to correct plp");
    }
    
    public void moveBack() {
    	driver.navigate().back();
    }
    
    public void moveToSection(WebElement section, String expectedTitle) {
    	ScrollToElement.scrollToElement(driver, section);
    	section.click();
    	String actualTitle = driver.getTitle();
    	Assert.assertTrue(actualTitle.contains(expectedTitle), "Not moved to correct section");
    }
    
    
    public void verifyReview(WebElement review) throws Exception {
    
    	driver.switchTo().frame(reviewFrame);
    	Thread.sleep(5000);
    	review.click();
    	Screenshot.takeScreenshot(driver);
    	driver.switchTo().defaultContent();
    }

	public void clickOnProduct(WebElement product) {
		// TODO Auto-generated method stub
		product.click();	
	}
	
	public String clickOnProdcutFromNewArrival(int productNum) {
		String expectedTitle = null;
        int indexToInteractWith = productNum - 1; 
        if (indexToInteractWith >= 0 && indexToInteractWith < newArrivalsProducts.size()) {
            expectedTitle = newArrivalsName.get(indexToInteractWith).getText();
            newArrivalsPrice.get(indexToInteractWith).getText();
            clickOnProduct(newArrivalsProducts.get(indexToInteractWith));

        } else {
            System.out.println("Invalid index specified. The list does not have an element at index " + indexToInteractWith);
            expectedTitle = "No product";
        }
		return expectedTitle;
	}
	
	public String clickOnProdcutFromBestseller(int productNum) {
		String expectedTitle = null;
        int indexToInteractWith = productNum - 1; 
        if (indexToInteractWith >= 0 && indexToInteractWith < bestsellersProducts.size()) {
            expectedTitle = bestsellersName.get(indexToInteractWith).getText();
            bestsellersPrice.get(indexToInteractWith).getText();
            clickOnProduct(bestsellersProducts.get(indexToInteractWith));

        } else {
            System.out.println("Invalid index specified. The list does not have an element at index " + indexToInteractWith);
            expectedTitle = "No product";
        }
		return expectedTitle;
	}
	
	public void clickOnWishlist(WebElement productWishlist) throws InterruptedException {
		// TODO Auto-generated method stub
		productWishlist.click();
		Thread.sleep(1000);
	}
	
	public String addProductToWishlistFromBestseller(int productNum) throws InterruptedException {
		String expectedTitle = null;
		int indexToInteractWith = productNum - 1;
        if (indexToInteractWith >= 0 && indexToInteractWith < bestsellersProducts.size()) {
            expectedTitle = bestsellersName.get(indexToInteractWith).getText();
            bestsellersPrice.get(indexToInteractWith).getText();
            clickOnWishlist(bestsellersWishlist.get(indexToInteractWith));
        } else {
            System.out.println("Invalid index specified. The list does not have an element at index " + indexToInteractWith);
            expectedTitle = "No product";
        }
		return expectedTitle;
	}
	
	public void clickOnProdcutACT(WebElement productATC) {
		productATC.click();
	}
	
	public String addToCartProdcutFromBestseller(int productNum) {
		// TODO Auto-generated method stub
		String expectedTitle = null;
		int indexToInteractWith = productNum - 1;
        if (indexToInteractWith >= 0 && indexToInteractWith < bestsellersProducts.size()) {
            expectedTitle = bestsellersName.get(indexToInteractWith).getText();
            bestsellersPrice.get(indexToInteractWith).getText();
            clickOnProdcutACT(bestsellersATC.get(indexToInteractWith));
        } else {
            System.out.println("Invalid index specified. The list does not have an element at index " + indexToInteractWith);
            expectedTitle = "No product";
        }
		return expectedTitle;
	}
	

	public String getWishlistProductTitle() {
		// TODO Auto-generated method stub
		System.out.println(wishlistProduct1.getText());
		return wishlistProduct1.getText();
	}
	
	public Home(WebDriver driver){
		this.driver = driver;
		this.actions = new Actions(driver);
		PageFactory.initElements(driver, this);	
	}


}
