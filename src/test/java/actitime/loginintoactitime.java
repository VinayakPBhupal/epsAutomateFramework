package actitime;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public  class loginintoactitime {

	@Test
	public void loginToApp()
	{
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		
	LoginPage lp = new LoginPage(driver);
	lp.loginToApp("admin", "manager");
	
	// validation
	
	String exp_ttile = "actiTIME -  Enter Time-Track";
	String act_tittle = driver.getTitle();
	
	Assert.assertEquals(exp_ttile, act_tittle);
	System.out.println("validated");

	}
	
	
	

}
