package pages;

import elements.Button;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage extends BasePage {

    Button comparePlansButton = new Button(
            "Compare Plans",
            $("[data-testid=button-cta]", 2));

    public void openPage() {
        open("/");
    }

    public GoldPage clickOnComparePlansButton() {
       comparePlansButton.click();
        return new GoldPage();
    }
}
