package pages;

import eu.tsystems.mms.tic.testframework.pageobjects.Page;
import eu.tsystems.mms.tic.testframework.pageobjects.UiElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchpage extends Page {


    private final UiElement searchTxt = find(By.name("q"));

    private final UiElement searchBtn = find(By.id("search_button_homepage"));

    private final UiElement videosLink = find(By.linkText("Videos"));

    private final UiElement allVideos = find(By.className("tile--vid"));


    public Searchpage(WebDriver driver) {
        super(driver);
    }

    /**
     * No need to give the url here.
     * it is already set in the test.porperties
     */
    public void goTo(){
        //this.driver.get("https://duckduckgo.com/");
    }

    /**
     * This function enters the keyword to be searched and submit the search
     * @param keyword to be searched
     */
    public void doSearch(String keyword){
        searchTxt.type(keyword);
        searchBtn.click();
    }

    /**
     * This function goes to the video section of the website
     */
    public void goToVideos(){
        this.videosLink.click();
    }

    /**
     * This function prints and returns the number of videos found on the result page
     * @return: the numbers of videos on the page
     */
    public int getResult(){
        //List<GuiElement> allVideos = videos.getList();
        System.out.println("Search Result : " + this.allVideos.list().size());
        return allVideos.list().size();
    }
}
