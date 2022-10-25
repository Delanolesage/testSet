package stepdefs;

import eu.tsystems.mms.tic.testframework.testing.PageFactoryProvider;
import eu.tsystems.mms.tic.testframework.testing.TesterraTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Searchpage;

public class searchSteps extends TesterraTest implements PageFactoryProvider {



    @Given("^I am on the website duck-duck-go$")
    public void launchSite() {
        //Searchpage searchPage = PAGE_FACTORY.createPage(Searchpage.class);
        //searchPage.goTo();
    }

    @And("^I enter the \"([^\"]*)\" to search$")
    public void enterKeyword(String keyword) {
        Searchpage searchPage = PAGE_FACTORY.createPage(Searchpage.class);
        searchPage.doSearch(keyword);
    }

    @And("^I navigate to videos search$")
    public void navigateTovideos()  {
        Searchpage searchPage = PAGE_FACTORY.createPage(Searchpage.class);
        searchPage.goToVideos();
    }

    @Then("^I should get minimum (\\d+) search results$")
    public void verifySearchResults(int min) {
        Searchpage searchPage = PAGE_FACTORY.createPage(Searchpage.class);
        int size = searchPage.getResult();
        Assert.assertTrue(size > min);
    }


}
