package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By productTitle = By.xpath("//span[@class='title']");

    By productClick = By.xpath("//div[text()='Sauce Labs Backpack']");

    By addToCartClick= By.xpath("//button[text()='Add to cart']");

    By cartClick= By.xpath("//a[@class='shopping_cart_link'] ");




    public boolean isProductPageVisible(){
        try {
            return driver.findElement(productTitle).isDisplayed();
        }catch (NoSuchElementException e){
            return false;
        }
    }


    public ProductPage clickOnProductItem(){

        driver.findElement(productClick).click();
        return this;
    }

    public boolean isProductItemDisplayed(){

        return driver.findElement(productClick).isDisplayed();
    }

    public ProductPage clickOnAddToCart(){
         driver.findElement(addToCartClick).click();
         return this;
    }

    public ProductPage clickOnCart(){
        driver.findElement(cartClick).click();
        return this;
    }

    public boolean isItemDisplayedOnCart(){
        return driver.findElement(productClick).isDisplayed();
    }




}
