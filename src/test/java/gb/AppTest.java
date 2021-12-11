package gb;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AppTest 
{
    @Test
    public void login () {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.get("https://ok.ru/");

        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.findElement(By.name("st.email")).sendKeys("mbtest162");
        driver.findElement(By.name("st.password")).sendKeys("trolo9kot");
        driver.findElement(By.className("__wide")).click();
        assertTrue( true );
    }
    @Test
    public void createNote () {

        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.get("https://ok.ru/");

        driver.findElement(By.className("pf-head_itx")).click();
        driver.findElement(By.className("posting_itx")).sendKeys("MyTestText");
        driver.findElement(By.className("posting_submit")).click();
        assertTrue( true );
    }
    @Test
    public void findUser () {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.get("https://ok.ru/");

        driver.findElement(By.name("st.query")).sendKeys("Филипп Хазов\n");
        assertTrue( true );
    }
    @Test
    public void playVideoMusic () {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.get("https://ok.ru/");

        driver.findElement(By.id("music_toolbar_button")).click();
        driver.findElement(By.className("cover")).click();
        assertTrue( true );
    }
}
