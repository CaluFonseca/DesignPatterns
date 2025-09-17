package main.java.com.exemplo.designpatterns.singleton;

public class AppConfig {
    private static AppConfig instance;
    private String appName = "MyApp";

    private AppConfig() {}

    public static AppConfig getInstance() {
        if(instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }
}
