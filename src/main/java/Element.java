import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by galina on 27.04.15.
 */
public abstract class Element {

    protected By by;

    public WebElement element(){
        return ConfigurationManager.getDriver().findElement(by);
    }
}
