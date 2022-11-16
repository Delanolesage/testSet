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

    public void goTo(){
        //this.driver.get("https://duckduckgo.com/");
    }

    public void doSearch(String keyword){
        searchTxt.type(keyword);
        searchBtn.click();
    }

    public void goToVideos(){
        this.videosLink.click();
    }

    public int getResult(){
        //List<GuiElement> allVideos = videos.getList();
        System.out.println("Search Result : " + this.allVideos.list().size());
        return allVideos.list().size();
    }
}
