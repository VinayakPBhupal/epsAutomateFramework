package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popUps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// load the browser
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		// load url
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(1000);
		driver.findElement(By.id("alertButton")).click();
		
		
		Thread.sleep(1000);
	    driver.switchTo().alert().accept();
		System.out.println("alert handled");
		
		
		// confirmation button 
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(1000);
		 String txt = driver.switchTo().alert().getText();
		 System.out.println(txt);
		driver.switchTo().alert().dismiss();
		System.out.println("alert dismissed");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id = 'promtButton']")).click();
		
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Epsilon");
		
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("data entered in the prompt");
		
		

	}

}
