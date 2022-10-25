package testSetup;
/*
import cucumber.api.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import static eu.tsystems.mms.tic.testframework.common.PropertyManager.loadProperties;

public class TestSetup {


    @BeforeSuite
    private Properties checkProperties(String env) {
        switch (env) {
            case "staging":
                System.out.println("Staging properties loaded.");
                return loadProperties("test_" + env + ".properties");
            case "fmb":
                System.out.println("FMb properties loaded.");
                return loadProperties("test_" + env + ".properties");
            case "fmc":
                System.out.println("FMc properties loaded.");
                return loadProperties("test_" + env + ".properties");
            default:
                System.out.println("Default properties loaded.");
        }

        return null;
    }

    /*
    @Before
    public void setupDriver() throws MalformedURLException {
        // BROWSER => chrome / firefox
        // HUB_HOST => localhost / 10.0.1.3 / hostname
        String host = "localhost";
        DesiredCapabilities dc;

        if(System.getProperty("BROWSER") != null &&
                System.getProperty("BROWSER").equalsIgnoreCase("firefox")){
            dc = DesiredCapabilities.firefox();
        }else{
            dc = DesiredCapabilities.chrome();
        }

        if(System.getProperty("HUB_HOST") != null){
            host = System.getProperty("HUB_HOST");
        }

        String completeUrl = "http://" + host + ":4444/wd/hub";
        this.driver = new RemoteWebDriver(new URL(completeUrl), dc);
    }
    *
}
*/