package Testscenarios;

import Pageobjects.Messages;
import Pageobjects.Spotlightpage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testmethods_spotlightOLB  {

    WebDriver driver;
    //Messages pages =new Messages(driver);

    @BeforeTest

    public void beforetest() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://e2.minnwestbank.com/apps/Spotlight/#_frmLogin");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }



    @Test(priority = 1)
    public void setuser() throws InterruptedException {
        Spotlightpage page = new Spotlightpage(driver);
        page.setUsername("SuperadminUser");
        Thread.sleep(2000);

    }

    @Test(priority = 2)
    public void setpass() throws InterruptedException {
        Spotlightpage page = new Spotlightpage(driver);
        page.setPassword("Password@1234");
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void seteye() throws InterruptedException {
        Spotlightpage page = new Spotlightpage(driver);
        page.clickicon();
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void setbox() throws InterruptedException {
        Spotlightpage page = new Spotlightpage(driver);
        page.clickbox();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void setsignin() throws InterruptedException {
        Spotlightpage page = new Spotlightpage(driver);
        page.clicksignin();
        Thread.sleep(5000);
    }

    @Test(priority = 6)
    public void setnavigate1() throws InterruptedException {
        Messages page = new Messages(driver);
        page.setNavigate();
        Thread.sleep(5000);
    }

    @Test(priority = 7)
    public void setnewmessage() throws InterruptedException {
        Messages page = new Messages(driver);
        page.setnew();
        Thread.sleep(6000);
    }

    @Test(priority = 8)
    public void setcompose() throws InterruptedException {
        Messages page = new Messages(driver);
        page.setCompose2("Aswiniroy@7");
        Thread.sleep(5000);
    }

    @Test(priority = 9)
    public void setuserId() throws InterruptedException {
        Messages page = new Messages(driver);
        page.setUserid();
        Thread.sleep(5000);
    }

    @Test(priority = 10)
    public void setSubjectField() throws InterruptedException {
        Messages page = new Messages(driver);
        page.setSubject("Credit Card Blockage");
        Thread.sleep(5000);
    }

    @Test(priority = 11)
    public void setCategory() throws InterruptedException {
        Messages page = new Messages(driver);
        page.setCat();
        Thread.sleep(5000);
    }

    @Test(priority = 12)
    public void setTemplate() throws InterruptedException {
        Messages page = new Messages(driver);
        page.settemp();
        Thread.sleep(5000);
    }

    @Test(priority = 13)
    public void setEditing() throws InterruptedException {
        Messages page = new Messages(driver);
        page.seteditor();
        Thread.sleep(5000);

    }

    @Test(priority = 14)
    public void setSend() throws InterruptedException {
        Messages page = new Messages(driver);
        page.setButton1();
        Thread.sleep(5000);
    }

    @AfterTest
    public void aftertest() {
        driver.quit();
    }

}