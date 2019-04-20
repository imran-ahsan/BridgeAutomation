package BridgeTest.Com.Bridge.Test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;

import com.bridge.pages.BridgeHomePage;
import com.bridge.pages.BridgeLoginPage;

public class BridgeLoginTest extends BridgeBase {

	BridgeLoginPage logPage;
	BridgeHomePage homePage;

	public BridgeLoginTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {
		Initialization();
		logPage = new BridgeLoginPage();
	}

	@Test(priority=1)
	public void loginPageTitleTest() throws InterruptedException {
		String title = logPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Log On");
		
	}
	
	
	@Test(priority=2)
	public void loginTest() throws InterruptedException{
		homePage = logPage.login(prop1.getProperty("username"), prop1.getProperty("password"));
		
	}
	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
