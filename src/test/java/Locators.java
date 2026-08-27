import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
// ID Locator
        driver.findElement(By.id("small-searchterms")).sendKeys("Apple");

        // Class Locator
        driver.findElement(By.className("search-box-button")).click();


        // Name Locator
        //driver.findElement(By.name(""));

        // Link Text Locator
       // driver.findElement(By.linkText(""));

        // Partial Link Text Locator
         //driver.findElement(By.partialLinkText(""));

        // Tag Name Locator
        //driver.findElement(By.tagName(""));

        //remove all the windows
        //driver.quit();

        //remove only the current window
       // driver.close();
    }
}
