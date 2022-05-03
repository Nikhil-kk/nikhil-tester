package MultipleelementsHandeling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenasamsunglist {
	
	public static void main(String[] args) throws InterruptedException {

		String path = ".\\executables\\chromedriver.exe"; 	
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();	
		Thread.sleep(2000);
		
		driver.get("https://www.gsmarena.com/");
		// implicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// get the web page title
		System.out.println("Current Page title is: " + driver.getTitle());
		// get current web page url
		System.out.println("Current page url: " + driver.getCurrentUrl());
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		List<WebElement> devicename = driver.findElements(By.cssSelector("div[class=makers]>ul>li>a>strong>span"));
		System.out.println("Total Identified Elements: "+devicename.size());
for(int i=0;i<devicename.size();i++) {
			
			WebElement mobile=devicename.get(i);
			String name=mobile.getText();
			System.out.println("Mobile Name: "+name);
}
}}