package automation_framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 * Created by joaquin on 1/8/2017.
 */
public class GoogleSearchResults {

    @FindBy(css = "h3 > a")
    private List<WebElement> results;

    public List<String> getResultsTexts() {
        return results.stream().map(WebElement::getText).collect(toList());
    }

}
