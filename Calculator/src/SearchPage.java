import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    private  WebDriver driver;
    private SearchPageMap map;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.map = new SearchPageMap();
    }

    public void accessCalculator() {
        driver.findElement(this.map.searchInput()).sendKeys("Calculator");
        driver.findElement(this.map.searchButton()).click();
    }

    public void typeNumbers(int num) {
        driver.findElement(this.map.typeNumber(num)).click();
    }

    public void typeOperation(String operation) {
        driver.findElement(this.map.typeOperation(operation)).click();
    }

    public void getResult() {
        driver.findElement(this.map.typeResult()).click();
    }
}
