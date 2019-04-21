package BridgeTest.Com.Bridge.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BridgeBase {

	public static WebDriver driver;
	public static Properties prop1;

	public BridgeBase() {
		try {
			prop1 = new Properties();
			FileInputStream ip = new FileInputStream(System
					.getProperty("user.dir")+"\\src\\main\\java\\properties\\config.properties");

			prop1.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void Initialization() {

		String browserName = prop1.getProperty("browser");

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\imran.ahsan1\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\imran.ahsan1\\Downloads\\chromedriver\\chromedriver.exe");  old version driver
			
			driver = new ChromeDriver(); 
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Project\\WorkSpace\\geckodriver\\geckodriver.exe");
			
			driver = new FirefoxDriver(); 
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get(prop1.getProperty("url"));

	}

}
