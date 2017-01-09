package automation.framework.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * The WebDriver Manger class.
 * 
 * @author j.rodriguez
 * 
 */

public class WebDriverManager {

	public static WebDriver driver;

	/**
	 * It initializes the web driver with given desired capabilities.
	 * 
	 * @param browser
	 *            the desired capabilities
	 */

	public WebDriverManager(String browser) {

		if (browser.equals("Chrome"))
			driver = new ChromeDriver();
		else if (browser.equals("IE"))
			driver = new InternetExplorerDriver();
		else if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browser.equals("HTMLUnit"))
			driver = new HtmlUnitDriver();
	}

	/**
	 * returns the driver instance
	 * 
	 * @return the driver instance
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * sets the implicit time wait in seconds
	 * 
	 * @param i
	 *            desired wait time in seconds
	 */
	public void setImplicitWait(int i) {
		getDriver().manage().timeouts()
				.implicitlyWait(i, TimeUnit.SECONDS);

	}

	/**
	 * deletes browser cookies
	 */
	public void deleteCookies() {
		getDriver().manage().deleteAllCookies();

	}

	/**
	 * closes the browser
	 */

	public void quitBrowser() {
		getDriver().quit();

	}

}
