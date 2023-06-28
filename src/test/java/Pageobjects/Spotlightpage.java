package Pageobjects;

import Base.BaseTest;
import Base.BaseTest1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class Spotlightpage {

       WebDriver driver;

        public Spotlightpage(WebDriver driver){
            this.driver = driver;
        }
        //This is foremost imp thing when we work on the Page object model.
        //All the locators are there in this page object.

        //method 1: username

        By username = By.xpath("//*[@id=\"frmLogin_txtUserName\"]");

        public void setUsername(String username1){
            driver.findElement(username).sendKeys(username1);
        }

        //method 2: password

        By password = By.xpath("//*[@id=\"frmLogin_txtPassword\"]");

        public void setPassword(String password1){
            driver.findElement(password).sendKeys(password1);
        }

        //method 3: eye icon

        By eyeicon = By.xpath("//*[@id=\"frmLogin_lblEyecross\"]");

        public void clickicon(){
            driver.findElement(eyeicon).click();
        }

        //method 4: Remember me

        By checkbox = By.xpath("//*[@id=\"frmLogin_imgLoginRememberMe\"]");
        public void clickbox(){
            driver.findElement(checkbox).click();
        }

        By signin = By.xpath("//*[@id=\"frmLogin_btnLogin\"]");
        public void clicksignin(){
            driver.findElement(signin).click();
            takescreenshot();
        }

        public void takescreenshot(){

        }

    }



