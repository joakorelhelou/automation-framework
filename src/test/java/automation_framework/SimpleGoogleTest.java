package automation.framework;

import automation.framework.pages.GoogleHomePage;
import automation.framework.pages.GoogleSearchResults;
import automation.framework.tests.BaseTests;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by joaquin on 1/8/2017.
 */

@RunWith(Parameterized.class)
public class SimpleGoogleTest extends BaseTests {


    @Parameter
    public String sampleParam;

    @Parameters(name = "Parameter {0}")
    public static Iterable<Object> parameters() {
        return asList("Something to", "look forward");
    }

    @Test
    public void searchTest() {


        GoogleHomePage homePage = PageFactory.initElements(driverManager.getDriver(), GoogleHomePage.class);
        homePage.go(driverManager.getDriver());

        Assert.assertNotNull("Sample param is null", sampleParam);

        GoogleSearchResults resultsPage = homePage.search(sampleParam);

        List<String> results = resultsPage.getResultsTexts();

        Assert.assertTrue("Results should be more than 0",
                results.size() > 0);

    }

}
