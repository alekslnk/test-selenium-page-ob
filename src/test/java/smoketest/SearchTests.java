package smoketest;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SearchTests extends BaseTest{

    private static final String SEARCH_KEYWORD = "JBL live";
    private static final String SEARCH_QUERY = "query=JBL+live";

    @Test(priority = 1)
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        assertTrue(getDriver().getCurrentUrl().contains(SEARCH_QUERY));
    }
}
