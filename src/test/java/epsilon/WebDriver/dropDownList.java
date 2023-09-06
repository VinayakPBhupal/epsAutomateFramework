package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownList {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,500)", "");
		
		//create an object of select class
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id = 'oldSelectMenu']"));
		
		Select sel = new Select(dropdown);
		sel.selectByIndex(5);
		System.out.println("data selected");
//		
//		Thread.sleep(2000);
//		sel.selectByValue("7");
//		
//		Thread.sleep(2000);
//		sel.selectByVisibleText("Magenta");
		
		WebElement multDrpdwn = driver.findElement(By.xpath("//select[@id = 'cars']"));
		
		Select sls = new Select(multDrpdwn);
		sls.selectByValue("audi");
		
		Thread.sleep(2000);
		sls.selectByVisibleText("Saab");
		
		
		
		
		
		
		
	}

}
