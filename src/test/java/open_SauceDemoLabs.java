import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_SauceDemoLabs {
ca
    public static void main (String[]args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.xpath("//div[text() = \"Sauce Labs Backpack\"]")).click();
        driver.findElement((By.id("add-to-cart"))).click();
        driver.findElement(By.xpath("//a[contains(@class,'shopping_cart')]")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("dhruv");
        driver.findElement(By.id("last-name")).sendKeys("Airan");
        driver.findElement(By.id("postal-code")).sendKeys("151502");
        driver.findElement(By.name("continue")).click();
        driver.findElement(By.id("finish")).click();

        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.xpath("//a[contains(@id,\"logout\")]")).click();
    }
}
