package test;

import org.testng.annotations.Test;

import genericMethods.Screenshot;
import genericMethods.ScrollToElement;
import genericMethods.Setup;
import pages.Home;
import pages.PLP;

public class CollectionPageTest extends Setup{

	@Test
	public void collectionPageFilter() throws Exception {
		Home hp = new Home(driver);
		hp.moveToShopByCategory(hp.allJewellery);
		PLP plp = new PLP(driver);
		plp.selectSortLowToHigh();
		plp.selectFilterAnklet();
//		ScrollToElement.scrollToElement(driver, plp.product1);
		plp.clickOnFirstAvailableProduct();
//		Thread.sleep(3000);
//		Screenshot.takeScreenshot(driver);
	}
}
