import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {
    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidhya.durai\\IdeaProjects\\PSHotel\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:/Users/vidhya.durai/Downloads/PSRestuarant1649135588818/PSRestuarant/index.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)", "");
        return driver;
    }
}
