import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
    public static void main(String[] args) {

        //Setting up chrome using chromedriver by setting its property
       // System.setProperty("webdriver.chrome.driver", "D:\\Webdriver\\chromedriver.exe");

        //Opening browser
        WebDriver driver = new ChromeDriver();

        //Opening window tab in maximize mode
        driver.manage().window().maximize();

        //Opening application
        driver.get("http://demo.guru99.com/");

        //Locating the email field element via Name tag and storing it in the webelement
        WebElement email_field = driver.findElement(By.name("emailid"));

        //Entering text into the email field
        email_field.sendKeys("sadhvisingh24@gmail.com");
    }
}
