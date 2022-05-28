package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    WebDriver driver;

    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.name("login-button");


    public loginPage(WebDriver driver) {

        this.driver = driver;

    }

    public void loginToswagla(String userid, String pass) {
        driver.findElement(username).sendKeys(userid);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();

    }

    public void typeUserName() {

        driver.findElement(username).sendKeys("standard_user");
//             driver.findElement(username).sendKeys("locked_out_user");
//             driver.findElement(username).sendKeys("problem_user");
//             driver.findElement(username).sendKeys("performance_glitch_user");
    }

    public void typePassword() {

        driver.findElement(password).sendKeys("secret_sauce");
    }

    public void typeWrongPassword() {

        driver.findElement(password).sendKeys("secret_sauce1");
    }


    public void clickOnLoginButton() {
        driver.findElement(loginButton).click();

    }


}
