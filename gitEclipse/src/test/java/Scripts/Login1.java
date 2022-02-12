package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.cunnectus.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login1 {
	WebDriver driver;
	@Test
	public void Login() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		chromeOptions.addArguments("disable-infobars");
		//ChromeDriver driver = new ChromeDriver(chromeOptions);
		
		// Navigate to the demoqa website
		driver.get("http://10.2.11.23/connectus-dummy/admin/login");
		Thread.sleep(3000);
		LoginPage l=new LoginPage(driver);
		l.setUsername("rohanm");
		Thread.sleep(3000);
		l.setPassword("abcd");
		Thread.sleep(3000);
		l.setSignin();
		//l.loginConnectUs("haridas", "password");
		
		driver.quit();

	}



}
