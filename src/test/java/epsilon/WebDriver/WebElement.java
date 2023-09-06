package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		org.openqa.selenium.WebElement url = driver.findElement(By.name("username"));
		url.sendKeys("vinayak");
		
		// to enter data in textfield
		
		Thread.sleep(3000);
		
		// to clear the data entered in the field
		
		url.clear();
		
		
		
		String tg = url.getTagName();
		System.out.println(tg);
		
		// to get the attribute name 
		
		String at = url.getAttribute("type");
		System.out.println(at);
		
		
		// to get css value
		
		String cs = url.getCssValue("height");
		System.out.println(cs);
		
		
		System.out.println(url.getCssValue("width"));
		
		
		

	}

}
