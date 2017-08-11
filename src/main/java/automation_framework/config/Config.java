package automation_framework.config;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Config {

    @JsonIgnore
    public static final Config EMPTY = new Config();

    @JsonProperty
    private String browser = "firefox";

    private Config(){

    }

    public String getBrowser() {
        return browser;
    }

}
