package genericMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Setup {
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() throws Exception{
		ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
		options.addArguments("--disable-popup-blocking");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(HandlingPropertyFiles.getProperty("./property/site.properties", "url"));
	}
	
	@AfterMethod
	public void closeApp() throws Exception{
		driver.close();
	}

}
