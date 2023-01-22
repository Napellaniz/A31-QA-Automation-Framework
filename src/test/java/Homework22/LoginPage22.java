package Homework22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage22 extends BasePage22 {

    By submitButtonLocator = By.cssSelector("[type='submit']");
    By emailField= By.cssSelector("[type='email']");
    By passwordField = By.cssSelector("[type='password']");

    public LoginPage22 (WebDriver givenDriver) { super(givenDriver);}

    public void provideEmail(String email) {
        WebElement emailElement = driver.findElement(emailField);
        emailElement.click();
        emailElement.sendKeys(email);
    }


    public void providePassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.click();
        passwordElement.sendKeys(password);
    }

    public void clickSubmitBtn(){
        driver.findElement(submitButtonLocator).click();
    }


}