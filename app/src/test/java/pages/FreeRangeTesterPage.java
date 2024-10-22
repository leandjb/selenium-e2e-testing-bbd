package pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeRangeTester {
 
    private WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void navigateToHomePage(){
        driver.get("https://www.google.com");
    }

    @After
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
 
}