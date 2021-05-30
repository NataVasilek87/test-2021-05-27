package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.searchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleTests {

    private static WebDriver driver;
    private static pages.searchPage searchPage;

    @BeforeAll
    public static void init (){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new searchPage(driver);
    }

    @Test
    public void test1() {
        driver.get("http://google.com");
        searchPage.search ("Калькулятор");
        searchPage.Calculyator;
        assertEquals("(1+2)*3-40/5=", driver.findElement(By.cssSelector ("#search .VkJw6")));
        assertEquals("1", driver.findElement(By.cssSelector ("#search span[class*='vUGUtc']")));
    }

    @AfterAll
    public static void teardown (){
        driver.quit();
    }
}
