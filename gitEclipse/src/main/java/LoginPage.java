

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(name="username")
	private WebElement Username;
	
	@FindBy(name="password")
	private	WebElement Password;
	
	@FindBy(xpath="/html/body/div/div[2]/form/div[3]/div/button")
	private	WebElement Signin;
	
	
		public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


		public WebElement setUsername(String uname) {
			String uname1;
			if(uname==null) {
				uname1="haridas";
			}
			else {
				 uname1=uname;
			}
			Username.sendKeys(uname1);
		
			return Username;
		}


		public WebElement setPassword(String pass) {
			String pass1="123456";
			if(pass==null || pass=="" || pass.equalsIgnoreCase("NA"))
			{
				 pass1 = "123456";
			}else {
				pass1=pass;
			}
			Password.sendKeys(pass1);
			return Password;
		}


		public WebElement setSignin() {
			Signin.click();
			return Signin;
		}
		public void loginConnectUs(String uname ,String pass) {
			
		
		this.setUsername(uname);
		this.setPassword(pass);
		this.setSignin();
			
		}
		
	
	
	

}
