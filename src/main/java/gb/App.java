package gb;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://ok.ru/");

        driver.manage().window().setSize(new Dimension(1920, 1080));

        login(driver);
        createNote(driver);
        findUser(driver);
        playVideoMusic(driver);

        Thread.sleep(5000);
        driver.quit();
    }

    public static void login (WebDriver driver) {
        driver.findElement(By.name("st.email")).sendKeys("mbtest162");
        driver.findElement(By.name("st.password")).sendKeys("trolo9kot");
        driver.findElement(By.className("__wide")).click();
    }

    public static void createNote (WebDriver driver) {
        driver.findElement(By.className("pf-head_itx")).click();
        driver.findElement(By.className("posting_itx")).sendKeys("MyTestText");
        driver.findElement(By.className("posting_submit")).click();
    }

    public static void findUser (WebDriver driver) {
        driver.findElement(By.name("st.query")).sendKeys("Филипп Хазов\n");
    }

    public static void playVideoMusic (WebDriver driver) {
        driver.findElement(By.id("music_toolbar_button")).click();
        driver.findElement(By.className("cover")).click();
    }
}
