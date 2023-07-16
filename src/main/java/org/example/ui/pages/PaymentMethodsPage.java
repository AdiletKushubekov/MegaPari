package org.example.ui.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

/**
 * @author Adilet Kushubekov
 */
public class PaymentMethodsPage extends BasePage{
    public SelenideElement dropDownCountry = $x("(//span[@dir='ltr'])[1]");
    public SelenideElement selectDropdownMenu = $x("//select[@id='countries']");
    public SelenideElement btnBlockAlert = $x("//a[@href='#deny']");
    public SelenideElement btnBankCards = $x("//div[@data-type='bank_card']");
    public SelenideElement countBankCards = $x("//div[@data-type='bank_card']//div[@class='number_payment_system']");
    public SelenideElement btnEWallets = $x("//div[@data-type='e_wallet']");
    public SelenideElement countEWallets = $x("//div[@data-type='e_wallet']//div[@class='number_payment_system']");
    public SelenideElement btnPaySystems = $x("//div[@data-type='pay_system']");
    public SelenideElement countPaySystems = $x("//div[@data-type='pay_system']//div[@class='number_payment_system']");
    public SelenideElement btnVouchers = $x("//div[@data-type='vouchers']");
    public SelenideElement countVouchers = $x("//div[@data-type='vouchers']//div[@class='number_payment_system']");
    public SelenideElement btnCryptoCurrency = $x("//div[@data-type='crypto_currency']");
    public SelenideElement countCryptoCurrency = $x("//div[@data-type='crypto_currency']//div[@class='number_payment_system']");
    public ElementsCollection listOfCountries = $$x("//div[@class='select_countries_dropdown']//li");
    public ElementsCollection listOfBankCards = $$x("//section[@id='group_bank_card']//div[@class='payment_info_item__name']");
    public ElementsCollection listOfEWallets = $$x("//section[@id='group_e_wallet']//div[@class='payment_info_item__name']");
    public ElementsCollection listOfPaySystems = $$x("//section[@id='group_pay_system']//div[@class='payment_info_item__name']");
    public ElementsCollection listOfVouchers = $$x("//section[@id='group_vouchers']//div[@class='payment_info_item__name']");
    public ElementsCollection listOfCryptoCurrency = $$x("//section[@id='group_crypto_currency']//div[@class='payment_info_item__name']");

    public PaymentMethodsPage selectCountry(String countryName){
        Select select = new Select(selectDropdownMenu);
        select.selectByValue(countryName);
        return this;
    }
    public PaymentMethodsPage alertClickBlock(){
        elementActions.press(btnBlockAlert);
        return this;
    }
}
