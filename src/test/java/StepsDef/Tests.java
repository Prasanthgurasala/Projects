package StepsDef;
import Config.PropertiesFile;
import Pages.Ticket;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Tests {

   public WebDriver driver = null;
   public static String browserName = null;
   public static String urlname = null;
   public static String dobdaynumber = null;
   public static String dobmonthnumber = null;
   public static String dobyearnumber = null;

   public Ticket ticketpage = new Ticket(driver);

    @Given("^user is on homepage$")
    public void user_is_on_homepage() {

        PropertiesFile.getProperties();

            if (browserName.equalsIgnoreCase("chrome")) {

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.get(urlname);
                driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
            }
            else if (browserName.equalsIgnoreCase("firefox")) {

                WebDriverManager.firefoxdriver().setup();
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
                driver.get(urlname);
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();

            }
        }

    @When("^I am a citizen of the UK$")
    public void i_am_a_citizen_of_the_UK() {

        Ticket ticketpage = new Ticket(driver);

        WebDriverWait wait=new WebDriverWait(driver, 20);

        ticketpage.clickStart();

        ticketpage.clickradioengland();
        ticketpage.btn_startnext();
        ticketpage.btn_radioyes();
        ticketpage.txt_dobday(dobdaynumber);
        ticketpage.txt_dobmonth(dobmonthnumber);
        ticketpage.txt_dobyear(dobyearnumber);
        ticketpage.btn_startnext();

    }

    @When("^I put my circumstances into the Checker tool$")
    public void i_put_my_circumstances_into_the_Checker_tool() {

        ticketpage.btn_radiono();
        ticketpage.btn_radiono();
        ticketpage.btn_radiono();
        ticketpage.btn_radiono();
        ticketpage.btn_radiono();
    }

    @Then("^I should get a result of whether I will get help or not$")
    public void i_should_get_a_result_of_whether_I_will_get_help_or_not() {


        driver.close();
        driver.quit();

    }


}
