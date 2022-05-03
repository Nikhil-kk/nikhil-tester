package Browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
public static void main(String[] args) {
		
		//Open Chrome browser
		//step-1 executable path
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		//step-2 create an instance of required browser
		WebDriver driver=new ChromeDriver();
		String url = "//demo.actitime.com/";
		driver.get(url); 
	
		String title = driver.getTitle(); 
		int titleLength = driver.getTitle().length();
		//enter google url
		driver.get("https://www.google.com/");
		driver.get("https://demo.actitime.com/");
		System.out.println("Application current Title: "+driver.getTitle());

		System.out.println("title length: "+driver.getTitle().length());
		if(driver.getTitle().equals("actiTIME - Login")) {
			System.out.println("actiTIME - Login page opened successfully...");
		}else {
			System.out.println("Either actiTIME - Login page not opened or its title got changed");
			
		}

		String pageSource = driver.getPageSource(); 
		int pageSourceLength = pageSource.length(); 
		System.out.println("Total length of the Pgae Source is : " + pageSourceLength);
		driver.close();

}
}
