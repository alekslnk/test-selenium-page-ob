package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private static final String SEARCH_INPUT = "//input[@id='input_search']" ;
    private static final String SEARCH_BUTTON = "//button[@class='button-reset search-btn']" ;
    private static final String PRODUCT_CATALOG_BUTTON = "//div[@class='sidebar-title js_open-cat']";
    private static final String AUDIO_TECH_BUTTON = "//li[contains(@class, 'sidebar-item')]/a[contains(@href, 'audio-texnika')]";
    private static final String AMOUNT_OF_ELEMENTS_IN_CURT = "//div[contains(@class,'active-cart')]/div[contains(@class,'cart_count')]";


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(keyword);
        driver.findElement(By.xpath(SEARCH_BUTTON)).click();
    }

    public void clickProductCatalogButton() {
        driver.findElement(By.xpath(PRODUCT_CATALOG_BUTTON)).click();
    }

    public void clickAudioTechButton() {
        driver.findElement(By.xpath(AUDIO_TECH_BUTTON)).click();
    }

    public String getTextOfAmountOfElementsInCart() {
        return driver.findElement(By.xpath(AMOUNT_OF_ELEMENTS_IN_CURT)).getText();
    }
}
