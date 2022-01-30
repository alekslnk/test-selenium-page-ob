package smoketest;

import org.testng.annotations.Test;
import pages.BasePage;

import static org.testng.AssertJUnit.assertEquals;

public class AddToCartTests extends BaseTest {

    private static final String EXPECTED_AMOUNT_OF_PRODUCTS = "1";
    @Test
    public void checkAddToCart() {
        getHomePage().clickProductCatalogButton();
        getHomePage().clickAudioTechButton();
        getAudioTechPage().clickHeadphonesButton();
        getHeadphonesPage().waitForPageLoadComplete(30);
        getHeadphonesPage().clickAddToCartButton();
        getHeadphonesPage().waitVisibilityOfElement(30,getHeadphonesPage().getAddToCartPopup());
        getHeadphonesPage().clickClosePopupButton();
        assertEquals(getHomePage().getTextOfAmountOfElementsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS);
    }
}
