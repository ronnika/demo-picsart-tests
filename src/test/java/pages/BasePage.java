package pages;

import components.Menu;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

public class BasePage {

    Menu menu = new Menu("Main menu", $(".navigation nav"));
    public String getLink() {
        return url();
    }
}
