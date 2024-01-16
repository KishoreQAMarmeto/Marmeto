package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import genericMethods.Setup;
import pages.Home;

public class BannerTest extends Setup{

	@Test
	public void imageCollections() throws Exception {
		Home homePage = new Home(driver);
		homePage.ringsImg.click();
		assertTrue(driver.getTitle().contains("Buy Silver Rings Online "), "Page title contains: " + driver.getTitle());
		homePage.clickOnLogo();
		homePage.braceletsImg.click();
		assertTrue(driver.getTitle().contains("Buy Bracelets For Women |"), "Page title contains: " + driver.getTitle());
		homePage.clickOnLogo();
		homePage.coupleRingsImg.click();
		assertTrue(driver.getTitle().contains("Silver Couple Rings "), "Page title contains: " + driver.getTitle());
		homePage.clickOnLogo();
		homePage.necklacesImg.click();
		assertTrue(driver.getTitle().contains("Buy Fine Silver Necklaces "), "Page title contains: " + driver.getTitle());
		homePage.clickOnLogo();
		homePage.earringsImg.click();
		assertTrue(driver.getTitle().contains("Buy Silver Earrings Online |"), "Page title contains: " + driver.getTitle());
		homePage.clickOnLogo();
		homePage.jewellerySetsImg.click();
		assertTrue(driver.getTitle().contains("Shop Sparkling Jewellery Sets |"), "Page title contains: " + driver.getTitle());
		homePage.clickOnLogo();
		homePage.nosePinsImg.click();
		assertTrue(driver.getTitle().contains("Buy Silver Nose Pins "), "Page title contains: " + driver.getTitle());
		homePage.clickOnLogo();
		homePage.mangalsutrasImg.click();
		assertTrue(driver.getTitle().contains("Mangalsutras"), "Page title contains: " + driver.getTitle());
		homePage.clickOnLogo();
		homePage.toeRingsImg.click();
		assertTrue(driver.getTitle().contains("Toe Rings "), "Page title contains: " + driver.getTitle());
		homePage.clickOnLogo();
		homePage.ankeltsImg.click();
		assertTrue(driver.getTitle().contains("Anklets "), "Page title contains: " + driver.getTitle());
		homePage.clickOnLogo();
	}
	
	@Test
    public void banner() throws Exception {
        Home hp = new Home(driver);

        hp.clickBannerAndVerify("Bestsellers", 1);
        hp.clickBannerAndVerify("New Arrivals", 2);
        hp.clickBannerAndVerify("Lowest Price Deals", 3);
        hp.clickBannerAndVerify("Gifting", 4);
//        hp.clickBannerAndVerify(hp, "Lowest Price Deals", 5);
//        hp.clickBannerAndVerify(hp, "Special Price", 6);

    }


}
