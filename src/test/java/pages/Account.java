package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Account {
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='Header__Logo']/a/img")
	private WebElement companyLogo;
	
	@FindBy(xpath = "//div[@class='SectionHeader']/h1")
	private WebElement myAccountTxt;
	
	@FindBy(css = "a[href='/account/logout']")
	private WebElement logout;
	
	public void verifyAccountPage() throws Exception{
		Assert.assertEquals(myAccountTxt.getText(), "My Account");
	}
	
	public void clickLogout() throws Exception
	{
		logout.click();
	}
	
	public void clickCompanyLogo() throws Exception
	{
		companyLogo.click();
	}
	
	public Account(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

}
