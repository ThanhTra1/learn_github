import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox_submitbutton {
    public static void main(String[] args) {
        //Setting up chrome using chromedriver by setting its property
        System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

        //Opening browser
        WebDriver driver = new ChromeDriver();

        //Opening window tab in maximize mode
        driver.manage().window().maximize();

        //Opening application
        driver.get("http://demo.guru99.com/");

        //Locating the email field element via Name tag (textbox)
        WebElement emailField = driver.findElement(By.name("emailid"));

        //Entering text into the email field
        emailField.sendKeys("trant@funtap.vn");

        // Locating the Submit button via name tag
        WebElement buttonLogin = driver.findElement(By.name("btnLogin"));

        // Click button
        buttonLogin.submit();
    }
}
