package marmeto.marchJewellery;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://marchjewellery.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement account = driver.findElement(By.xpath("//a[@class='Header__Icon Icon-Wrapper Icon-Wrapper--clickable hidden-phone']"));	
		account.click();
		WebElement createAccount = driver.findElement(By.xpath("//a[contains(@href, '/account/register')]"));
		createAccount.click();
		
		WebElement createAccountBtn = driver.findElement(By.xpath("//button[@type='submit'][1]"));
		WebElement firstNameTb = driver.findElement(By.xpath("//input[@name='customer[first_name]']"));
		WebElement lastNameTb = driver.findElement(By.xpath("//input[@name='customer[last_name]']"));
		WebElement emailTb = driver.findElement(By.xpath("//input[@name='customer[email]']"));
		WebElement passwordTb = driver.findElement(By.xpath("//input[@name='customer[password]']"));
		
		//without entering anything
		firstNameTb.sendKeys("");
		lastNameTb.sendKeys("");
		emailTb.sendKeys("");
		passwordTb.sendKeys("");
		createAccountBtn.click();
		
		if(driver.getTitle().equals("Create Account - March Jewellery by FableStreet")) {
			System.out.println("tc1 pass");
		}else {
			System.out.println("tc1 fail");
		}
		
		//without entering password
		firstNameTb.sendKeys("Test");
		lastNameTb.sendKeys("One");
		emailTb.sendKeys("test@test.com");
		passwordTb.sendKeys("");
		createAccountBtn.click();
		
		if(driver.getTitle().equals("Create Account - March Jewellery by FableStreet")) {
			System.out.println("tc2 pass");
		}else {
			System.out.println("tc2 fail");
		}
		
		//without entering gmail and password
		firstNameTb.clear();
		firstNameTb.sendKeys("Test");
		lastNameTb.clear();
		lastNameTb.sendKeys("One");
		emailTb.clear();
		emailTb.sendKeys("");
		passwordTb.sendKeys("");
		createAccountBtn.click();
		
		if(driver.getTitle().equals("Create Account - March Jewellery by FableStreet")) {
			System.out.println("tc3 pass");
		}else {
			System.out.println("tc3 fail");
		}
		
		//password length less than 5 char
		firstNameTb.clear();
		firstNameTb.sendKeys("test");
		lastNameTb.clear();
		lastNameTb.sendKeys("One");
		emailTb.sendKeys("test@marmeto.co");
		passwordTb.sendKeys("1");
		createAccountBtn.click();
		
		List<WebElement> passwordAlert = driver.findElements(By.xpath("//li[text()=' is too short (minimum is 5 characters)']"));
		if(!passwordAlert.isEmpty()) {
			System.out.println("tc4 pass");
		}else {
			System.out.println("tc4 fail");
		}
		System.out.println("breakpoint");
		
		driver.switchTo().frame(0);
		WebElement captcha = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
		captcha.click();
		driver.switchTo().defaultContent();
		
		WebElement submitBtn = driver.findElement(By.xpath("//input[@class='shopify-challenge__button btn']"));
		submitBtn.click();	
		System.out.println("breakpoin1");
		
//		WebElement createAccountBtn1 = driver.findElement(By.xpath("//button[@type='submit'][1]"));
//		WebElement firstNameTb1 = driver.findElement(By.xpath("//input[@name='customer[first_name]']"));
//		WebElement lastNameTb1 = driver.findElement(By.xpath("//input[@name='customer[last_name]']"));
//		WebElement emailTb1 = driver.findElement(By.xpath("//input[@name='customer[email]']"));
//		WebElement passwordTb1 = driver.findElement(By.xpath("//input[@name='customer[password]']"));
//		
//		//without entering password
//		firstNameTb1.sendKeys("Test");
//		lastNameTb1.sendKeys("One");
//		emailTb1.sendKeys("test@test.com");
//		passwordTb1.sendKeys("");
//		createAccountBtn1.click();
//		
//		if(driver.getTitle().equals("Create Account - March Jewellery by FableStreet")) {
//			System.out.println("tc5 pass");
//		}else {
//			System.out.println("tc5 fail");
//		}
//		
//		//with already registered email id
//		firstNameTb1.clear();
//		firstNameTb1.sendKeys("Test");
//		lastNameTb1.clear();
//		lastNameTb1.sendKeys("One");
//		emailTb1.clear();
//		emailTb1.sendKeys("registered@gmail.com");
//		passwordTb1.sendKeys("123456");
//		createAccountBtn1.click();
//		
//		WebElement captcha1 = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
//		captcha1.click();
//		
//		WebElement submitBtn1 = driver.findElement(By.className("recaptcha-checkbox-border"));
//		submitBtn1.click();
//		
//		List<WebElement> emailAlert = driver.findElements(By.xpath("//li[contains(text(),'This email address is already')]"));
//		if(!emailAlert.isEmpty()) {
//			System.out.println("tc6 pass");
//		}else {
//			System.out.println("tc6 fail");
//		}
//		
//		//with valid details
//		firstNameTb1.clear();
//		firstNameTb1.sendKeys("Test");
//		lastNameTb1.clear();
//		lastNameTb1.sendKeys("One");
//		emailTb1.clear();
//		emailTb1.sendKeys("newregistered@gmail.com");
//		passwordTb1.sendKeys("123456");
//		createAccountBtn1.click();
//		
//		WebElement captcha2 = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
//		captcha2.click();
//		
//		WebElement submitBtn2 = driver.findElement(By.className("recaptcha-checkbox-border"));
//		submitBtn2.click();
//		
//		if(driver.getTitle().equals("March Jewellery by FableStreet")) {
//			System.out.println("tc7 pass");
//		}else {
//			System.out.println("tc7 fail");
//		}

	}

}
