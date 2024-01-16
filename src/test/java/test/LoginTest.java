package test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericMethods.Setup;
import pages.Home;
import pages.Login;

//@Listeners(MyTestListeners.class)
public class LoginTest extends Setup{
	
	
	@DataProvider(name= "testData")
	public Object[][] testData()
	{
		return new Object[][]{
            {"Kishore.k@marmeto.com", "12345", "PASS"},
//            {"kishore@marmeto.com", "12345", "FAIL"},
//            {"kishroe.k@marmeto.com", "1234567", "FAIL"},
 //           {"kishore@marmeto.com", "1234567", "FAIL"},
            {"", "", "BLOCK"},
            {"kishore.k@marmeto.com", "", "BLOCK"},
            {"", "12345", "BLOCK"},
            {"kishore.k", "12345", "BLOCK"},
            {"kishore.k@", "12345", "BLOCK"},
//            {"kishore.k@marmeto", "12345", "BLOCK"},
            {"7829156580", "12345", "BLOCK"},
            {"~!@#$^&()", "12345", "BLOCK"}
		};
		
	}
	
	@Test(dataProvider = "testData")
	public void testLogin(String email, String password, String status) throws Exception
	{
		Home homePage = new Home(driver);
		homePage.clickAccountIcon();
		
		Login loginPage = new Login(driver);
		loginPage.verifyLoginPage();
		loginPage.enterEmailPassword(email, password);
		loginPage.clickLoginButton();
		loginPage.verifyLogin(status);
		
	}

}
