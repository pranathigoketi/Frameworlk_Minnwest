package Pageobjects;

import Base.BaseTest1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Messages extends BaseTest1 {

    //WebDriver driver;
    public Messages(WebDriver driver) {
        this.driver = driver;

    }

    By navigate = By.xpath("//div[text()='Messages']");
    public void setNavigate() {
        driver.findElement(navigate).click();
    }

    By newmessage = By.xpath("//*[@id=\"frmCSR_mainHeader_btnDropdownList\"]");
    public void setnew() {
        driver.findElement(newmessage).click();
    }


    By compose = By.xpath("//*[@id=\"frmCSR_Message_txtTo\"]");

    public void setCompose2(String compose1) {
        driver.findElement(compose).sendKeys(compose1);
    }

    By userid = By.xpath("//*[@id=\"flxsegCustomerGroup_flxUserName\"]");

    public void setUserid() {
        driver.findElement(userid).click();
    }

    By subject = By.xpath("//*[@id=\"frmCSR_Message_txtSubject\"]");

    public void setSubject(String subject1) {
        driver.findElement(subject).sendKeys(subject1);
    }

    By cat = By.xpath("//*[@id=\"frmCSR_Message_lstbocCategory\"]");

    public void setCat() {
        WebElement drop = driver.findElement(cat);
        Select select = new Select(drop);
        //select.selectByValue("RCID_CREDITCARD");
        //select.selectByIndex(4);
        select.selectByVisibleText("Credit Cards");
    }

    By tem = By.xpath("//*[@id=\"frmCSR_Message_lstboxMail\"]");

    public void settemp() {
        WebElement dropdown = driver.findElement(tem);
        Select select = new Select(dropdown);
        select.selectByVisibleText("Minnwest(Test)");
    }

    //By edit = By.xpath("//*[@id=\"iframe_rtxMessage\"]");

    public void seteditor() {

        driver.switchTo().frame("rtxMessage");
        WebElement message = driver.findElement(By.xpath("//div[text()='This is dummy template hghghg']"));
        message.clear();
        message.sendKeys("Hola, I am facing blocking issue for my card");
        driver.switchTo().defaultContent();
    }

    By button = By.xpath("//*[@id=\"frmCSR_Message_btnsave\"]");
    public void setButton1(){
        driver.findElement(button).click();
    }



}

