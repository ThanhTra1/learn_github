import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_list {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://output.jsbin.com/osebed/2");
        // Tìm drop list element
        WebElement listFruitElement = driver.findElement(By.id("fruits"));
        // và khai báo nó là 1 Select
        Select listFruit = new Select(listFruitElement);

        // chọn banana by value
        listFruit.selectByValue("banana");


        //Chọn apple bằng Label
        listFruit.selectByVisibleText("Apple");

        // Xóa nước đã chọn bằng value
        listFruit.deselectByValue("banana");


        // check nếu drop list cho phép chọn multiple hay ko
        if(listFruit.isMultiple()){
            System.out.println("The drop-down element allows multiple selections at a time");
            // Chọn Grape bằng index
            listFruit.selectByIndex(3);
        }
        // bo chon tat ca
        listFruit.deselectAll();
    }
}
