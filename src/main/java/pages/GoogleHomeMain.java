package pages;

import base.PageObjectManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomeMain extends PageObjectManager<GoogleHomeMain> implements GoogleHomeModel{
    //WEBELEMENTS
    private String baseURL = "https://www.google.com/";

    @FindBy(css = ".gLFyf.gsfi")
    private WebElement searchBar;

    @FindBy(css = ".UUbT9 input[name='btnK']")
    private WebElement searchBtn;

    @FindBy(css = "iframe")
    private WebElement googleIframe;

    @FindBy(css = "#introAgreeButton")
    private WebElement iAgreeBtn;

    //GETTERS
    @Override
    public String getBaseURL() {
        return baseURL;
    }

    @Override
    public WebElement getSearchBar() {
        return searchBar;
    }

    @Override
    public WebElement getSearchBtn() {
        return searchBtn;
    }

    @Override
    public WebElement getIframe() {
        return googleIframe;
    }

    @Override
    public WebElement getIAgreeBtn() {
        return iAgreeBtn;
    }

    //PAGE INTERACTIONS
    public void goToGoogle() {
        gens.getURL(getBaseURL());
        acceptGoogleCookies();
    }

    public void searchForKeyword(String keyword) {
        gens.waitForElement(getSearchBar(), 5);
        gens.type(keyword, getSearchBar());
        System.out.println("Searching for " + keyword);
    }

    public void clickSearchBtn() {
        gens.waitForElement(getSearchBtn(), 5);
        gens.click(getSearchBtn());
        System.out.println("Clicking the search button");
    }

    public void acceptGoogleCookies() {
        gens.switchToFrame(getIframe());
        gens.click(getIAgreeBtn());
    }
}
