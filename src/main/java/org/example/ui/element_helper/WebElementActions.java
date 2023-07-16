package org.example.ui.element_helper;

import com.codeborne.selenide.SelenideElement;

/**
 * @author Adilet Kushubekov
 */
public class WebElementActions {

    public WebElementActions input(SelenideElement element, String txt){
        element.clear();
        element.setValue(txt);
        return this;
    }

    public WebElementActions press(SelenideElement element){
        element.click();
        return this;
    }
}
