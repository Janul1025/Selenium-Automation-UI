package swaglabs.TestCase;

import Day1.LoginPage;
import Day1.ProductPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class VerifyswaglabLogin {

    @Test
    public void VerifyswaglabLogin(){

        System.setProperty("webdriver.chrome.driver","D://Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        LoginPage login = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);

        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();

        boolean isProductPageVisible = productPage.isProductPageVisible();

        Assert.assertTrue(isProductPageVisible);

        Assert.assertEquals(productPage.isProductPageVisible(),true);
        driver.quit();

    }


    @Test
    public void VerifyswaglabProductClick(){

        System.setProperty("webdriver.chrome.driver","D://Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/inventory.html/");

        LoginPage login = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        ProductPage productClick= new ProductPage(driver);

        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();

        boolean isProductIteamLoaded= productPage.isProductIteamLoaded();

        Assert.assertTrue(isProductIteamLoaded);

        Assert.assertEquals(productClick.isProductIteamLoaded(),true);
        driver.quit();

    }


    @Test
    public void VerifyswaglabAddToCartClick(){

        System.setProperty("webdriver.chrome.driver","D://Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/cart.html/");

        LoginPage login = new LoginPage(driver);
//        ProductPage productPage = new ProductPage(driver);
//        ProductPage productClick= new ProductPage(driver);
        ProductPage productAddToCart= new ProductPage(driver);

        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();

        boolean isProductClickWork= productAddToCart.isProductClickWork();

        Assert.assertTrue(isProductClickWork);

        Assert.assertEquals(productAddToCart.isProductClickWork(),true);
        driver.quit();

    }

}
