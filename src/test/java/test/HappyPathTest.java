package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericMethods.Screenshot;
import genericMethods.Setup;
import pages.AjaxCart;
import pages.Checkout;
import pages.Home;
import pages.Login;
import pages.PDP;
import pages.PLP;

public class HappyPathTest extends Setup{
	
	@Test
	public void ATCFormHomePage() throws Exception {
		Home hp = new Home(driver);
		hp.clickAccountIcon();
		Login lp = new Login(driver);
		lp.verifyLoginPage();
		lp.enterEmailPassword("kishore.k@marmeto.com", "12345");
		lp.clickLoginButton();
		lp.verifyLogin("PASS");
		lp.moveToHomePage();
		String expectedTitle = hp.addToCartProdcutFromBestseller(3);
		AjaxCart ac = new AjaxCart(driver);
		String actualTitle = ac.getProdcutTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Prodcut in cart is not matching.");
		ac.clickOnNetbankingOthers();
	}
	
	@Test
	public void ATCFormCollectionPage() throws Exception {
		Home hp = new Home(driver);
//		hp.clickAccountIcon();
//		Login lp = new Login(driver);
//		lp.verifyLoginPage();
//		lp.enterEmailPassword("kishore.k@marmeto.com", "12345");
//		lp.clickLoginButton();
//		lp.verifyLogin("PASS");
//		lp.moveToHomePage();
		hp.moveToShopByCategory(hp.allJewellery);
		PLP plp = new PLP(driver);
		String expectedTitle = plp.addFirstAvailableProductToCart();
		AjaxCart ac = new AjaxCart(driver);
		String actualTitle = ac.getProdcutTitle();
		Thread.sleep(2000);
		Assert.assertEquals(expectedTitle, actualTitle, "Prodcut in cart is not matching");	
		ac.clickOnNetbankingOthers();
		Checkout co = new Checkout(driver);
		co.enterEmailAddressPassword("kishore.k@marmeto.com", "kishore", "test", "Marmeto, HSR,", "3rd floor", "Bengaluru", "Karnataka", "560102", "9999999999");
		co.clickOnContinueToPayment();
		co.selectPaymentMethod();
	}
	
	@Test
	public void ATCFormPDP() throws Exception {
		Home hp = new Home(driver);
//		hp.clickAccountIcon();
//		Login lp = new Login(driver);
//		lp.verifyLoginPage();
//		lp.enterEmailPassword("kishore.k@marmeto.com", "12345");
//		lp.clickLoginButton();
//		lp.verifyLogin("PASS");
//		lp.moveToHomePage();
		hp.moveToShopByCategory(hp.allJewellery);
		PLP plp = new PLP(driver);
		String expectedTitle = plp.clickOnFirstAvailableProduct();
		PDP pdp = new PDP(driver);
		pdp.verifyProductDiscriptionPage(expectedTitle);
		pdp.addProductToCart();
		Thread.sleep(1000);
		AjaxCart ac = new AjaxCart(driver);
		String actualTitle = ac.getProdcutTitle();
		Thread.sleep(2000);
		Assert.assertEquals(actualTitle, expectedTitle, "Product in cart is not matching.");	
		ac.clickOnNetbankingOthers();
		}

}
