import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NewClass extends ConfigurationManager {


   /* @Test
    public void testUntitled() throws Exception {
        driver.findElement(Locators.LOGIN).clear();
        driver.findElement(Locators.LOGIN).sendKeys("fjdlskfs;l");
        driver.findElement(Locators.PASSWORD).clear();
        driver.findElement(Locators.PASSWORD).sendKeys("fsdfdf");
        driver.findElement(Locators.AUTH_BUTTON).click();
    }
*/
    @Test
    public void testUntitled2() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(Locators.LOGIN).clear();
        driver.findElement(Locators.LOGIN).sendKeys("asdfhfh");
        driver.findElement(Locators.PASSWORD).clear();
        driver.findElement(Locators.PASSWORD).sendKeys("asdfhfh");
        driver.findElement(Locators.AUTH_BUTTON).click();
        assertEquals(driver.getTitle(), "asd");
    }
}