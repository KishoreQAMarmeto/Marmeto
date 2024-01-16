package marmeto.marchJewellery;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://marchjewellery.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement account = driver.findElement(By.xpath("//a[@class='Header__Icon Icon-Wrapper Icon-Wrapper--clickable hidden-phone']"));	
		account.click();
		
		String accTitle = driver.getTitle();
		
		
		WebElement emailTb = driver.findElement(By.xpath("//input[@type='email'][1]"));
		WebElement passwordTb = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		//without entering email and password
		emailTb.sendKeys("");
		passwordTb.sendKeys("");
		submitBtn.click();
		
		if(driver.getTitle().equals(accTitle)) {
			System.out.println("tc1 pass");
		}else {
			System.out.println("tc1 fail");
		}
		
		//only entering email
		emailTb.sendKeys("kishore.k@marmeto.com");
		passwordTb.sendKeys("");
		submitBtn.click();
		
		if(driver.getTitle().equals(accTitle)) {
			System.out.println("tc2 pass");
		}else {
			System.out.println("tc2 fail");
		}
		
		//only entering password
		emailTb.clear();
		passwordTb.sendKeys("qwerty");
		submitBtn.click();
		
		if(driver.getTitle().equals(accTitle)) {
			System.out.println("tc3 pass");
		}else {
			System.out.println("tc3 fail");
		}
		
		//invalid password and email
		emailTb.sendKeys("ksihore@mar.com");
		passwordTb.sendKeys("qwert12345");
		submitBtn.click();
		
		if(driver.getTitle().equals(accTitle)) {
			System.out.println("tc4 pass");
		}else {
			System.out.println("tc4 fail");
		}
		
		//valid email and password
		emailTb.clear();
		emailTb.sendKeys("kishore.k@marmeto.com");
		passwordTb.clear();
		passwordTb.sendKeys("qwerty");
		submitBtn.click();
		
		WebElement headerTx = driver.findElement(By.xpath("//p[@class='SectionHeader__Description']"));
		
		if(headerTx.getText().equals("Welcome back, Kishore!")) {
			System.out.println("tc5 pass");
		}else {
			System.out.println("tc5 fail");
		}
		driver.quit();
	}

}
