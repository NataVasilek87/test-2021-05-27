package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.ElementCalc;
import pages.searchPage;

import static org.junit.jupiter.api.Assertions.assertAll;
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
    @DisplayName("Проверка операций с целыми числами")
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
        WebElement element13 = elementCalc.Ravno;
        element13.click();
        assertAll(
                () ->   assertEquals("(1+2)*3-40/5=", searchPage.resultsFormula),
                () ->   assertEquals("1", searchPage.resultsNumber)
        );
    }


    @Test
    @DisplayName("Проверка деления на ноль")
    public void test2() {
        searchPage.search ("Калькулятор");
        WebElement element1 = elementCalc.Button6;
        element1.click();
        WebElement element2 = elementCalc.Delenie;
        element2.click();
        WebElement element3 = elementCalc.Button0;
        element3.click();
        WebElement element4 = elementCalc.Ravno;
        element4.click();
        assertAll(
                () ->   assertEquals("6/0=", searchPage.resultsFormula),
                () ->   assertEquals("Infinity", searchPage.resultsNumber)
        );
    }


    @Test
    @DisplayName("Проверка ошибки при отсутствии значения")
    public void test3() {
        searchPage.search ("Калькулятор");
        WebElement element1 = elementCalc.Sinus;
        element1.click();
        WebElement element2 = elementCalc.Ravno;
        element2.click();
        assertAll(
                () ->   assertEquals("sin()=", searchPage.resultsFormula),
                () ->   assertEquals("Error", searchPage.resultsNumber)
        );
    }

    @AfterAll
    public static void teardown (){
        driver.quit();
    }
}
