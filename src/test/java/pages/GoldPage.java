package pages;

import elements.Button;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoldPage extends BasePage {

    private Button getStartedButton = new Button(
            "Get started",
            $("[data-test=subscription-banner-button]"));

    public GoldPage clickGetStartedButton() {
        getStartedButton.click();
        return new GoldPage();
    }

    public void openPage() {
        open("/gold");
    }
}
