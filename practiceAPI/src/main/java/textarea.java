import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textarea {
    public static void main(String[] args) {
        //Setting up chrome using chromedriver by setting its property
        System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

        //Opening browser
        WebDriver driver = new ChromeDriver();

        //Opening window tab in maximize mode
        driver.manage().window().maximize();
        //Opening application
        driver.get("http://demo.guru99.com/v4/manager/addcustomerpage.php");
        // Locating the Address field via xpath (textarea)
        WebElement addressFiled = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/textarea[1]"));
        // Enter text into the textarea
        addressFiled.sendKeys("test123");
        //clear data
        addressFiled.clear();
        // enter text again
        addressFiled.sendKeys("Test 2 \n 13r4w");
        System.out.print("Thong tin da nhap la : "+addressFiled.getText());
    }



}
