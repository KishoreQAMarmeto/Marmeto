package test;

import org.testng.annotations.Test;

import genericMethods.Setup;
import pages.Home;

public class ReviewTest extends Setup{

	@Test
	public void reviewPopUP() throws Exception {
		Home hp = new Home(driver);
		hp.verifyReview(hp.review1);	
	}
}
