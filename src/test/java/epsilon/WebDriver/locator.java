package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		// url
		
		driver.get("https://demo.actitime.com/login.do");
		
		// identify the username text field
		
	WebElement usernameTextfield = driver.findElement(By.id("username"));
            System.out.println("username identified");
            
            usernameTextfield.sendKeys("trainee");
//            
//            WebElement passwordTextfield = driver.findElement(By.name("pwd"));
//            System.out.println("password identified");
//            
//            passwordTextfield.sendKeys("tainee");
            
           driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("trainee");
//            
//            // for clicking op
//            
//            WebElement clkOp = driver.findElement(By.xpath("//a[@class='initial']"));
//            
//           clkOp.click();
           
           driver.findElement(By.xpath("//div[text()='Login ']")).click();
//         
            // link text
            
         //   driver.findElement(By.partialLinkText("Forgot")).click();
		
		
            
	}

}
