package automation_framework.config;

import automation_framework.logging.Logging;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.InputStream;
import java.util.Optional;

import static java.lang.String.format;
import static java.lang.Thread.currentThread;

/**
 * Created by Usuario on 8/11/2017.
 */
public enum CommonSettings implements Logging {

    COMMON;

    private static final String CONFIG_FILE = "test-settings.yml";

    private final Config config;

    CommonSettings() {
        getLogger().info("Initializing common settings configuration...");
        this.config = readConfig();
    }

    private Config readConfig() {
        Config configuration = null;
        ObjectMapper om = new ObjectMapper(new YAMLFactory());
        InputStream configFile = currentThread().getContextClassLoader().getResourceAsStream(CONFIG_FILE);
        try {
            configuration = om.readValue(configFile, Config.class);
        } catch (Exception e) {
            getLogger().error(format("Error parsing framework config file [%s]. Re-check!", CONFIG_FILE), e);
        }
        return Optional.ofNullable(configuration).orElse(Config.EMPTY);
    }

    public String getBrowser(){ return readConfig().getBrowser(); }
}
