package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

public class DataProvider {
	
	@Test(dataProvider = "getdata")
	public void sample(String username, String password) {
		
		System.out.println("username->"+ username + "and password ->"+password);
		
		// TODO Auto-generated method stub
		
				WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demo.actitime.com/login.do");
				
			LoginPage lp = new LoginPage(driver);
			lp.loginToApp(username, password);
			
			//validate for homepage tittle 
			
			String exp_ttile = "actiTIME -  Enter Time-Track";
			String act_tittle = driver.getTitle();
			
			Assert.assertEquals(exp_ttile, act_tittle);
			System.out.println("validated");
	}
	
	@org.testng.annotations.DataProvider
	public Object[][] getdata() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0]="admin";
		data[0][1]="password";
		
		data[1][0]="trainee";
		data[1][1]="trainee";
		
		data[2][0]="hi";
		data[2][1]="hello";
		
		return data;
		
	}

}
