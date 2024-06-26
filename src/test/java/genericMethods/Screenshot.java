package genericMethods;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void takeScreenshot(WebDriver driver) throws Exception
	{
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		String path = "./screenshots/"+new Date().toString().replaceAll(" ", "").replaceAll(":", "")+".png";
		File destination = new File(path);
		FileHandler.copy(src, destination);
	}

}
