package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ticket {

    WebDriver driver;

    By btn_start = By.id("next-button");
    By btn_radiobtnengland = By.id("radio-england");
    By btn_radiobtnscotland = By.id("radio-scotland");
    By btn_radiobtnwales = By.id("radio-wales");
    By btn_radiobtnnire = By.id("radio-nire");

    By btn_startnext = By.id("next-button");

    By btn_radioyes = By.id("radio-yes");
    By btn_radiono = By.id("radio-no");


    By txt_dobday = By.id("dob-day");
    By txt_dobmonth = By.id("dob-month");
    By txt_dobyear = By.id("dob-year");


    public Ticket(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(btn_start).click();
    }
    public void clickradioengland(){
        driver.findElement(btn_radiobtnengland).click();
    }

    public void btn_radioscotland(){


        driver.findElement(btn_radiobtnscotland).click();
    }

    public void btn_radiobtnwales()

    {
        driver.findElement(btn_radiobtnwales).click();

    }

    public void btn_radiobtnnire(){
        driver.findElement(btn_radiobtnnire).click();
    }
    public void btn_startnext(){
        driver.findElement(btn_startnext).click();
    }

    public void btn_radioyes(){
        driver.findElement(btn_radioyes).click();
    }

    public void btn_radiono(){
        driver.findElement(btn_radiono).click();
    }
    public void txt_dobday(String dobday){
        driver.findElement(txt_dobday).sendKeys("dobday");
    }

    public void txt_dobmonth(String dobmonth){
        driver.findElement(txt_dobmonth).sendKeys(dobmonth);
    }
    public void txt_dobyear(String dobyear){
        driver.findElement(txt_dobyear).sendKeys(dobyear);
    }
}
