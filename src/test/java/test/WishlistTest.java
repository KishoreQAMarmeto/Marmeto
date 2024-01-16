package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericMethods.Setup;
import pages.Home;

public class WishlistTest extends Setup{

	@Test(enabled = true)
	public void wishlist() throws Exception {
		Home homePage = new Home(driver);
		String expectedTitle = homePage.addProductToWishlistFromBestseller(4);
		homePage.clickWishlistIcon();	
		String actualTitle = homePage.getWishlistProductTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "product in wishlist is not matching");
	}
	
	
}
