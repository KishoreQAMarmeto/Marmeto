package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import genericMethods.Setup;
import pages.Home;

public class FooterTest extends Setup{
	
	@Test(enabled = true)
	public void footerRedirection() throws Exception {
		Home homePage = new Home(driver);
		homePage.ourStory.click();
		assertTrue(driver.getTitle().contains("About-us"), "OurStory Page title contains: " + driver.getTitle());
		homePage.moveBack();
		homePage.jwelleryCare.click();
		assertTrue(driver.getTitle().contains("Jewellery Care"), "JewelleryCare Page title contains: " + driver.getTitle());
		homePage.moveBack();
		homePage.warrenty.click();
		assertTrue(driver.getTitle().contains("Warranty Information"), "Warranty Page title contains: " + driver.getTitle());
		homePage.moveBack();
		homePage.productFAQs.click();
		assertTrue(driver.getTitle().contains("FAQs"), "Product FAQs Page title contains: " + driver.getTitle());
		homePage.moveBack();
		homePage.sitemap.click();
		assertTrue(driver.getTitle().contains("SITEMAP"), "SITEMAP Page title contains: " + driver.getTitle());
		homePage.moveBack();
		homePage.orderFAQ.click();
		assertTrue(driver.getTitle().contains("FAQs"), "Orders FAQs Page title contains: " + driver.getTitle());
		homePage.moveBack();
		homePage.shippingDeliveryPolicy.click();
		assertTrue(driver.getTitle().contains("Shipping & Delivery Policy"), "Shipping & Delivery Policy Page title contains: " + driver.getTitle());
		homePage.moveBack();
		homePage.returnsExchangePolicy.click();
		assertTrue(driver.getTitle().contains("March Jewellery by FableStreet"), "Return/Exchange Page title contains: " + driver.getTitle());
		homePage.moveBack();
		homePage.termsConditions.click();
		assertTrue(driver.getTitle().contains("Terms of use"), "Terms of use Page title contains: " + driver.getTitle());
		homePage.moveBack();
		homePage.privacyPolicy.click();
		assertTrue(driver.getTitle().contains("Privacy Policy"), "Privacy Policy Page title contains: " + driver.getTitle());
		homePage.moveBack();
		homePage.returnExchange.click();
		assertTrue(driver.getTitle().contains("March Jewellery by FableStreet"), "Return Exchange Page title contains: " + driver.getTitle());
		homePage.moveBack();
	}

}
