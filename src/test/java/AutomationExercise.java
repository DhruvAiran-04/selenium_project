import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutomationExercise {
    public static void main (String[]args){
        WebDriver driver= new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()=\" Signup / Login\"]")).click();
        driver.findElement(By.name("name")).sendKeys("dhruva");
        driver.findElement(By.xpath("(//input[@placeholder=\"Email Address\"])[2]")).sendKeys("dhruva@gmail.com");
        driver.findElement(By.xpath("//button[text()=\"Signup\"]")).click();

        //Waits
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1"))).click();

        driver.findElement(By.id("password")).sendKeys("1234");

        //dropdown
        WebElement day = driver.findElement(By.id("days"));
        Select sel = new Select(day);
        sel.selectByValue("8");

        WebElement month = driver.findElement(By.id("months"));
        Select sel1 = new Select(month);
        sel1.selectByVisibleText("May");

        WebElement year = driver.findElement(By.id("years"));
        Select sel2 = new Select(year);
        sel2.selectByVisibleText("2004");

        driver.findElement(By.id("newsletter")).click();

        driver.findElement(By.id("first_name")).sendKeys("Dhruv");
        driver.findElement(By.id("last_name")).sendKeys("Airan");
        driver.findElement(By.id("address1")).sendKeys("moon light high school,budhlada,mansa,punjab");
        WebElement country = driver.findElement(By.id("country"));
        Select selcountry = new Select(country);
        selcountry.selectByVisibleText("Canada");

        driver.findElement(By.id("state")).sendKeys("punjab");
        driver.findElement(By.id("city")).sendKeys("Budhlada");
        driver.findElement(By.id("zipcode")).sendKeys("151502");
        driver.findElement(By.id("mobile_number")).sendKeys("1234567890");
        driver.findElement(By.xpath("//button[text()=\"Create Account\"]")).click();

       driver.findElement(By.xpath("//a[text()=\"Continue\"]")).click();

    }
}
