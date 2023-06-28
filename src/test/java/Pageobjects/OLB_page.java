package Pageobjects;


import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OLB_page {

    WebDriver driver;

    public OLB_page(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.xpath("//input[@aria-placeholder=\"Username\"]");

    public void setUsername1(String usernameolb) {
        driver.findElement(username).sendKeys(usernameolb);
    }

    By password = By.xpath("//input[@aria-placeholder=\"Password\"]");

    public void setPassword1(String passwordolb) {
        driver.findElement(password).sendKeys(passwordolb);
    }

    By button = By.xpath("//label[@aria-label=\"Log in\"]");

    public void setButton1() {
        driver.findElement(button).click();
    }

    By hamburger = By.xpath("//img[@alt=\"Hamburger Menu\"]");

    public void setHamburger() {
        driver.findElement(hamburger).click();
    }

    By message = By.xpath("(//div[@class=\"skncursor\"])[20]");

    public void setMessage() {
        driver.findElement(message).click();
    }

    By my = By.xpath("//label[text()='My Messages'] ");

    public void setMy() {
        driver.findElement(my).click();
    }

    By compose = By.xpath("//label[text()='Compose New Message']");

    public void setCompose() {
        driver.findElement(compose).click();
    }

    By category = By.xpath("//select[@class=\"-kony-ca-middleleft sknListboxBOrdere3e3e32pxRadius\"]");

    public void setSelect() {
        driver.findElement(category).click();


    }

    By category1 = By.xpath("//select[@class=\"-kony-ca-middleleft sknListboxBOrdere3e3e32pxRadius\"]");

    public void setSelect1() {
        WebElement drop = driver.findElement(category1);
        Select select1 = new Select(drop);
        select1.selectByVisibleText("Customer Service");
        //select1.selectByIndex(2);
    }

    By sub = By.xpath("//input[@aria-label=\"Enter Subject\"]");
    public void setSub(String Sub1){
        driver.findElement(sub).sendKeys(Sub1);
    }

    By des = By.xpath("//textarea[@aria-label=\"Enter Description\"]");
    public void setDes(String Des1){
        driver.findElement(des).sendKeys(Des1);
    }

    By send = By.xpath("//label[text( )='SEND']");
    public void setSend(){
        driver.findElement(send).click();
    }
}
