package BridgeTest.Com.Bridge.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Dummy {
	
		public WebDriver driver;
	
	public Dummy() {
			
			System.setProperty("webdriver.chrome.driver", "C:/Project/WorkSpace/chromedriver/chromedriver.exe");
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://portal-test.bridgeinternationalacademies.com/Account/LogOn");
		
	}

}
