import org.openqa.selenium.By;

public class SearchPageMap {
    public By searchInput() {
        return By.xpath("//input[@name='q']");
    }

    public By searchButton() {
        return By.xpath("//div[@jsname='VlcLAe']//input[@name='btnK'][@class='gNO89b']");
    }

    public By typeNumber(int num) {
        return By.xpath("//div[@class='XRsWPe AOvabd' and text()='" + num + "']");
    }

    public By typeOperation(String str) {
        return By.xpath("//div[@class='XRsWPe MEdqYd' and text()='" + str + "']");
    }

    public By typeResult() {
        return By.xpath("//div[@class='XRsWPe UUhRt' and text()='=']");
    }
}
