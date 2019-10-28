import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class auctionSearch {
    public static void main(String[] args){
    }
    @Test
    public void page(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe"); // путь к драйверу
        WebDriver driver = new ChromeDriver();// инициализация вебдрайвера
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// ожидание исполнения скрипта 10 сек
        driver.manage().window().maximize();//раскрытие окно на весь экран

        driver.get("https://www.rts-tender.ru/auctionsearch"); // открываем страницу поиска закупок

        WebElement radioButtonZMO = driver.findElement(By.id("dnn_ctr691_View_RadioButton3")); //находим радиобатон 44
        radioButtonZMO.click(); //выбираем 44

        WebElement inputNumber = driver.findElement(By.id("dnn_ctr691_View_aSNumber")); // находим поле ввода номера закупки
        inputNumber.sendKeys("0387200015618900014");//вводим номер закупки

        WebElement inputInn = driver.findElement(By.id("dnn_ctr691_View_aASCompanyInn")); //находим поле ввода ИНН
        inputInn.sendKeys("8602002480");// указываем ИНН

        WebElement chooseRegion = driver.findElement(By.id("dnn_ctr691_View_aSclassRegionsSelect")); //находим кнопку выбора региона
        chooseRegion.click();// нажимаем кнопку выбора региона

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("iPopUp")));

        driver.switchTo().frame("РТС-тендер > Поиск > Регион закупки");

        WebElement selectRegion = driver.findElement(By.linkText("Волгоградская область"));
        selectRegion.click();

    }
}
