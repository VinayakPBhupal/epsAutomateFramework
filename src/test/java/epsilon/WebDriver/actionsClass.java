package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
//		driver.manage().window().maximize();
//		
//		driver.get("https://amazon.com");
//		
//		WebElement ele = driver.findElement(By.xpath("//div[.='EN']"));
//		
//		Actions act = new Actions(driver);
//		
//		act.moveToElement(ele).perform();
		
		// doubleclick
		
//		driver.get("https://demoqa.com/buttons");
//		driver.manage().window().maximize();
//		
//		WebElement ele1 = driver.findElement(By.id("doubleClickBtn"));
//		
//		Actions act1 = new Actions(driver);
//		
//		Thread.sleep(2000);
//		act1.doubleClick(ele1).perform();
//		
//		// right click
//		Thread.sleep(2000);
//		WebElement ryt = driver.findElement(By.xpath("//button[@id = 'rightClickBtn']"));
//		act1.contextClick(ryt).perform();
//		System.out.println("performed right click");
//		
	// move anywhere on the web page on offset
		driver.manage().window().maximize();
		
		driver.get("https://makemytrip.com");
		Actions act = new Actions(driver);
		act.moveByOffset(0, 0).click().perform();
		
		
				
				
				
				
				
				
// drag and drop operation
				
				
				
		
		
		

	}

}
