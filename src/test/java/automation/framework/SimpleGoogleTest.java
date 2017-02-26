package automation.framework;

import automation.framework.pages.GoogleHomePage;
import automation.framework.pages.GoogleSearchResults;
import automation.framework.tests.BaseTests;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by joaquin on 1/8/2017.
 */
public class SimpleGoogleTest extends BaseTests{

    @Test
    public void searchTest() {
        GoogleHomePage homePage = PageFactory.initElements(driverManager.getDriver(), GoogleHomePage.class);
        homePage.go(driverManager.getDriver());

        GoogleSearchResults resultsPage = homePage.search("Menem");

        List<String> results = resultsPage.getResultsTexts();

        Assert.assertTrue("Results should be more than 0",
                results.size() > 0);

    }

}
