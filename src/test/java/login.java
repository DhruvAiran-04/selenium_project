import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class login {
    public static void main(String[] args){
        WebDriver driver= new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()=\" Signup / Login\"]")).click();
        driver.findElement(By.xpath("(//input[@placeholder=\"Email Address\"])[1]")).sendKeys("dhruva@gmail.com");
        driver.findElement(By.name("password")).sendKeys("1234");
        driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
        WebElement ele = driver.findElement(By.xpath("//a[text()=\" Products\"]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("search_product")))).sendKeys("t-shirts");
        driver.findElement(By.id("submit_search")).click();
        WebElement product = driver.findElement(By.xpath("//a[text()=\"View Product\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(product)).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@type=\"button\"]")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//u[text()=\"View Cart\"]")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()=\"Proceed To Checkout\"]")))).click();
        WebElement scroll = driver.findElement(By.xpath("//a[text()=\"Place Order\"]"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("argumenets[0].scrollIntoView(true);" ,scroll);
        wait.until(ExpectedConditions.elementToBeClickable(scroll)).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("name_on_card")))).sendKeys("Dhruv");
        driver.findElement(By.name("card_number")).sendKeys("2004");
        driver.findElement(By.name("cvc")).sendKeys("311");
        driver.findElement(By.name("expiry_month")).sendKeys("May");
        driver.findElement(By.name("expiry_year")).sendKeys("2027");
        driver.findElement(By.id("submit")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()=\"Continue\"]")))).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()=\" Logout\"]")))).click();

        driver.quit();
    }
}
