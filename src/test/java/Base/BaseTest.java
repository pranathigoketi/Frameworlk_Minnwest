package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {
    //public static void main(String args[]){
       public  WebDriver driver;

        @BeforeTest

        public void beforetest() {
            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();

            driver.get("https://e2.minnwestbank.com/apps/onlinebanking/#_frmLogin");

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        }

    @AfterTest
    public void aftertest() {
        driver.quit();
    }
}




