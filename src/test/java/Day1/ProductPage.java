package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By productTitle = By.xpath("//span[@class='title']");

    By productClick = By.xpath("//div[text()='Sauce Labs Backpack']");

    By addToCartClick= By.xpath("//button[text()='Add to cart']");




    public boolean isProductPageVisible(){

        return driver.findElement(productTitle).isDisplayed();

    }

    public boolean isProductIteamLoaded(){

       return driver.findElement(productClick).isDisplayed();
    }

    public boolean isProductClickWork(){
        return driver.findElement(addToCartClick).isDisplayed();
    }


}
