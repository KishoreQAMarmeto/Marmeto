package test;

import org.testng.annotations.Test;

import genericMethods.Setup;
import pages.Home;

public class HeaderTest extends Setup{
	
	@Test(enabled = true)
	public void headerRedirection1() {
		Home hp = new Home(driver);
		hp.moveToShopByCategory(hp.rings);
		hp.moveBack();
		hp.moveToShopByCategory(hp.bracletsAndBangles);
		hp.moveBack();
		hp.moveToShopByCategory(hp.earrings);
		hp.moveBack();
		hp.moveToShopByCategory(hp.anklets);
		hp.moveBack();
		hp.moveToShopByCategory(hp.toeRings);
		hp.moveBack();
		hp.moveToShopByCategory(hp.necklaces);
		hp.moveBack();
		hp.moveToShopByCategory(hp.mangalsutras);
		hp.moveBack();
		hp.moveToShopByCategory(hp.coupleRings);
		hp.moveBack();
		hp.moveToShopByCategory(hp.nosePins);
		hp.moveBack();
		hp.moveToShopByCategory(hp.jewellerySets);
		hp.moveBack();
	}
	
	@Test()
	public void headerRedirection2() {
		Home hp = new Home(driver);
		hp.moveToShopByCollection(hp.shineInSolitaire);
		hp.moveBack();
		hp.moveToShopByCollection(hp.eternalPearls);
		hp.moveBack();
		hp.moveToShopByCollection(hp.colourfulGemstones);
		hp.moveBack();
		hp.moveToShopByCollection(hp.officeEssentials);
		hp.moveBack();
		hp.moveToShopByCollection(hp.everydaySilverly);
		hp.moveBack();
		hp.moveToShopByCollection(hp.partyEssentials);
		hp.moveBack();
		hp.moveToShopByCollection(hp.marchSignatures);
		hp.moveBack();
	}
	
	@Test()
	public void headerRedirection3() {
		Home hp = new Home(driver);
		hp.moveToGiftsByPrice(hp.under999);
		hp.moveBack();
		hp.moveToGiftsByPrice(hp.under1999);
		hp.moveBack();
		hp.moveToGiftsByPrice(hp.between1999to3499);
		hp.moveBack();
		hp.moveToGiftsByPrice(hp.above3499);
		hp.moveBack();
	}
	
	@Test()
	public void headerRedirection4() {
		Home hp = new Home(driver);
//		hp.moveToGiftsByOccasion(hp.christmasSecretSanta);
//		hp.moveBack();
		hp.moveToGiftsByOccasion(hp.wedding);
		hp.moveBack();
		hp.moveToGiftsByOccasion(hp.birthday);
		hp.moveBack();
		hp.moveToGiftsByOccasion(hp.anniversary);
		hp.moveBack();
		hp.moveToGiftsByOccasion(hp.milestone);
		hp.moveBack();
		hp.moveToGiftsByOccasion(hp.festivals);
		hp.moveBack();
		hp.moveToGiftsByOccasion(hp.justLikeThat);
		hp.moveBack();
	}
	
	@Test()
	public void headerRedirection5() {
		Home hp = new Home(driver);
		hp.moveToGiftsByRelation(hp.mother);
		hp.moveBack();
		hp.moveToGiftsByRelation(hp.partner);
		hp.moveBack();
		hp.moveToGiftsByRelation(hp.himHer);
		hp.moveBack();
		hp.moveToGiftsByRelation(hp.sister);
		hp.moveBack();
		hp.moveToGiftsByRelation(hp.friend);
		hp.moveBack();
		hp.moveToGiftsByRelation(hp.yourself);
		hp.moveBack();
	}
	
	@Test()
	public void headerRedirection6() {
		Home hp = new Home(driver);
		hp.moveToValueDeals(hp.lowestPriceDeals);
		hp.moveBack();
		hp.moveToValueDeals(hp.silverClearanceUpTo70Off);
		hp.moveBack();
		hp.moveToValueDeals(hp.brassClearanceUnder999);
		hp.moveBack();

	}
	
	@Test
	public void TestHomePageCollectRedirection() {
		Home hp = new Home(driver);
		hp.homeCollection(hp.shopByPriceUnder999, "Gifts Under 999 - March Jewellery by FableStreet");
		hp.moveBack();
		hp.homeCollection(hp.shopByPriceUnder1999, "Gifts Under 1999 - March Jewellery by FableStreet");
		hp.moveBack();
		hp.homeCollection(hp.shopByPriceBetween1999to3499, "Gifts Between 1999-3499 - March Jewellery by FableStreet");
		hp.moveBack();
		hp.homeCollection(hp.shopByPriceAbove3499, "Gifts Above 3499 - March Jewellery by FableStreet");
		hp.moveBack();
		hp.homeCollection(hp.giftYourLovedOnesPartner, "Gifts for Partner - March Jewellery by FableStreet");
		hp.moveBack();
		hp.homeCollection(hp.giftYourLovedOnesMother, "Gifts for Mother - March Jewellery by FableStreet");
		hp.moveBack();
		hp.homeCollection(hp.giftYourLovedOnesSister, "Gifts for Sister - March Jewellery by FableStreet");
		hp.moveBack();
		hp.homeCollection(hp.giftYourLovedOnesFriend, "Gifts for Friend - March Jewellery by FableStreet");
		hp.moveBack();
		hp.homeCollection(hp.giftYourLovedOnesHimHer, "Gifts for Him & Her - March Jewellery by FableStreet");
		hp.moveBack();
		hp.homeCollection(hp.giftYourLovedOnesYourself, "Gifts for Yourself - March Jewellery by FableStreet");
		hp.moveBack();		
	}
	
}
