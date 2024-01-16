package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericMethods.Screenshot;

public class Search {

	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='Header__Icon Icon-Wrapper Icon-Wrapper--clickable hidden-phone']")
	public WebElement product;
	
	@FindBy(xpath = "//a[@data-action = 'toggle-search'][1]")
	public WebElement searchIcn;
	
	public void verifySearchPage()throws Exception{
		Assert.assertTrue(driver.getTitle().contains("Search"));
		Screenshot.takeScreenshot(driver);
	}

	public Search(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
}
