import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class auctionSearch {
    public static void main(String[] args){
    }
    public void page(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe"); // путь к драйверу
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait()
    }
}
