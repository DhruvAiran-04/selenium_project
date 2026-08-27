import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class multipleWindows {
   public static void main(String[]args){
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in/");
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));Sj
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
       driver.findElement(By.id("nav-search-submit-button")).click();
       String parentWindow = driver.getWindowHandle();
       driver.findElement(By.xpath("//span[text()=\"EVA Lite Sport Shoes Running Shoes for Men- Grey\"]")).click();
       Set<String> windows = driver.getWindowHandles();
       for(String window : windows){
           if(!window.equalsIgnoreCase(parentWindow)){
               driver.switchTo().window(window);
               break;
           }
       }
       driver.findElement(By.id("add-to-cart-button")).click();
   }

}
