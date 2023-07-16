package org.example.ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * @author Adilet Kushubekov
 */
public class HomePage extends BasePage{
    public SelenideElement linkToHomePage = $x("//a[@class='header-logo__link header-logo__link--has-country']");
    public SelenideElement linkToPaymentMethods = $x("//a[@title='Способы оплаты']");

}
