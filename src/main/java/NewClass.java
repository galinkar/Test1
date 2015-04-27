import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class NewClass extends ConfigurationManager {


       @Test
        public void testUntitled1() throws Exception {
           //preparation
           Data data = new Data();
           LoginPage loginpage = new LoginPage();
           //test
           loginpage.fillinLoginField(data.getLogin());
           loginpage.fillinPasswordField(data.getPassword());
           loginpage.clickAuth();
           asserEquals(loginpage.getPageTitle(), data.getTitle);

           /*
            driver.findElement(Locators.LOGIN).clear();
            driver.findElement(Locators.LOGIN).sendKeys("fjdlskfs;l");
            driver.findElement(Locators.PASSWORD).clear();
            driver.findElement(Locators.PASSWORD).sendKeys("fsdfdf");
            driver.findElement(Locators.AUTH_BUTTON).click();

*/
 /*  @Test
    public void testUntitled2() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(Locators.LOGIN).clear();
        driver.findElement(Locators.LOGIN).sendKeys("asdfhfh");
        driver.findElement(Locators.PASSWORD).clear();
        driver.findElement(Locators.PASSWORD).sendKeys("asdfhfh");
        driver.findElement(Locators.AUTH_BUTTON).click();
        assertEquals(driver.getTitle(), "asd");
    }

        @Test
        public void testUntitled()throws Exception {
        driver.get(baseUrl + "/messages/inbox/?back=1");
        driver.findElement(Locators.LOGOUT).click();
        driver.findElement(Locators.MBPASSWORD).clear();
        driver.findElement(Locators.MBPASSWORD).sendKeys("2205856928Fybrfyjd");
        driver.findElement(Locators.AUTH_BUTTON).click();
        driver.findElement(Locators.LOGOUTLINK).click();
        */
    }




}
