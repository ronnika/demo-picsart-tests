package elements;

import com.codeborne.selenide.SelenideElement;

public class Button {

    String name;
    SelenideElement selector;

    public Button(String name, SelenideElement selector) {
        this.name = name;
        this.selector = selector;
    }

    public void click() {
        selector.click();
    }
}
