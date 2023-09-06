package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDiv {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		org.openqa.selenium.WebElement url = driver.findElement(By.name("username"));
		url.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		
		WebElement clkOp = driver.findElement(By.xpath("//a[@class='initial']"));
        clkOp.click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id = 'container_tasks']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class= 'img'])[2]")).click();
        System.out.println("checkbox clicked");
        
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//div[@class = 'copyTo button']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='ok button']/following-sibling::div[@class='cancel button'])[5]")).click();
        System.out.println("clicked");
	}

}
