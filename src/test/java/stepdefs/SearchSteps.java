package stepdefs;

import eu.tsystems.mms.tic.testframework.testing.PageFactoryProvider;
import eu.tsystems.mms.tic.testframework.testing.WebDriverManagerProvider;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Searchpage;
import testSetup.TestSetup;

/**
 * This is our Steps definition class
 * It is linked to our Feature file steps through the annotations
 */
public class SearchSteps extends TestSetup implements WebDriverManagerProvider, PageFactoryProvider {
//public class searchSteps extends TesterraTest implements WebDriverManagerProvider, PageFactoryProvider {

    @Test
    @Given("^I am on the website$")
    public void launchSite() {
        WebDriver driver = WEB_DRIVER_MANAGER.getWebDriver();
        Searchpage searchPage = PAGE_FACTORY.createPage(Searchpage.class);
        searchPage.goTo();
    }

    @Test
    @And("^I enter the \"([^\"]*)\" to search$")
    public void enterKeyword(String keyword) {
        Searchpage searchPage = PAGE_FACTORY.createPage(Searchpage.class);
        searchPage.doSearch(keyword);
    }

    @Test
    @And("^I navigate to videos search$")
    public void navigateTovideos()  {
        Searchpage searchPage = PAGE_FACTORY.createPage(Searchpage.class);
        searchPage.goToVideos();
    }

    @Test
    @Then("^I should get minimum (\\d+) search results$")
    public void verifySearchResults(int min) {
        Searchpage searchPage = PAGE_FACTORY.createPage(Searchpage.class);
        int size = searchPage.getResult();
        Assert.assertTrue(size > min);
    }


}
