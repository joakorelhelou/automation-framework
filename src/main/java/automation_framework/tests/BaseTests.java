package automation.framework.tests;

import automation.framework.logging.Logging;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public class BaseTests implements Logging {
	public static WebDriverManager driverManager;

	@BeforeClass
	public static void beforeClass(){
		driverManager = new WebDriverManager("Firefox");
		driverManager.setImplicitWait(30);
	}
	
	@Before
	public void beforeTest(){
		driverManager.deleteCookies();
	}

	@AfterClass
	public static void afterClass(){
		driverManager.quitBrowser();
	}


}
