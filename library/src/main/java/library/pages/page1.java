package library.pages;

import library.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public interface page1 {

  WebElement userNameInputBox = Driver.getDriver().findElement(By.name("USER_LOGIN"));

}
