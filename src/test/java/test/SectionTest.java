package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericMethods.Setup;
import pages.Home;
import pages.PDP;

public class SectionTest extends Setup{
	
	@Test
	public void sectionRedirection() throws Exception {
		Home hp = new Home(driver);
		hp.moveToSection(hp.newArrivalsShopAll, "New Arrivals");
		hp.clickOnLogo();
		hp.moveToSection(hp.bestsellersShopAll, "Bestsellers");
	}
	
	@Test
	public void newArrivalProductsRedirection() {
		Home hp = new Home(driver);
		String expectedTitle = hp.clickOnProdcutFromNewArrival(2);
		PDP pdp = new PDP(driver);
		String actualTitle = pdp.getProdcutTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Not moved to correct pdp.");
	}
	
	@Test
	public void bestsellersProductsRedirection() {
		Home hp = new Home(driver);
		String expectedTitle = hp.clickOnProdcutFromBestseller(2);
		PDP pdp = new PDP(driver);
		String actualTitle = pdp.getProdcutTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Not moved to correct pdp.");
	}

}
