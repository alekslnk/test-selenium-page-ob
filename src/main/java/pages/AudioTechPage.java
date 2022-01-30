package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AudioTechPage extends BasePage {

    private static final String HEADPHONES_BUTTON = "//div[contains(@class,'title')]/a[contains(@href,'naushniki')]";

    public AudioTechPage(WebDriver driver) {
        super(driver);
    }

    public void clickHeadphonesButton() {
        driver.findElement(By.xpath(HEADPHONES_BUTTON)).click();
    }
}
