package tests;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pages.GoogleHomeMain;

public class GoogleTests extends BaseTest {

    protected GoogleHomeMain google;

    @Test
    public void searchForBlackCats() throws InterruptedException {
        google = new GoogleHomeMain();
        google.goToGoogle();
        google.searchForKeyword("Black Cats");
        google.clickSearchBtn();
    }

}
