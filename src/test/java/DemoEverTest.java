import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

public class DemoEverTest {


    ChromeOptions cd;
    WebDriver wd;


    @BeforeMethod
    public void beforeMethodForDemoEver() throws MalformedURLException {

        cd = new ChromeOptions();
        wd = new RemoteWebDriver(new URL("http://192.168.1.6:4444"),cd);

    }

    @Test
    public void addToCartTest() throws InterruptedException {
        LoginPageModel lom = new LoginPageModel(wd);
        HomePageModel hom = new HomePageModel(wd);
        ItemPageModel iom = new ItemPageModel(wd);
        lom.openingLoginPage()
                .fillCredentials("akhiljda@gmail.com", "Password")
                .clickOnSubmit();
        hom.clickItem("Nike react infinity run flyknit");
        Assert.assertEquals(iom.getItemName(),"Nike React Infinity Run Flyknit");

        WebDriverWait wait = new WebDriverWait(wd,Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable();
        iom.selectSize("M");

                iom.selectColour("Black");

                iom.fillQuantity("5");
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                iom.clickOnAddToCart();
    }

}

