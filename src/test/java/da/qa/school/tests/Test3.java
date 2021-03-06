package da.qa.school.tests;

import static com.codeborne.selenide.Selenide.open;
import da.qa.school.tests.config.BaseTest;
import da.qa.shool.pages.SearchPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;

@Features({"Feature 3"})
public class Test3 extends BaseTest {

    private SearchPage searchPage;

    @Test
    public void button_search_should_be_displayed() {
        searchPage = open("https://google.com.ua", SearchPage.class);
        assertTrue(searchPage.isBtnSearchDisplayed());
    }
}
