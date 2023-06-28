package Testscenarios;

import Base.BaseTest;
import Base.BaseTest1;
import Pageobjects.OLB_page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Messages_OLB extends BaseTest {

   // WebDriver driver;

    @BeforeTest
    public void beforetest() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://e2.minnwestbank.com/apps/onlinebanking/#_frmLogin");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @Test(priority = 1)
    public void setusername1() throws InterruptedException {
        OLB_page page = new OLB_page(driver);
        page.setUsername1("Aswiniroy@7");
        Thread.sleep(2000);

    }

    @Test(priority = 2)
    public void setpassword() throws InterruptedException {
        OLB_page page = new OLB_page(driver);
        page.setPassword1("Aswiniroy@7");
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void setBut1() throws InterruptedException {
        OLB_page page = new OLB_page(driver);
        page.setButton1();
        Thread.sleep(3000);
    }

    @Test(priority = 4)
    public void setham1() throws InterruptedException {
        OLB_page page = new OLB_page(driver);
        page.setHamburger();
        Thread.sleep(3000);
    }

    @Test(priority = 5)
    public void setmes1() throws InterruptedException {
        OLB_page page = new OLB_page(driver);
        page.setMessage();
        Thread.sleep(3000);
    }

    @Test(priority = 6)
    public void setMy1() throws InterruptedException {
        OLB_page page = new OLB_page(driver);
        page.setMy();
        Thread.sleep(3000);
    }

    @Test(priority = 7)
    public void setcom1() throws InterruptedException {
        OLB_page page = new OLB_page(driver);
        page.setCompose();
        Thread.sleep(3000);
    }

    @Test(priority = 8)
    public void setCat() throws InterruptedException{
        OLB_page page = new OLB_page(driver);
        page.setSelect();
        Thread.sleep(5000);
    }

    @Test(priority = 9)
    public void setCat1() throws InterruptedException{
        OLB_page page = new OLB_page(driver);
        page.setSelect1();
        Thread.sleep(3000);
    }

    @Test(priority = 10)
    public void setSub1() throws InterruptedException{
        OLB_page page = new OLB_page(driver);
        page.setSub("I am unable to reach for the customer service");
        Thread.sleep(3000);
    }

    @Test(priority = 11)
    public void setDes1() throws InterruptedException{
        OLB_page page = new OLB_page(driver);
        page.setDes("I am unable to call the customer care service and I hope if you will solve this for me");
        Thread.sleep(3000);
    }

    @Test(priority = 12)
    public void setSend1() throws InterruptedException{
        OLB_page page = new OLB_page(driver);
        page.setSend();
        Thread.sleep(6000);

    }
    @AfterTest
    public void aftertest() {
        driver.quit();
    }
}




