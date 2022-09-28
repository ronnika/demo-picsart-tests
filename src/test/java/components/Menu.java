package components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;

public class Menu {
    String name;
    SelenideElement selector;

    public Menu(String name, SelenideElement selector) {
        this.name = name;
        this.selector = selector;
    }

    public void click(String notation) {
        selector.$(byText(notation)).click();
    }
}
