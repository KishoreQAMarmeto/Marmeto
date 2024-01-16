package genericMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://marchjewellery.com/collections/anklets");
		List<WebElement> plpProducts = driver.findElements(By.xpath("//div[@class='CollectionInner__Products']//div[@class='ProductItem ']"));
		List<WebElement> plpName = driver.findElements(By.xpath("//div[@class='CollectionInner__Products']//h2[@class='ProductItem__Title Heading']"));
		List<WebElement> plpPrice = driver.findElements(By.xpath("//div[@class='CollectionInner__Products']//span[@class='ProductItem__Price Price']"));
		List<WebElement> plpATC = driver.findElements(By.xpath("//div[@class='CollectionInner__Products']//button[@class='ProductForm__AddToCart Button Button--secondary Button--full']"));

		int productNum = 16;
		String expectedTitle = null;
		int indexToInteractWith = productNum - 1;
        if (indexToInteractWith >= 0 && indexToInteractWith < plpProducts.size()) {
            expectedTitle = plpName.get(indexToInteractWith).getText();
            String price = plpPrice.get(indexToInteractWith).getText();
            String atcButton = plpATC.get(indexToInteractWith).getText();
            if(atcButton.equals("OUT OF STOCK")) {
            	productNum = productNum--;
            }
            System.out.println(price);
            System.out.println(atcButton);
//            plpATC.get(indexToInteractWith).click();
        } else {
            System.out.println("Invalid Product no. specified. The plp does not have a prodcut at no. " + productNum);
            expectedTitle = "No product";
        }
        System.out.println(expectedTitle);
        
//		WebElement newArrivalsShopAll = driver.findElement(By.xpath(""));
//		List<WebElement> newArrivalsProducts = driver.findElements(By.xpath("//div[@id='shopify-section-162642984527f0e277']//div[@class='ProductItem ']"));
//		List<WebElement> newArrivalsName = driver.findElements(By.xpath("//div[@id='shopify-section-162642984527f0e277']//a[@class='ProductItem__name']"));
//		List<WebElement> newArrivalsPrice = driver.findElements(By.xpath("//div[@id='shopify-section-162642984527f0e277']//span[@class='ProductItem__Price Price']"));
//		List<WebElement> newArrivalsCompareAtPrice = driver.findElements(By.xpath("//div[@id='shopify-section-162642984527f0e277']//span[@class='ProductItem__Price Price Price--compareAt']"))
//		List<WebElement> newArrivalsATC = driver.findElements(By.xpath("//div[@id='shopify-section-162642984527f0e277']//form[@action='/cart/add']"));
//		List<WebElement> newArrivalsWishlist = driver.findElements(By.xpath("//div[@id='shopify-section-162642984527f0e277']//button[@data-swaction='addToWishlist']"));

//		int i = 1;
//		for(WebElement single : newArrivalsProducts) {
//			
//			System.out.println("Product " + i);
//			System.out.println(single.getText());
//			System.out.println("---------------------------------");
//			i++;
//		}
//		int num = 1;
//        int indexToInteractWith = num - 1; 
//        if (indexToInteractWith >= 0 && indexToInteractWith < newArrivalsProducts.size()) {
//            newArrivalsProducts.get(indexToInteractWith).getText();
//            newArrivalsName.get(indexToInteractWith).getText();
//            newArrivalsPrice.get(indexToInteractWith).getText();
//            newArrivalsATC.get(indexToInteractWith).click();
//        } else {
//            System.out.println("Invalid index specified. The list does not have an element at index " + indexToInteractWith);
//        }
		
		
//		driver.get("https://marchjewellery.com/collections/all-jewellery");
//		driver.findElement(By.xpath("(//button[@class='ProductForm__AddToCart Button Button--secondary Button--full'])[1]")).click();
//		driver.findElement(By.xpath("(//button[@class='ProductForm__AddToCart Button Button--secondary Button--full'])[7]")).click();
//		
//		WebElement procut1 = driver.findElement(By.xpath("//div[@class='CartItemWrapper']"));
//		System.out.println(procut1.getText());
		
		
//		driver.get("https://marchjewellery.com/collections/all-jewellery/category_anklets?sort_by=price-ascending");		
//		WebElement product1 = driver.findElement(By.xpath("(//div[@class='ProductItem '])[1]"));
//		WebElement product2 = driver.findElement(By.xpath("(//div[@class='ProductItem '])[2]"));
//		
//		WebElement product2ATC = driver.findElement(By.xpath("(//button[@class='ProductForm__AddToCart Button Button--secondary Button--full'])[2]"));
//
//		String str = product2.getText();
//		System.out.println(str);
//		String strArray[] = str.split("\n");
//		System.out.println(strArray[0]);
//		product2ATC.click();
//		System.out.println(product2ATC.getText());
		
