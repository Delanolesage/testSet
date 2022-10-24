package stepdefs;

import eu.tsystems.mms.tic.testframework.pageobjects.factory.PageFactory;
import eu.tsystems.mms.tic.testframework.webdrivermanager.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Searchpage;

public class searchSteps {

    private final WebDriver driver = WebDriverManager.getWebDriver();
    private Searchpage searchPage = PageFactory.create(Searchpage.class, driver);

    @Given("^I am on the website duck-duck-go$")
    public void launchSite() {
        //searchPage.goTo();
        //System.out.println(this.driver.getCurrentUrl());
    }

    @And("^I enter the \"([^\"]*)\" to search$")
    public void enterKeyword(String keyword) {
        searchPage.doSearch(keyword);
    }

    @And("^I navigate to videos search$")
    public void navigateTovideos()  {
        searchPage.goToVideos();
    }

    @Then("^I should get minimum (\\d+) search results$")
    public void verifySearchResults(int min) {
        int size = searchPage.getResult();
        Assert.assertTrue(size > min);
    }


}
