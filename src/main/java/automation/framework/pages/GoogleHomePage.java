package automation.framework.pages;

import automation.framework.tests.BaseTests;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by joaquin on 1/8/2017.
 */
public class GoogleHomePage {

    @FindBy(id = "lst-ib")
    private WebElement searchBox;

    public void go(WebDriver driver){
        driver.get("http://www.google.com");
    }

    public GoogleSearchResults search(String criteria) {
        searchBox.sendKeys(criteria + Keys.ENTER);
        return PageFactory.initElements(BaseTests.driverManager.getDriver(), GoogleSearchResults.class);
    }

}
