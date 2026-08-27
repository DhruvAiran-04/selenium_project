import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        Select sel = new Select(driver.findElement(By.id("dropdown")));
        sel.selectByVisibleText("Option 2");

        sel.selectByIndex(2);
    }
}