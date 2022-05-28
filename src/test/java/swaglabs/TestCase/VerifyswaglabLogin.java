package swaglabs.TestCase;

import Day1.LoginPage;
import Day1.ProductPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyswaglabLogin {

    @Test
    public void verifySwagLabLogin(){

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

//        Assert.assertEquals(productPage.isProductPageVisible(),true);
        driver.quit();

    }


    @Test
    public void verifySwagLabProductClick(){

        System.setProperty("webdriver.chrome.driver","D://Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        LoginPage login = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        ProductPage productClick= new ProductPage(driver);

        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();

        productPage.clickOnProductItem();

        boolean isProductIteamLoaded = productPage.isProductItemDisplayed();


        Assert.assertTrue(isProductIteamLoaded);

        driver.quit();

    }


    @Test
    public void verifySwagLabAddToCartFunction(){

        System.setProperty("webdriver.chrome.driver","D://Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");


        LoginPage login = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);



        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();

         productPage.clickOnProductItem()
                .clickOnAddToCart()
                .clickOnCart();

        boolean isItemDisplayedOnCart =productPage.isItemDisplayedOnCart();


        Assert.assertEquals(isItemDisplayedOnCart,true);
        driver.quit();

    }

    @Test
    public void verifySwagLabFailedLogin(){

        System.setProperty("webdriver.chrome.driver","D://Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        LoginPage login = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);

        login.typeUserName();
        login.typeWrongPassword();
        login.clickOnLoginButton();

        boolean isProductPageVisible = productPage.isProductPageVisible();

        Assert.assertFalse(isProductPageVisible);


        driver.quit();

    }


}
