package pages;

import eu.tsystems.mms.tic.testframework.pageobjects.Page;
import eu.tsystems.mms.tic.testframework.pageobjects.UiElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searchpage extends Page {

    //private final WebDriver driver = WebDriverManager.getWebDriver();;
    private WebDriverWait wait;

    //private final GuiElement searchTxt = new GuiElement(this.getWebDriver(), By.name("q"));

    //private final GuiElement searchBtn = new GuiElement(this.getWebDriver(), By.id("search_button_homepage"));

    //private final GuiElement videosLink = new GuiElement(this.getWebDriver(), By.linkText("Videos"));

    //private final GuiElement videos = new GuiElement(this.getWebDriver(), By.className("tile--vid"));

    private UiElement searchTxt = find(By.name("q"));

    private UiElement searchBtn = find(By.id("search_button_homepage"));

    private UiElement videosLink = find(By.linkText("Videos"));

    private UiElement allVideos = find(By.className("tile--vid"));


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
        //List<UiElement> allVideos = videos.getList();
        System.out.println("Search Result : " + this.allVideos.list().size());
        return allVideos.list().size();
    }
}
