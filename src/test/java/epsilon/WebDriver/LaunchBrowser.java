package epsilon.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		// it will download the updated driver executable
		WebDriver driver= new EdgeDriver();
		
		//load the application - get()
		driver.get("https://flipkart.com");
		System.out.println("flipkart loaded");
		
		//to get the page tittle 
		
		String tittle = driver.getTitle();
		System.out.println(tittle);
		
		//to get the current url of the page
		
//		String u = driver.getCurrentUrl();
//		System.out.println(u);
		
		//to get the  page source code
		
//		String ps = driver.getPageSource();
//		System.out.println(ps);
		
//		// to get the window id(dynamic info, updated every time we launch it)
//		String w = driver.getWindowHandle();
//		System.out.println(w);
		
		driver.manage().window().maximize();
		// similarly minimize
		
		
		
		
//		
		//will close all the existing tabs 
//		driver.quit();
//		System.out.println("browser closed");
		// driver.close(); // will close only the current window
		
		
		}

}