//		if(str.contains("Add to cart")) {
//			product1.click();
//		}else{
//			product2.click();
//		}
		
//		WebElement reviewframe = driver.findElement(By.xpath("//iframe[@title='Carousel cards reviews widget']"));
//		driver.switchTo().frame(reviewframe);
//		WebElement review = driver.findElement(By.xpath("(//div[@data-ref='carousel-card'])[1]"));	
//		review.click();
//		driver.switchTo().defaultContent();
		
//		WebElement bestsellersText = driver.findElement(By.xpath("//section[@class='Section Section--spacingNormal_custom']"));
//		WebElement product1 = bestsellersText.findElement(By.xpath("//div[@class='Carousel__Cell is-selected'][1]"));
//		System.out.println(product1.getText());
		
		
		
//		WebElement prduct = driver.findElement(By.xpath("(//section[@class='Section Section--spacingNormal_custom']//div[@class='Carousel__Cell is-selected'])[2]"));
//		String productName = prduct.getText();
//		System.out.println(productName);
		
//		WebElement product = driver.findElement(By.xpath("(//div[@class='blocks1'])[1]"));
//		
//		String ptitle = product.getText();
//		System.out.println(ptitle);
		
//		List<WebElement> collections = driver.findElements(By.xpath("//div[@class='blocks1']"));
//		
//		List<String> collectionTexts = collections.stream().map(WebElement::getText).toList();
//		
//        for (String collectionText : collectionTexts) {
//    		WebElement collectionLink = driver.findElement(By.xpath("(//p[text()= '" + collectionText + "']/parent::div)[2]"));//"//a[contains(text(), '" + collectionText + "')]"
//            collectionLink.click();
//            // Verification: Check if the PDP title contains the collection text
//            try {
//                String pdpTitle = driver.getTitle();
//                if (!pdpTitle.contains(collectionText)) {
//                    throw new AssertionError("PDP title does not contain the expected collection text.");
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//                // Log or handle the failure as needed
//            }
//
//            // Navigate back to the home page for the next iteration
//            driver.navigate().back();
//        }
		//(//p[text()= 'Rings']/parent::div)[2]
//		String collectionText = "Rings";
//		driver.findElement(By.xpath("(//p[text()= '" + collectionText + "']/parent::div)[2]")).click();
//		driver.quit();
		
		//-------------------------bannergettitle-------------------//
//		driver.get("https://marchjewellery.com");
//		
//		int numberOfIterations = 5; // Adjust the number of iterations as needed
//
//		for (int i = 0; i < numberOfIterations; i++) {
//			WebElement banner = driver.findElement(By.id("shopify-section-slideshow"));
//		    banner.click();
//		    System.out.println(driver.getTitle());
//		    driver.navigate().back();
//		    WebElement bannerNext = driver.findElement(By.xpath("(//button[@aria-label='next'])[1]"));
//
//		    for (int j = 0; j <= i; j++) {
//		        bannerNext.click();
//		        Thread.sleep(1000);
//		    }
//		}

		

	}

}
