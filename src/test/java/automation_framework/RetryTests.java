package automation_framework;

import automation_framework.runners.Retry;
import automation_framework.runners.RetryRule;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class RetryTests {

    @Rule
    public RetryRule rule = new RetryRule(5);

    @Test
    @Retry
    public void testToRetry() {
        Assert.assertEquals(1, 0);
    }

}