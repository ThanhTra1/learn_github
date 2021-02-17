import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Step_definitions_Login_successfully {
    private final WebDriver driver = new ChromeDriver();
    private String userName;
    private  String passWord;

    @Given("^User opens the Demo page with the url as \"([^\"]*)\"$")
    public void user_opens_the_demo_page_with_the_url_as_something(String the_url) throws Throwable {
        driver.manage().window().maximize();
        driver.get(the_url);
        throw new PendingException();
    }

    @When("^User enters the email is \"([^\"]*)\"$")
    public void user_enters_the_email_is_something(String email) throws Throwable {
        WebElement email_element = driver.findElement(By.name("emailid"));
        email_element.sendKeys(email);
        throw new PendingException();
    }

    @When("^User opens the login page with the url as \"([^\"]*)\"$")
    public void user_opens_the_login_page_with_the_url_as_something(String the_login_page) throws Throwable {
        driver.get(the_login_page);
        throw new PendingException();
    }

    @Then("^User receives username$")
    public void user_receives_username() throws Throwable {
        WebElement userNameElement = driver.findElement(By.xpath("//td[@class='accpage' and text()= 'User ID :']//following-sibling::td"));
        userName = userNameElement.getText();
        throw new PendingException();
    }

    @Then("^Message displayed Welcome to Manager's Page of Guru99 Bank$")
    public void message_displayed_welcome_to_managers_page_of_guru99_bank() throws Throwable {
        WebElement message = driver.findElement(By.xpath("//marquee[contains(text() = 'Welcome To Manager's Page of Guru99 Bank')]"));
        System.out.print("11");
        throw new PendingException();
    }

    @And("^User clicks the Submit button$")
    public void user_clicks_the_submit_button() throws Throwable {
        WebElement buttonLogin = driver.findElement(By.name("btnLogin"));
        buttonLogin.click();
        throw new PendingException();
    }

    @And("^User receives password$")
    public void user_receives_password() throws Throwable {
        WebElement userNameElement = driver.findElement(By.xpath("//td[@class='accpage' and text()= 'Password :']//following-sibling::td"));
        userName = userNameElement.getText();
        throw new PendingException();
    }

    @And("^User enters username as \"([^\"]*)\"$")
    public void user_enters_username_as_something() throws Throwable {
        driver.findElement(By.name("uid")).sendKeys(userName);
        throw new PendingException();
    }

    @And("^User enters pass as \"([^\"]*)\"$")
    public void user_enters_pass_as_something() throws Throwable {
        driver.findElement(By.name("password")).sendKeys(passWord);
        throw new PendingException();
    }

    @And("^User clicks the Login button$")
    public void user_clicks_the_login_button() throws Throwable {
        WebElement buttonLogin = driver.findElement(By.name("btnLogin"));
        buttonLogin.click();
        throw new PendingException();
    }

}
