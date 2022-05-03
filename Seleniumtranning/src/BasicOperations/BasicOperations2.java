package BasicOperations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations2 {
	public static void main(String[] args) throws InterruptedException {

		String path = ".\\executables\\chromedriver.exe"; 	
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver1 = new ChromeDriver();	
		Thread.sleep(2000);
		
		driver1.get("https://www.techlistic.com/");
		// implicit wait
		
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Current Page title is: " + driver1.getTitle());
		
	}
}