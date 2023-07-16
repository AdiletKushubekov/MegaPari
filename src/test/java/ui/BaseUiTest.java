package ui;

import com.codeborne.selenide.Configuration;
import org.example.ui.element_helper.WebElementActions;
import org.example.ui.pages.HomePage;
import org.example.ui.pages.PaymentMethodsPage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

/**
 * @author Adilet Kushubekov
 */
public abstract class BaseUiTest {
    public WebElementActions elementActions = new WebElementActions();
    public HomePage homePage = new HomePage();
    public PaymentMethodsPage paymentMethodsPage = new PaymentMethodsPage();
    @BeforeClass
    public void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions);
        Configuration.browserCapabilities = desiredCapabilities;
        open("https://megapari.com/ru");

    }
}
