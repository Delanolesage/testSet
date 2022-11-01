package testSetup;

import eu.tsystems.mms.tic.testframework.constants.Browsers;
import eu.tsystems.mms.tic.testframework.testing.TesterraTest;
import eu.tsystems.mms.tic.testframework.testing.WebDriverManagerProvider;
import eu.tsystems.mms.tic.testframework.useragents.ChromeConfig;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

public class TestSetup extends TesterraTest implements WebDriverManagerProvider {

    /*
    @BeforeSuite
    public void setupBrowser() throws MalformedURLException {
        DesktopWebDriverRequest request = new DesktopWebDriverRequest();
        request.setBaseUrl("https://duckduckgo.com/");
        request.setBrowser(Browsers.chrome);
        WebDriver driver = WEB_DRIVER_MANAGER.getWebDriver(request);
    }*/
    @BeforeSuite
    public void configureChromeOptions() {
        WEB_DRIVER_MANAGER.setUserAgentConfig(Browsers.chromeHeadless, new ChromeConfig() {
            @Override
            public void configure(ChromeOptions options) {
                options.addArguments("--disable-dev-shm-usage");
            }
        });
    }


    /*
    @BeforeSuite
    private Properties checkProperties(String env) {

        switch (env) {
            case "staging":
                System.out.println("Staging properties loaded.");
                return loadProperties("test_" + env + ".properties");
            case "null":
                System.out.println("FMb properties loaded.");
                return loadProperties("test_" + env + ".properties");
            case "fmc":
                System.out.println("FMc properties loaded.");
                return loadProperties("test_" + env + ".properties");
            default:
                System.out.println("Default properties loaded.");
        }

        return null;
    }*/

    /*
    @Override
    public boolean loadProperties(String resourceFile) {
        return false;
    }*/


    /*
    @BeforeMethod
    public void setupDriver() {
        PROPERTY_MANAGER.loadProperties("test.properties");
        DesktopWebDriverRequest request = new DesktopWebDriverRequest();
        request.setBrowser(Browsers.chrome);
        request.setShutdownAfterTest(false);
        WebDriver driver = WEB_DRIVER_MANAGER.getWebDriver(request);
        /*
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

    }*/

}
