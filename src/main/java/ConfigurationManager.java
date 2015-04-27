import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

import org.openqa.selenium.support.ui.Select;



public class ConfigurationManager {

    protected static WebDriver driver = null;
    protected String baseUrl = "https://mail.ru/";
    private StringBuffer verificationErrors = new StringBuffer();

    public static WebDriver getDriver() {
        return driver;
    }
    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://e.mail.ru/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);

        }
    }

}
