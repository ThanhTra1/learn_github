
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.util.List;
public class stepDefinitions {
        private final WebDriver driver = new ChromeDriver();

        // private  String email;
        // private  String pass;
        @Given("^User open application  with the url \"([^\"]*)\"$")
        @Test
        public void user_open_application_with_the_url_something ()throws Throwable{
            driver.manage().window().maximize();
            driver.get("http://demo.guru99.com/");
            throw new PendingException();
        }

        @When("^User enters \\”([^\\”]*)\\” $")
        @Test
        public void user_enters() throws Throwable {
            WebElement IdEmail = driver.findElement(By.name("emailid"));
            IdEmail.sendKeys("trant@funtap.vn");
            throw new PendingException();
        }

    /*@When("^User opens the login page  with the url \"([^\"]*)\"$")
    @Test
    public void user_opens_the_login_page_with_the_url_something(String linkLogin) throws Throwable {
        driver.get(linkLogin);
        throw new PendingException();
    }

    @Then("^User receives access detail$")
    @Test
    public void user_receives_access_detail() throws Throwable {
        List<WebElement> list = driver.findElements(By.xpath("//td[@class='accpage']//following-sibling::td"));
        email = list.get(0).getText();
        pass = list.get(1).getText();
        throw new PendingException();
    }

    @Then("^Message displayed Welcome to Manager's Page of Guru99 Bank$")
    @Test
    public void message_displayed_welcome_to_managers_page_of_guru99_bank() throws Throwable {

        throw new PendingException();
    }

    @And("^User click submit button$")
    public void user_click_submit_button() throws Throwable {
        WebElement buttonLogin = driver.findElement(By.name("btnLogin"));
        buttonLogin.click();
        throw new PendingException();
    }
    @And("^User enters Username $")
    @Test
    public void user_enters_username() throws Throwable {
        WebElement username = driver.findElement(By.name("uid"));
        username.sendKeys(email);
        throw new PendingException();
    }

    @And("^User enters pass $")
    public void user_enters_pass() throws Throwable {
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(pass);
        throw new PendingException();
    }
    @And("^User click login button$")
    public void user_click_login_button() throws Throwable {
        WebElement buttonLogin = driver.findElement(By.name("btnLogin"));
        buttonLogin.click();
        throw new PendingException();
    }*/


}
