package ui.regression;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ui.BaseUiTest;

/**
 * @author Adilet Kushubekov
 */
@Listeners({SoftAsserts.class, ScreenShooter.class})
public class PaymentMethodsTest extends BaseUiTest {
    @Test
    public void openPaymentMethodsPage(){
        elementActions.press(homePage.linkToPaymentMethods);
        paymentMethodsPage.alertClickBlock();
        paymentMethodsPage.dropDownCountry.click();
        paymentMethodsPage.selectCountry("RU");
    }

}
