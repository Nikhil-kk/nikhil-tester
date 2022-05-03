package BasicOperations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicOperations {
	public static void main(String[] args) throws InterruptedException {

		String path = ".\\executables\\chromedriver.exe"; 	
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();	
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/");
		// implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// get the web page title
		System.out.println("Current Page title is: " + driver.getTitle());
		// get current web page url
		System.out.println("Current page url: " + driver.getCurrentUrl());
					
		driver.findElement(By.linkText("Best Sellers")).click();
		System.out.println("Current Page title is: " + driver.getTitle());
		String expectedTitle="Amazon.in Bestsellers: The most popular items on Amazon";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Best Sellers page opened sucessfully...");
		}else {
			System.out.println("Either login page not opened or page title got changed");
		}
		
		//Navigation in browser
		Thread.sleep(2000);
		//go to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("Current Page title is: " + driver.getTitle());
		String expctednewtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String acttitle=driver.getTitle();
		if(acttitle.equals(expctednewtitle)) {
			System.out.println("Navigated back sucessfully...");
		}else {
			System.out.println("Either login page not opened or page title got changed");
		}
		
		driver.findElement(By.linkText("Mobiles")).click();
		System.out.println("Current Page title is: " + driver.getTitle());
		String MobileTitle="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		String actualmobileTitle=driver.getTitle();
		if(actualmobileTitle.equals(MobileTitle)) {
			System.out.println("Mobile page opened sucessfully...");
		}else {
			System.out.println("Either Mobile page not opened or page title got changed");
		}
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println("Current Page title is: " + driver.getTitle());
		if(acttitle.equals(expctednewtitle)) {
			System.out.println("Navigated back to home page again...");
		}else {
			System.out.println("Either login page not opened or page title got changed");
		}
		
	driver.close();
	}
}
