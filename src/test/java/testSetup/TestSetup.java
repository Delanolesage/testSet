package testSetup;

import eu.tsystems.mms.tic.testframework.constants.Browsers;
import eu.tsystems.mms.tic.testframework.testing.TesterraTest;
import eu.tsystems.mms.tic.testframework.testing.WebDriverManagerProvider;
import eu.tsystems.mms.tic.testframework.useragents.ChromeConfig;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
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


    @AfterSuite(alwaysRun = true)
    public void shutdownBrowser() {
        WEB_DRIVER_MANAGER.shutdownAllThreadSessions();
    }

}
