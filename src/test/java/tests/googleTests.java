package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.ElementCalc;
import pages.searchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleTests {

    private static WebDriver driver;
    private static pages.searchPage searchPage;
    private static pages.ElementCalc elementCalc;

    @BeforeAll
    public static void init (){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new searchPage(driver);
        elementCalc = new ElementCalc(driver);
    }

    public static ElementCalc getElementCalc() {
        return elementCalc;
    }

    public static void setElementCalc(ElementCalc elementCalc) {
        googleTests.elementCalc = elementCalc;
    }

    @BeforeEach
    public void setup () {
        driver.get("http://google.com");
    }

    @Test
    public void test1() {
        searchPage.search ("Калькулятор");
        WebElement element1 = elementCalc.OpenSkobka;
        element1.click();
        WebElement element2 = elementCalc.Button1;
        element2.click();
        WebElement element3 = elementCalc.Plus;
        element3.click();
        WebElement element4 = elementCalc.Button2;
        element4.click();
        WebElement element5 = elementCalc.ExitSkobka;
        element5.click();
        WebElement element6 = elementCalc.Umnogenie;
        element6.click();
        WebElement element7 = elementCalc.Button3;
        element7.click();
        WebElement element8 = elementCalc.Minus;
        element8.click();
        WebElement element9 = elementCalc.Button4;
        element9.click();
        WebElement element10 = elementCalc.Button0;
        element10.click();
        WebElement element11 = elementCalc.Delenie;
        element11.click();
        WebElement element12 = elementCalc.Button5;
        element12.click();
        assertEquals("(1+2)*3-40/5=", driver.findElement(By.cssSelector ("#search .VkJw6")));
        assertEquals("1", driver.findElement(By.cssSelector ("#search span[class*='vUGUtc']")));
    }

    @AfterAll
    public static void teardown (){
        driver.quit();
    }
}
