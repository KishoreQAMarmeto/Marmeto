package test;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericMethods.Setup;
import pages.Home;
import pages.Search;

public class SearchTest extends Setup{
	
	@DataProvider(name= "testData")
	public Object[][] testData(){
		return new Object[][]{
            {"Ring"},
            {"RING"},
            {"Ri"},
            {"12345"},
            {""},
            {"@#$"}
		};
		
	}
	
	@Test(dataProvider = "testData")
	public void testSearch(String query) throws Exception{
		Home homePage = new Home(driver);
		homePage.clickSearchIcon();
		homePage.searchTb.sendKeys(query, Keys.ENTER);
//		homePage.verifySearchResult();
//		homePage.searchTb.sendKeys(Keys.ENTER);
		
		Search searchPage = new Search(driver);
		searchPage.verifySearchPage();
	
	}

}
