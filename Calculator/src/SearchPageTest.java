import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

class SearchPageTest {

    private ChromeDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Luiz_Carvalho1\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void accessCalculator() {
        SearchPage page = new SearchPage(driver);
        page.accessCalculator();
    }

    @Test
    public void makeOperation() {
        SearchPage page = new SearchPage(driver);
        page.accessCalculator();
        page.typeNumbers(1);
        page.typeNumbers(4);
        page.typeOperation("×");
        page.typeNumbers(4);
        page.typeNumbers(7);
        page.getResult();
    }
}