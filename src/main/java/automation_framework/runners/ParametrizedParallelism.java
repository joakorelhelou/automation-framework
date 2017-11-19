package automation_framework.runners;

/**
 * Created by Usuario on 11/5/2017.
 */
import org.junit.runners.Parameterized;

public class ParametrizedParallelism extends Parameterized {

    public ParametrizedParallelism(Class<?> clazz) throws Throwable {
        super(clazz);
        setScheduler(new ThreadPoolScheduler());
    }
}
