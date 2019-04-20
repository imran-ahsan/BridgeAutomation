package BridgeTest.Com.Bridge.Test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.pages.BridgeHomePage;
import com.bridge.pages.BridgeLoginPage;

public class BridgeHomeTest extends BridgeBase{
	
	
	BridgeLoginPage logPage;
	BridgeHomePage homePage;
	
	public BridgeHomeTest() {
		
		super();
	}
	@BeforeTest
	public void setUp() {
		Initialization();
		 logPage= new BridgeLoginPage();
		 
		 homePage = logPage.login(prop1.getProperty("username"), prop1.getProperty("password"));
						
	}
	
	@Test(priority=4)
	public void validateUser() {
		
		String hUser= homePage.validateHomeUser();
		System.out.println(hUser);
		
		Assert.assertTrue(hUser.contains("sudhanshu.gupta"));
		
	}
	
	
	@AfterTest
	public void teardown() {
		
		driver.quit();
	}
	

}
