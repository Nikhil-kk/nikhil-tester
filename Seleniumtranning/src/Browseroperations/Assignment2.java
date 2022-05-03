package Browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
public static void main(String[] args) {
		
	
	String path = ".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		String url = "//www.facebook.com/";
		driver.get(url); 
	
		String title = driver.getTitle(); 
		int titleLength = driver.getTitle().length();
		
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		System.out.println("Application current Title: "+driver.getTitle());

		System.out.println("title length: "+driver.getTitle().length());
		if(driver.getTitle().equals("Facebook – log in or sign up")) {
		System.out.println("Facebook Login page opened successfully...");
		}else {
		System.out.println("Either Facebook Login page not opened or its title got changed");
		}	
		
		String pageSource = driver.getPageSource(); 
		int pageSourceLength = pageSource.length(); 
		System.out.println("Total length of the Page Source is : " + pageSourceLength);
		driver.close();

}
}
