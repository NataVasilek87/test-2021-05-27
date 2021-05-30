package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

    public class searchPage {

    @FindBy (xpath="//input[@ id='input']")
    private WebElement searchInput;

    @FindBy (css="#search .VkJw6")
    public WebElement resultsFormula;

    @FindBy (css="#search span[class*='vUGUtc']")
    public WebElement resultsNumber;


    public searchPage (WebDriver driver) {
        initElements(driver, this);
    }

    public void search (String text){
        searchInput.sendKeys(text, Keys.ENTER);
    }
}

