package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// 1. identify the web element 

      @FindBy( name = "username" )
		private WebElement usernameEdit;
      
      @FindBy( name = "pwd")
      private WebElement pwdEdit;
      
      @FindBy( id = "loginButton")
      private WebElement lgnEdit;
      
     //2. constructor 
      
      public LoginPage(WebDriver driver) 
      {
    	  PageFactory.initElements(driver,this );
      }

	public WebElement getUsernameEdit() {
		return usernameEdit;
	}

	public WebElement getPwdEdit() {
		return pwdEdit;
	}

	public WebElement getLgnEdit() {
		return lgnEdit;
	}
      
	
	//business library
	
		public void loginToApp(String USERNAME, String PASSWORD)
		{
			usernameEdit.sendKeys(USERNAME);
			pwdEdit.sendKeys(PASSWORD);
			lgnEdit.click();
		}
      

	

}
