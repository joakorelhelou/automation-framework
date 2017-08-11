package automation_framework.tests;

import automation_framework.logging.Logging;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static automation_framework.config.CommonSettings.COMMON;


public class BaseTests implements Logging {
    public static WebDriverManager driverManager;

    @BeforeClass
    public static void beforeClass() {
        driverManager = new WebDriverManager(COMMON.getBrowser());
        driverManager.setImplicitWait(30);
    }

    @Before
    public void beforeTest() {
        driverManager.deleteCookies();
    }

    @AfterClass
    public static void afterClass() {
        driverManager.quitBrowser();
    }


}
