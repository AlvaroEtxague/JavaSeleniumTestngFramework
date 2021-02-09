package pages;

import org.openqa.selenium.WebElement;

public interface GoogleHomeModel {
    String getBaseURL();
    WebElement getSearchBar();
    WebElement getSearchBtn();
    WebElement getIframe();
    WebElement getIAgreeBtn();

}
