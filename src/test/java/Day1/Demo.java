package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;

public class Demo {
    public static void main(String[] args) {


        System.setProperty("webdriver.opera.driver","D://Downloads//operadriver_win64//operadriver_win64");
        WebDriver driver= new OperaDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");






    }


}
