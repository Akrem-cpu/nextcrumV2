package library.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Driver {
    static Logger logger = LoggerFactory.getLogger(Driver.class);
    public Driver(){}



    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();


    public static WebDriver getDriver() {

        if (driverPool.get() == null){
            synchronized (Driver.class) {

                String browserType = ConfiReader.getProperty("browser");

                switch (browserType) {
                    case "chrome":
                        ChromeOptions options = new ChromeOptions();
                        options.setHeadless(false);
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver(options));
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;

                }
            }
        }


        return  driverPool.get();


    }


    public static void closeDriver(){
        if( driverPool.get()!=null){
            driverPool.get().quit();
            driverPool.remove();

        }
    }
}
