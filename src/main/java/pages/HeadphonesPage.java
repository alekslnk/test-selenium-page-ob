package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeadphonesPage extends BasePage{

    private static final String ADD_CART_BUTTON_LIST = "//a[@class='prod-cart__buy']";
    private static final String ADD_TO_CART_POPUP = "//div[@id='js_cart']";
    private static final String CLOSE_POPUP_BUTTON = "//button[@title='Close' and @type='button']";

    public HeadphonesPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton () {
        driver.findElements(By.xpath(ADD_CART_BUTTON_LIST)).get(0).click();
    }

    public By getAddToCartPopup() {
        return By.xpath(ADD_TO_CART_POPUP);
    }

    public void clickClosePopupButton() {
        driver.findElement(By.xpath(CLOSE_POPUP_BUTTON)).click();
    }
}
