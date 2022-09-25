package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Picsart Gold tests")
public class Tests extends BaseTest {

    @Test
    @DisplayName("Check if button \"Compare plans\" exists on the Main page and leads to /gold")
    public void testComparePlansButton_existsAndCorrectLink() {
        var mainPage = new MainPage();
        mainPage.openPage();
        var goldPage = mainPage.clickOnComparePlansButton();
        assertTrue(goldPage.getLink().endsWith("/gold"));
    }
}
