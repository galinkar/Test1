import org.openqa.selenium.By;

/**
 * Created by galina on 27.04.15.
 */
public class Button extends Element {
    protected By by;

    public Button(By by) {
    this.by = by;

}
    public void click() {
        element().click();
    }
    }