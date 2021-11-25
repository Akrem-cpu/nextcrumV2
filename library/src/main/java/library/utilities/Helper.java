package library.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Helper {
    public static void highlightElement( WebElement element)  {
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();

        js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');" , element);

        BrowserUtils.sleep(2);

        js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');" , element);



    }
}
