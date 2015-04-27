import org.openqa.selenium.By;

/**
 * Created by galina on 27.04.15.
 */
public class TextInput extends Element {

    public TextInput(By by) {
        this.by = by;
    }
    public void sendKeys(String value);
    element().clear();
    element().sendKeys(value);
}

