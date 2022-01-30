package smoketest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;
    private static final  String AVIC_URL = "https://avic.ua/";

    @BeforeTest
    public void profileSetup(){
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetup() {
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public AudioTechPage getAudioTechPage() {
        return new AudioTechPage(getDriver());
    }

    public HeadphonesPage getHeadphonesPage() {
        return new HeadphonesPage(getDriver());
    }
    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(getDriver());
    }
}
