package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ElementCalc {

    @FindBy (css="#search div[aria-label*='открывающая скобка'].XRsWPe.MEdqYd")
    public WebElement OpenSkobka;

    @FindBy (css="#search div[aria-label*='закрывающая скобка'].XRsWPe.MEdqYd")
    public WebElement ExitSkobka;

    @FindBy (css="#search div 1.XRsWPe.AOvabd")
    public WebElement Button1;

    @FindBy (css="#search div 2.XRsWPe.AOvabd")
    public WebElement Button2;

    @FindBy (css="#search div 3.XRsWPe.AOvabd")
    public WebElement Button3;

    @FindBy (css="#search div 4.XRsWPe.AOvabd")
    public WebElement Button4;

    @FindBy (css="#search div 5.XRsWPe.AOvabd")
    public WebElement Button5;

    @FindBy (css="#search div 6.XRsWPe.AOvabd")
    public WebElement Button6;

    @FindBy (css="#search div 0.XRsWPe.AOvabd")
    public WebElement Button0;

    @FindBy (css="#search div[aria-label*='сложение'].XRsWPe.MEdqYd")
    public WebElement Plus;

    @FindBy (css="#search div[aria-label*='вычитание'].XRsWPe.MEdqYd")
    public WebElement Minus;

    @FindBy (css="#search div[aria-label*='умножение'].XRsWPe.MEdqYd")
    public WebElement Umnogenie;

    @FindBy (css="#search div[aria-label*='деление'].XRsWPe.MEdqYd")
    public WebElement Delenie;

    @FindBy (css="#search div[aria-label*='синус'].XRsWPe.MEdqYd.Krlpq")
    public WebElement Sinus;

    @FindBy (css="#search div[aria-label*='равно'].XRsWPe.UUhRt")
    public WebElement Ravno;

    public ElementCalc (WebDriver driver) {
        initElements(driver, this);
    }

}
