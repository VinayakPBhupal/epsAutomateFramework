package epsilon.WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Childwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html#google_vignette");
		
		driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		String mainwinID = driver.getWindowHandle();
		System.out.println(mainwinID);
		
		Set<String> allwinIDs = driver.getWindowHandles();
		
		
		for(String winId : allwinIDs)
		{
			if(!winId.equals(mainwinID)) {
				driver.switchTo().window(winId);
				System.out.println("switched to child window");
			}
		}
		
		
		Thread.sleep(1000);
		driver.findElement(By.id("navbarDropdown")).click();
		
		// switching back to main window
		
		driver.switchTo().window(mainwinID);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		
		
		
		
		
		
		
		

	}

}
