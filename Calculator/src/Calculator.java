import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Calculator {
    public static void main(String args[]) {
        String sep = File.separator;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Luiz_Carvalho1\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }
}
